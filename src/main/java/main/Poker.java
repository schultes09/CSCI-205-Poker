/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Jake Etzler
 * Section: 01 - 8:30
 * Date: 11/8/21
 * Time: 9:19 AM
 *
 * Project: csci205_final_project
 * Package: main
 * Class: Main
 *
 * Description: Hello World!
 *
 * ****************************************
 */
package main;

public class Poker {

    // Basic main class for simple testing
    public static void main(String[] args){

        Hand[] hands = new Hand[2];
        Deck deck = new Deck();
        Card[] pot = new Card[5];

        deck.shuffle();

        for (int i = 0; i < 5; i++) {
            pot[i] = deck.deal();
        }


        for (int p = 0; p < 2; p++) {
            Hand hand = new Hand(deck.deal(), deck.deal());
            hands[p] = hand;
        }

        for (Card c : pot) {
            System.out.println(c.getCard());
        }




    }

    public void checkHand(Hand hand) {

    }
}
