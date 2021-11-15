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

    public Card[] deck;

    int count = 0;
    public Deck() {
        for (int s = 1; s <= 4; s++) {
            for (int v = 1; v <= 13; s++) {
                Card newCard = new Card(s, v);
            }
        }
    }
}
