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


    // Basic main class for simple testing
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {

        System.out.println("Welcome to our Poker game");

        launch(args);



    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/DeckView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Poker");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
