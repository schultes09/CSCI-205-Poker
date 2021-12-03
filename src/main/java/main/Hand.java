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

    @Override
    public String toString() {
        return this.hand.toString();
    }
}