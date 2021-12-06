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
    private Text textWinner;
    @FXML
    private Button playerTwo;
    @FXML
    private Button hide;
    @FXML
    private Button flop;
    @FXML
    private Button flop2;
    @FXML
    private Button flop3;
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

    private Deck deckSpecial;

    private Hand hand;
    private Card card;

    private Hand player1;
    private Hand player2;
    private Hand table;

    private CompareHands player1Combined;
    private CompareHands player2Combined;

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

        player1 = new Hand(deckSpecial.dealTopCard(0), deckSpecial.dealTopCard(2));
        player2 = new Hand(deckSpecial.dealTopCard(1), deckSpecial.dealTopCard(3));
        table = new Hand(deckSpecial.dealTopCard(5), deckSpecial.dealTopCard(6), deckSpecial.dealTopCard(7), deckSpecial.dealTopCard(9), deckSpecial.dealTopCard(11));


        player1Combined = new CompareHands(player1, table);
        player2Combined = new CompareHands(player2, table);



        cardOne.setImage(deckSpecial.getBackOfCard());
        cardTwo.setImage(deckSpecial.getBackOfCard());
        cardThree.setImage(deckSpecial.getBackOfCard());
        cardFour.setImage(deckSpecial.getBackOfCard());
        cardFive.setImage(deckSpecial.getBackOfCard());
        cardSix.setImage(deckSpecial.getBackOfCard());
        cardSeven.setImage(deckSpecial.getBackOfCard());
        int x = 69;

            nextPlayerCardBtn();
            playerTwoBtn();
            hideBtn();


    }

    @FXML
    public void nextPlayerCardBtn(){
        this.cardBtn.setOnAction(event -> {

            //System.out.println(deck.getDECK_SIZE());
            this.cardSix.setImage(deckSpecial.dealTopCard(0).getImage());
            this.cardSeven.setImage(deckSpecial.dealTopCard(2).getImage());
        });

    }

    @FXML
    public void playerTwoBtn(){
        this.playerTwo.setOnAction(event -> {

            this.cardSix.setImage(deckSpecial.dealTopCard(1).getImage());
            this.cardSeven.setImage(deckSpecial.dealTopCard(3).getImage());
        });
    }

    @FXML
    public void hideBtn(){
        this.hide.setOnAction(event -> {

            this.cardSix.setImage(deckSpecial.getBackOfCard());
            this.cardSeven.setImage(deckSpecial.getBackOfCard());
        });
    }

    @FXML
    public void flopBtn() {
        this.flop.setOnAction(event -> {

            this.cardOne.setImage(deckSpecial.dealTopCard(5).getImage());
            this.cardTwo.setImage(deckSpecial.dealTopCard(6).getImage());
            this.cardThree.setImage(deckSpecial.dealTopCard(7).getImage());

        });
    }
    @FXML
    public void flop2Btn() {
        this.flop2.setOnAction(event -> {

            this.cardFour.setImage(deckSpecial.dealTopCard(9).getImage());

        });
    }
    @FXML
    public void flop3Btn() {
        this.flop3.setOnAction(event -> {
            this.cardFive.setImage(deckSpecial.dealTopCard(11).getImage());
            if (player1Combined.findRank() < player2Combined.findRank()){
                System.out.println("Player 1 wins");
                textWinner.setText("Player 1 Wins: " + player1Combined.findNameRank());
            }
            else if (player1Combined.findRank() == player2Combined.findRank()){
                System.out.println("Tie");
                textWinner.setText("Tie: " + player1Combined.findNameRank());
            }
            else
            {
                System.out.println("Player 2 wins");
                textWinner.setText("Player 2 Wins: " + player2Combined.findNameRank());
            }

        });
    }

}