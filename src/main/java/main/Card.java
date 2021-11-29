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


import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.Parent;

public class Card extends Parent{
   /* public final static int ACE = 1;
    public final static int KING = 13;
    public final static int QUEEN = 12;
    public final static int JACK = 11;*/

    public int value;
    public int suit;

    /**
     *
     *
     * @param suit int representation of card suit
     * @param value int representation of card value
     */
    public Card(int suit, int value){
        this.value = value;
        this.suit = suit;

        /*Rectangle rec = new Rectangle(80, 100);
        rec.setArcWidth(20);
        rec.setArcHeight(20);
        rec.setFill(Color.WHITE);

        Text txt = new Text(toString());
        txt.setWrappingWidth(70);

        getChildren().add(new StackPane(rec, txt));*/
    }

    public String getCard(){
        return this.suit + " " + this.value;
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
                suitString = "Hearts";
                break;
            case 2:
                suitString = "Diamonds";
                break;
            case 3:
                suitString = "Clubs";
                break;
            case 4:
                suitString = "Spades";
                break;
        }
        return suitString;
    }


    /**
     * @param other - other Card object to be compared
     * @return - int designating which Object has a higher value
     */
    public int compareTo(Card other) {
        if (this.value > other.value) {
            return 1;
        } else if (this.value < other.value) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return this.value + " of " + this.getSuitString();
    }
}
