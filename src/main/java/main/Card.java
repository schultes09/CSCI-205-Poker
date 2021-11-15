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



public class Card implements Comparable<Card>{
   /* public final static int ACE = 1;
    public final static int KING = 13;
    public final static int QUEEN = 12;
    public final static int JACK = 11;*/

    public int value;
    public int suit;

    public Card(int suit, int value){
        this.value = value;
        this.suit = suit;
    }

    public String getCard(){
        return this.suit + " " + this.value;
    }

    /*public void setCardValue(int cardValue){
        if (cardValue>10 && cardValue<14){
            value = 10;
        }
        else if (cardValue == 14){
            value = 11;
        }
        else {
            value = cardValue;
        }
    }*/

    /**
     * @param other - other Card object to be compared
     * @return - int designating which Object has a higher value
     */
    @Override
    public int compareTo(Card other) {
        if (this.value > other.value) {
            return 1;
        } else if (this.value < other.value) {
            return -1;
        }
        return 0;
    }

}
