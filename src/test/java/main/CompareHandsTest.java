package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class CompareHandsTest {

    @Test
    void findRank() throws FileNotFoundException, URISyntaxException {
        Card c1 = new Card(1,11);
        Card c2 = new Card(2,11);
        Card c3 = new Card(3, 4);
        Card c4 = new Card(2,4);
        Card c5 = new Card(2,1);
        Card c6 = new Card(1, 2);
        Card c7 = new Card(4, 6);
        Card c8 = new Card(2, 4);

        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        Hand h3 = new Hand(c3,c3,c5,c8,c6);

        CompareHands ch1 = new CompareHands(h1,h2);
        CompareHands ch2 = new CompareHands(h1,h3);

        assertEquals(8, ch1.findRank());
        assertEquals(4, ch2.findRank());

    }

    @Test
    void isRoyalFlush() throws FileNotFoundException, URISyntaxException {
        Card c1 = new Card(1,10);
        Card c2 = new Card(1,11);
        Card c3 = new Card(1, 12);
        Card c4 = new Card(1,13);
        Card c5 = new Card(1,1);
        Card c6 = new Card(4, 8);
        Card c7 = new Card(3, 11);
        Card c8 = new Card(2,5);

        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        Hand h3 = new Hand(c6,c5,c4,c7,c8);
        Hand h4 = new Hand(c3,c4,c6,c7,c8);

        CompareHands ch1 = new CompareHands(h1,h2);
        CompareHands ch2 = new CompareHands(h1,h3);
        CompareHands ch3 = new CompareHands(h1,h4);

        assertTrue(ch1.isRoyalFlush());
        assertFalse(ch2.isRoyalFlush());
        assertFalse(ch3.isRoyalFlush());
    }

    @Test
    void isStraightFlush() throws FileNotFoundException, URISyntaxException {
        Card c1 = new Card(1,1);
        Card c2 = new Card(1,2);
        Card c3 = new Card(1, 3);
        Card c4 = new Card(1,4);
        Card c5 = new Card(1,5);
        Card c6 = new Card(4, 8);
        Card c7 = new Card(3, 11);
        Card c8 = new Card(2,5);

        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        Hand h3 = new Hand(c6,c5,c4,c7,c8);
        Hand h4 = new Hand(c3,c4,c6,c7,c8);

        CompareHands ch1 = new CompareHands(h1,h2);
        CompareHands ch2 = new CompareHands(h1,h3);
        CompareHands ch3 = new CompareHands(h1,h4);

        assertTrue(ch1.isStraightFlush());
        assertFalse(ch2.isStraightFlush());
        assertFalse(ch3.isStraightFlush());
    }

    @Test
    void isFourOfAKind() throws FileNotFoundException, URISyntaxException {
        Card c1 = new Card(3,1);
        Card c2 = new Card(1,1);
        Card c3 = new Card(2, 3);
        Card c4 = new Card(1,1);
        Card c5 = new Card(2,5);
        Card c6 = new Card(4, 1);
        Card c7 = new Card(3, 11);
        Card c8 = new Card(2,9);

        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        Hand h3 = new Hand(c3,c5,c4,c7,c8);

        CompareHands ch1 = new CompareHands(h1,h2);
        CompareHands ch2 = new CompareHands(h1,h3);

        assertTrue(ch1.isFourOfAKind());
        assertFalse(ch2.isFourOfAKind());
    }

    @Test
    void isFullHouse() throws FileNotFoundException, URISyntaxException {
        Card c1 = new Card(3,1);
        Card c2 = new Card(1,1);
        Card c3 = new Card(2, 3);
        Card c4 = new Card(1,3);
        Card c5 = new Card(2,5);
        Card c6 = new Card(4, 3);
        Card c7 = new Card(3, 11);
        Card c8 = new Card(2,9);

        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        Hand h3 = new Hand(c3,c5,c4,c7,c8);

        CompareHands ch1 = new CompareHands(h1,h2);
        CompareHands ch2 = new CompareHands(h1,h3);

        assertTrue(ch1.isFullHouse());
        assertFalse(ch2.isFullHouse());
    }

    @Test
    void isFlush() throws FileNotFoundException, URISyntaxException {
        Card c1 = new Card(1,1);
        Card c2 = new Card(1,2);
        Card c3 = new Card(2, 3);
        Card c4 = new Card(1,4);
        Card c5 = new Card(2,5);
        Card c6 = new Card(1, 8);
        Card c7 = new Card(1, 11);
        Card c8 = new Card(2,9);

        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        Hand h3 = new Hand(c3,c5,c4,c7,c8);

        CompareHands ch1 = new CompareHands(h1,h2);
        CompareHands ch2 = new CompareHands(h1,h3);

        assertTrue(ch1.isFlush());
        assertFalse(ch2.isFlush());
    }

    @Test
    void isStraight() throws FileNotFoundException, URISyntaxException {
        Card c1 = new Card(1,1);
        Card c2 = new Card(2,2);
        Card c3 = new Card(3, 3);
        Card c4 = new Card(2,4);
        Card c5 = new Card(2,5);
        Card c6 = new Card(1, 8);
        Card c7 = new Card(4, 11);
        Card c8 = new Card(2,9);
        Card c9 = new Card(3, 10);
        Card c10 = new Card(1, 12);

        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        Hand h3 = new Hand(c3,c5,c6,c7,c8);
        Hand h4 = new Hand(c6,c7,c8,c9,c10);


        CompareHands ch1 = new CompareHands(h1,h2);
        CompareHands ch2 = new CompareHands(h1,h3);
        CompareHands ch3 = new CompareHands(h1,h4);

//        System.out.println("CH1 " + ch1);
//        System.out.println("is ch1 a straight? : " + ch1.isStraight());
//        System.out.println("CH2 "+ch2);
//        System.out.println("is ch2 a straight? : " + ch2.isStraight());
//        System.out.println("CH3 "+ch3);
//        System.out.println("is ch3 a straight? : " + ch3.isStraight());

        assertTrue(ch1.isStraight());
        assertFalse(ch2.isStraight());
    }

    @Test
    void isThreeOfAKind() throws FileNotFoundException, URISyntaxException {
        Card c1 = new Card(1,3);
        Card c2 = new Card(2,11);
        Card c3 = new Card(3, 4);
        Card c4 = new Card(2,4);
        Card c5 = new Card(2,1);
        Card c6 = new Card(1, 2);
        Card c7 = new Card(4, 6);
        Card c8 = new Card(2,4);

        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        Hand h3 = new Hand(c1,c8);

        CompareHands ch1 = new CompareHands(h1,h2);
        CompareHands ch2 = new CompareHands(h2,h3);

        assertFalse(ch1.isThreeOfAKind());
        assertTrue(ch2.isThreeOfAKind());
    }

    @Test
    void isTwoPair() throws FileNotFoundException, URISyntaxException {
        Card c1 = new Card(1,11);
        Card c2 = new Card(2,11);
        Card c3 = new Card(3, 7);
        Card c4 = new Card(2,4);
        Card c5 = new Card(2,1);
        Card c6 = new Card(1, 2);
        Card c7 = new Card(4, 4);
        Card c8 = new Card(3,12);

        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        Hand h3 = new Hand(c3,c5,c6,c7,c8);

        CompareHands ch1 = new CompareHands(h1,h2);
        CompareHands ch2 = new CompareHands(h1,h3);

        assertTrue(ch1.isTwoPair());
        assertFalse(ch2.isTwoPair());
    }

    @Test
    void isOnePair() throws FileNotFoundException, URISyntaxException {
        Card c1 = new Card(1,3);
        Card c2 = new Card(2,11);
        Card c3 = new Card(3, 4);
        Card c4 = new Card(2,4);
        Card c5 = new Card(2,1);
        Card c6 = new Card(1, 2);
        Card c7 = new Card(4, 6);
        Card c8 = new Card(2,8);

        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        Hand h3 = new Hand(c3,c5,c6,c7,c8);

        CompareHands ch1 = new CompareHands(h1,h2);
        CompareHands ch2 = new CompareHands(h1,h3);

        assertTrue(ch1.isOnePair());
        assertFalse(ch2.isOnePair());
    }
}