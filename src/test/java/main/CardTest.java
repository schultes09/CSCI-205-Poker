package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void getCardValue() {
    }

    @Test
    void setCardValue() {
    }

    @Test
    void compareTo() {
        Card card1 = new Card(1, 12);
        Card card2 = new Card(3, 9);
        assertTrue(card1.compareTo(card2) == 1);

    }
}