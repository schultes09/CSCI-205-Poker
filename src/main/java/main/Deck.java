/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Jake Etzler
 * Section: 01 - 8:30
 * Date: 11/11/21
 * Time: 4:20 PM
 *
 * Project: csci205_final_project
 * Package: main
 * Class: Deck
 *
 * Description:
 *
 * ****************************************
 */
package main;

import javafx.scene.image.Image;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Random;

/**
 * A class to represent a functioning deck of cards
 *
 * @author Jake Etzler, **add yourself when you work on it**
 */
public class Deck {

    private final int DECK_SIZE = 52;

    private final int SHUFFLE_COUNT = 1000;

    private Card[] deck = new Card[DECK_SIZE];
    private Random rng = new Random();

    public int getDECK_SIZE() {
        return DECK_SIZE;
    }

    private int dealIndex;

    private Image backOfCard;
    private Image frontOfCard;

    /**
     * Constructor for ordered deck of Card objects
     */
    public Deck() throws FileNotFoundException, URISyntaxException {
        this.dealIndex = 0;
        int count = 0;
        backOfCard = new Image("./images/backOfCard.png");
        for (int s = 1; s <= 4; s++) {
            for (int v = 1; v <= 13; v++) {
                Card newCard = new Card(s, v);
                deck[count] = newCard;
                count++;
            }
        }
    }

    public Image getBackOfCard() {
        return backOfCard;
    }


    public void setBackOfCard(Image backOfCard) {
        this.backOfCard = backOfCard;
    }

    public void setFrontOfCard(Card card1) throws FileNotFoundException, URISyntaxException {
        this.frontOfCard = new Image("./images/" + card1.getImageCard());
    }
    public Image getFrontOfCard() {
        return frontOfCard;
    }



    public Card dealTopCard(int i){
        return deck[i];
    }

    public void shuffle() {

        for (int i = 0; i < SHUFFLE_COUNT; i++) {
            int rNum1 = rng.nextInt(DECK_SIZE);
            int rNum2 = rng.nextInt(DECK_SIZE);

            Card tempCard = deck[rNum2];
            this.deck[rNum2] = deck[rNum1];
            this.deck[rNum1] = tempCard;
        }
    }

    public Card getIndex(int i) {
        return this.deck[i];
    }

    public Card deal() {
        Card temp = deck[dealIndex];
        dealIndex++;
        return temp;
    }

    /**
     * Method to shuffle the deck and reset the dealer index
     */
    public void resetDeck() {
        this.shuffle();
        this.dealIndex = 0;
    }



}
