package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareHandsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findRank() {
        Card c1 = new Card(1,11);
        Card c2 = new Card(2,11);
        Card c3 = new Card(3, 4);
        Card c4 = new Card(2,4);
        Card c5 = new Card(2,1);
        Card c6 = new Card(1, 2);
        Card c7 = new Card(4, 6);
        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        CompareHands ch1 = new CompareHands(h1,h2);
        assertTrue(ch1.findRank() == 8);

    }

    @Test
    void isRoyalFlush() {
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
//        System.out.println(ch1.combHand.getHand());
//        System.out.println(ch2.combHand.getHand());
//        System.out.println(ch3.combHand.getHand());
        assertTrue(ch1.isRoyalFlush() == true);
        assertTrue(ch2.isRoyalFlush() == false);
        assertTrue(ch3.isRoyalFlush() == false);
    }

    @Test
    void isStraightFlush() {
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
//        System.out.println(ch1.combHand.getHand());
//        System.out.println(ch2.combHand.getHand());
//        System.out.println(ch3.combHand.getHand());
        assertTrue(ch1.isStraightFlush() == true);
        assertTrue(ch2.isStraightFlush() == false);
        assertTrue(ch3.isStraightFlush() == false);
    }

    @Test
    void isFourOfAKind() {
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
        //System.out.println(ch1.combHand.getHand());
        assertTrue(ch1.isFourOfAKind() == true);
        //System.out.println(ch2.combHand.getHand());
        assertTrue(ch2.isFourOfAKind() == false);
    }

//    @Test
//    void isFullHouse() {
//        Card c1 = new Card(3,1);
//        Card c2 = new Card(1,1);
//        Card c3 = new Card(2, 3);
//        Card c4 = new Card(1,3);
//        Card c5 = new Card(2,5);
//        Card c6 = new Card(4, 3);
//        Card c7 = new Card(3, 11);
//        Card c8 = new Card(2,9);
//        Hand h1 = new Hand(c1,c2);
//        Hand h2 = new Hand(c3,c4,c5,c6,c7);
//        Hand h3 = new Hand(c3,c5,c4,c7,c8);
//        CompareHands ch1 = new CompareHands(h1,h2);
//        CompareHands ch2 = new CompareHands(h1,h3);
//        //System.out.println(ch1.combHand.getHand());
//        assertTrue(ch1.isFullHouse() == true);
//        //System.out.println(ch2.combHand.getHand());
//        assertTrue(ch2.isFullHouse() == false);
//    }

    @Test
    void isFlush() {
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
        //System.out.println(ch1.combHand.getHand());
        assertTrue(ch1.isFlush() == true);
        //System.out.println(ch2.combHand.getHand());
        assertTrue(ch2.isFlush() == false);
    }

    @Test
    void isStraight() {
        Card c1 = new Card(1,1);
        Card c2 = new Card(2,2);
        Card c3 = new Card(3, 3);
        Card c4 = new Card(2,4);
        Card c5 = new Card(2,5);
        Card c6 = new Card(1, 8);
        Card c7 = new Card(4, 11);
        Card c8 = new Card(2,9);
        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        Hand h3 = new Hand(c3,c5,c6,c7,c8);
        CompareHands ch1 = new CompareHands(h1,h2);
        CompareHands ch2 = new CompareHands(h1,h3);
        //System.out.println(ch1.combHand.getHand());
        assertTrue(ch1.isStraight() == true);
        //System.out.println(ch2.combHand.getHand());
        assertTrue(ch2.isStraight() == false);
    }

    @Test
    void isThreeOfAKind() {
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
        //System.out.println(ch2.combHand.getHand());
        assertTrue(ch1.isThreeOfAKind() == false);
        assertTrue(ch2.isThreeOfAKind() == true);
    }

    @Test
    void isTwoPair() {
        Card c1 = new Card(1,11);
        Card c2 = new Card(2,11);
        Card c3 = new Card(3, 4);
        Card c4 = new Card(2,4);
        Card c5 = new Card(2,1);
        Card c6 = new Card(1, 2);
        Card c7 = new Card(4, 6);
        Hand h1 = new Hand(c1,c2);
        Hand h2 = new Hand(c3,c4,c5,c6,c7);
        CompareHands ch1 = new CompareHands(h1,h2);
        assertTrue(ch1.isTwoPair() == true);
        Card c8 = new Card(3,12);
        Hand h3 = new Hand(c3,c5,c6,c7,c8);
        CompareHands ch2 = new CompareHands(h1,h3);
        assertTrue(ch2.isTwoPair() == false);
    }

    @Test
    void isOnePair() {
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
        assertTrue(ch1.isOnePair() == true);
        assertTrue(ch2.isOnePair() == false);
    }

    @Test
    void getRank() {
    }
}