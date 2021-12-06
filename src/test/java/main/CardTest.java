package main;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void getCardValue() {
    }

    @Test
    void setCardValue() {
    }

    @Test
    void compareTo() throws FileNotFoundException, URISyntaxException {
        Card card1 = new Card(1, 12);
        Card card2 = new Card(3, 9);
        assertTrue(card1.compareTo(card2) == 1);

    }
}