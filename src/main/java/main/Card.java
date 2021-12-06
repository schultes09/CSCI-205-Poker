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
 * Class: Card
 *
 * Description:
 *
 * ****************************************
 */
package main;


import javafx.scene.image.Image;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.Parent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;


public class Card implements Comparable{

    public int value;
    public int suit;
    private Image image;

    public Card(int suit, int value) throws FileNotFoundException, URISyntaxException {
        this.value = value;
        this.suit = suit;
        String fileName = value + "," + suit + ".PNG";
        URL url = Card.class.getResource("/images/"+fileName);
        File f = new File(url.toURI());
        InputStream in = new FileInputStream(f);
        image = new Image(in);

        Rectangle rec = new Rectangle(80, 100);
        rec.setArcWidth(20);
        rec.setArcHeight(20);
        rec.setFill(Color.WHITE);

        Text txt = new Text(toString());
        txt.setWrappingWidth(70);

    }

    public String getCard(){
        return this.suit + " " + this.value;
    }

    public String getImageCard(){
        return this.suit + "," + this.value + ".PNG";
    }

    /**
     * Function to translate suit int to String
     *
     * @return String representation of Suit
     */
    public String getSuitString() {
        String suitString = "";
        switch (this.suit) {
            case 1:
                suitString = "Clubs";
                break;
            case 2:
                suitString = "Diamonds";
                break;
            case 3:
                suitString = "Hearts";
                break;
            case 4:
                suitString = "Spades";
                break;
        }
        return suitString;
    }


    public Image getImage() {
        return image;
    }

    public int getValue(){
        return this.value;
    }

    @Override
    public String toString() {
//        if (this.value == 1){
//            return "Ace of " + this.getSuitString();
//        }
//        else if (this.value == 11){
//            return "Jack of " + this.getSuitString();
//        }
//        else if (this.value == 12){
//            return "Queen of " + this.getSuitString();
//        }
//        else if (this.value == 13){
//            return "King of " + this.getSuitString();
//        }
//        else {
            return this.value + "," + this.suit;
//        }
    }



    /**
     * @param other - other Card object to be compared
     * @return - int designating which Object has a higher value
     */

    public int compareTo(Card other) {
        int compRank = (other).getValue();
        return this.value-compRank;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
