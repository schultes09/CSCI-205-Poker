/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Jake Etzler
 * Section: 01 - 8:30
 * Date: 11/8/21
 * Time: 9:19 AM
 *
 * Project: csci205_final_project
 * Package: main
 * Class: Main
 *
 * Description: Hello World!
 *
 * ****************************************
 */
package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Poker extends Application {
    //test

    // Basic main class for simple testing
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        Card[][] game = new Card[3][2];
        Deck deck = new Deck();
        System.out.println(deck);

        launch(args);

        deck.shuffle();
        for (int p = 0; p < 3; p++) {
            for (int c = 0; c < 2; c++) {
                game[p][c] = deck.deal();
            }
        }

        System.out.println(game[1][0].getCard());
        System.out.println(game[1][1].getCard());


        //System.out.println(game[2][0].getCard());
        //System.out.println(game[2][1].getCard());

    }

//    public void checkHand(Hand hand) {
//    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/DeckView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Deck");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
