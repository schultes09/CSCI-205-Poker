/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: YOUR NAME
 * Section: YOUR SECTION
 * Date: 12/1/2021
 * Time: 8:52 AM
 *
 * Project: csci205_final_project
 * Package: main
 * Class: Hand
 *
 * Description:
 *
 * ****************************************
 */
package main;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Hand extends ArrayList<Card> {

    //private final int HAND_SIZE = 2;

    //private Card[] hand = new Card[HAND_SIZE];
    private ArrayList<Card> hand;

    public Hand(){
        this.hand = new ArrayList<>(7);
    }

    public Hand(Card c1, Card c2) {
        this.hand = new ArrayList<>(2);
        this.hand.add(c1);
        this.hand.add(c2);
    }
    public Hand(Card c1, Card c2, Card c3, Card c4, Card c5){
        this.hand = new ArrayList<>(5);
        this.hand.add(c1);
        this.hand.add(c2);
        this.hand.add(c3);
        this.hand.add(c4);
        this.hand.add(c5);
    }

    public Hand(ArrayList<Card> a){
        this.hand = new ArrayList<>();
        this.hand.addAll(a);
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public void addCardToMyHand(Card newCard){
        this.hand.add(newCard);
    }

    public Card remove(){
        Card removed = this.hand.remove(0);
        return removed;
    }

    public int getSize(){
        return hand.size();
    }




    @Override
    public String toString() {
        return this.hand.toString();
    }
}
