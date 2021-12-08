package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @BeforeEach
    void setUp() throws FileNotFoundException, URISyntaxException {
        Deck deck = new Deck();
    }

    @Test
    void shuffle() {

    }
}