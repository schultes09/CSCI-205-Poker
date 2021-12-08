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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

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

    private Card player1Card1;
    private Card player1Card2;
    private Card player2Card1;
    private Card player2Card2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            deckSpecial = new Deck();
            deckSpecial.shuffle();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        Card player1Card1 = deckSpecial.dealTopCard(0);
        Card player1Card2 = deckSpecial.dealTopCard(2);
        player1 = new Hand(player1Card1, player1Card2);

        Card player2Card1 = deckSpecial.dealTopCard(1);
        Card player2Card2 = deckSpecial.dealTopCard(3);
        player2 = new Hand(player2Card1,player2Card2 );
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
                if (player1Combined.findRank() == 9){
                    if (player1Combined.pairTie() > player2Combined.pairTie()){
                        textWinner.setText("Player 1 wins with the higher pair");
                    }
                    else if (player2Combined.pairTie() > player1Combined.pairTie()){
                        textWinner.setText("Player 2 wins with the higher pair");
                    }
                    else{
                        if(player1Card1.value > player2Card2.value && player1Card1.value > player2Card1.value){
                            textWinner.setText("Player 1 wins with high card after a pair");
                        }
                        else if(player2Card1.value > player1Card2.value && player2Card1.value > player1Card1.value){
                            textWinner.setText("Player 2 wins with high card after a pair");
                        }
                        else{
                            textWinner.setText("Tie");
                        }
                    }
                }
                //textWinner.setText("Tie: " + player1Combined.findNameRank());
            }
            else
            {
                System.out.println("Player 2 wins");
                textWinner.setText("Player 2 Wins: " + player2Combined.findNameRank());
            }

        });
    }

}