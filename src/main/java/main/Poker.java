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
import java.sql.SQLOutput;
import java.util.Scanner;

public class Poker extends Application {
    //test
//    public static Player playerOne;
//    public static Player playerTwo;
//    public static Player playerThree;
//    public static Player playerFour;
    public static Hand playerZero;
    public static Hand player1;



    // Basic main class for simple testing
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
//        Card[][] game = new Card[4][2];
//        Deck deck = new Deck();
//        System.out.println(deck);
//

//
//        deck.shuffle();
//        for (int p = 0; p < 3; p++) {
//            for (int c = 0; c < 2; c++) {
//                game[p][c] = deck.deal();
//            }
////        }
//        //Hand player1;
//        Hand player2;
//        Deck deck = new Deck();
//        Flop flop = new Flop();
//
//        deck.shuffle();
//
//        player1 = new Hand(deck.deal(), deck.deal());
//
//        player2 = new Hand(deck.deal(), deck.deal());
//
//        for (int i = 0; i < 5; i++) {
//            flop.addCard(deck.deal());
//        }
//
//        flop.getFlop();
//
//
//        System.out.println("Test");
//        System.out.println(player1.getHand());
//
////         Scanner scan = new Scanner(System.in);
//////        String p1 = scan.nextLine();
//////        String p2 = scan.nextLine();
//////        String p3 = scan.nextLine();
////        String p4 = scan.nextLine();
//
//        System.out.println("test 2");
//
////        playerOne = new Player(p1);
////        playerTwo = new Player(p2);
////        playerThree = new Player(p3);
////        playerFour = new Player(p4);
//
//
//

        System.out.println("Welcome to our Poker game");
//        playerZero = new Hand();
//        playerZero.addCardToMyHand(deck.dealTopCard(0));
//
//        System.out.println(playerZero.getHand());
        launch(args);



//        System.out.println(game[1][0].getCard());
//        System.out.println(game[1][1].getCard());





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
