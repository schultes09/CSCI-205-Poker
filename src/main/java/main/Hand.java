package main;

enum HandType {
    HIGH_CARD,
    PAIR,
    TWO_PAIR,
    TOK,
    STRAIGHT,
    FLUSH,
    FHOUSE,
    FOAK,
    SFLUSH,
    RFLUSH
}


public class Hand {

    private final int HAND_SIZE = 2;

    private final HandType handType = HandType.HIGH_CARD;
    private Card[] hand = new Card[HAND_SIZE];

    public Hand(Card c1, Card c2) {
        this.hand[0] = c1;
        this.hand[1] = c2;
    }

    public Card[] getHand() {
        return hand;
    }
}