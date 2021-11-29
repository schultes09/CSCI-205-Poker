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

        Hand player1;
        Deck deck = new Deck();
        Flop flop = new Flop();

        deck.shuffle();

        for (int i = 0; i < 5; i++) {
            flop.addCard(deck.deal());
        }

        player1 = new Hand(deck.deal(), deck.deal());

        flop.getFlop();





    }



    public void checkHand(Hand hand) {

    }
}
