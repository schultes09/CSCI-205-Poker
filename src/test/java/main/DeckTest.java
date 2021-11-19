package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    private Deck deck;
    @BeforeEach
    void setUp() {
        deck = new Deck();
    }

    @Test
    void shuffle() {
        assertEquals(this.deck.getDECK_SIZE(), 52);

    }
}