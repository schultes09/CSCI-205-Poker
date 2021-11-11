/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Jake Etzler
 * Section: 01 - 8:30
 * Date: 11/11/21
 * Time: 4:20 PM
 *
 * Project: csci205_final_project
 * Package: main
 * Class: Card
 *
 * Description:
 *
 * ****************************************
 */
package main;

// TODO: I don't really know if we need the exception here
/**
 * Exception to be thrown if card conditions are incorrect
 */
class InvalidCardException extends Exception {
    public InvalidCardException(String message) { super(message); }
}


public class Card implements Comparable<Card>{

    // Assuming that the easiest way to internally differentiate cards is just with int representations of properties
    /** int to represent card suit */
    public int suit;

    /** int to represent card rank */
    public int rank;

    /**
     * Constructor to create a valid card
     *
     * @param suit - int between 1 and 4
     * @param rank - int between 1 and 13
     * @throws InvalidCardException - Exception thrown when invalid Card instance is being created
     */
    public Card(int suit, int rank) throws InvalidCardException{

        this.suit = suit;
        this.rank = rank;

        if ((suit < 1 || suit > 4) || (rank < 1 || rank > 13)) {
            String msg = "InvalidCardException: Card(): Card cannot exist";
            throw new InvalidCardException(msg);
        }

    }


    /**
     * compareTo function for determining card with higher rank
     *
     * @param other - Card to be compared with this card
     * @return - int that signifies which card is higher ranked
     */
    @Override
    public int compareTo(Card other) {
        if (this.rank > other.rank) {
            return 1;
        }
        else if (this.rank < other.rank) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
