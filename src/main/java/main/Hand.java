package main;



public class Hand {

    private final int HAND_SIZE = 2;

    private Card[] hand = new Card[HAND_SIZE];

    public Hand(Card c1, Card c2) {
        this.hand[0] = c1;
        this.hand[1] = c2;
    }

    public Card[] getHand() {
        return hand;
    }
}