package main;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PokerApp extends Application {

    private Deck dck = new Deck();

    private Hand player1;

    private Card[] flop = new Card[5];

    private Text txt = new Text();

    private HBox flopCards = new HBox(20);
    private HBox playerCards = new HBox(20);


    private Parent createContent() {
        player1 = new Hand(playerCards.getChildren());
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.setTitle("Poker!");
        primaryStage.show();
    }


}
