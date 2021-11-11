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
 * Class: Deck
 *
 * Description:
 *
 * ****************************************
 */
package main;

/**
 * A class to represent a functioning deck of cards
 *
 * @author Jake Etzler, **add yourself when you work on it**
 */
public class Deck {

    /** Size of a deck of cards */
    private final int DECK_SIZE = 52;

    Card[] deck = new Card[DECK_SIZE];

    /**
     * Constructor to build a deck of valid cards
     *
     * @throws InvalidCardException - Exception thrown if invalid card is trying to be created
     */
    public Deck() throws InvalidCardException {

        int i = 0;
        for (int s = 1; s <= 4; s++) {
            for (int r = 1; r <= 13; r++) {
                Card card = new Card(s, r);
                deck[i] = card;
                i++;
            }
        }
    }
}
