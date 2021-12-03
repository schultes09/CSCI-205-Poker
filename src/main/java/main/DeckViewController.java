/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: YOUR NAME
 * Section: YOUR SECTION
 * Date: 11/29/2021
 * Time: 8:43 PM
 *
 * Project: csci205_final_project
 * Package: main
 * Class: DeckViewController
 *
 * Description:
 *
 * ****************************************
 */
package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class DeckViewController implements Initializable {
    @FXML
    private Button cardBtn;
    @FXML
    private ImageView cardOne;
    @FXML
    private ImageView cardTwo;
    @FXML
    private ImageView cardThree;
    @FXML
    private ImageView cardFour;
    @FXML
    private ImageView cardFive;
    @FXML
    private ImageView cardSix;
    @FXML
    private ImageView cardSeven;

    private Deck deck;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Deck deck = null;
        try {
            deck = new Deck();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        cardOne.setImage(deck.getBackOfCard());
        cardTwo.setImage(deck.getBackOfCard());
        cardThree.setImage(deck.getBackOfCard());
        cardFour.setImage(deck.getBackOfCard());
        cardFive.setImage(deck.getBackOfCard());
        cardSix.setImage(deck.getBackOfCard());
        cardSeven.setImage(deck.getBackOfCard());
    }

//    @FXML
//    public void nextPlayerCardsBtn(){
//        Card new1 = deck.dealTopCard();
//        this.cardOne.setImage(deck.setFrontOfCard(new1));
//        this.cardTwo.setImage(deck.dealTopCard().getImage());
//        this.cardThree.setImage(deck.dealTopCard().getImage());
//        this.cardFour.setImage(deck.dealTopCard().getImage());
//        this.cardFive.setImage(deck.dealTopCard().getImage());
//        this.cardSix.setImage(deck.dealTopCard().getImage());
//        this.cardSeven.setImage(deck.dealTopCard().getImage());
//
//    }
}