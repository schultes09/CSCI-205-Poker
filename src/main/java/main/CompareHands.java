/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Nick Johnston
 * Section: 01 - 8:30
 * Date: 11/17/2021
 * Time: 8:58 AM
 *
 * Project: csci205_final_project
 * Package: main
 * Class: CompareHand
 *
 * Description:
 *  * ****************************************
 */
package main;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareHands {
    private int rank;

    public Hand hand;
    /*
    Change to flop
     */
    public Hand dealerHand;
    public Hand combHand;

    public CompareHands(Hand hand, Hand dealerHand){
        this.dealerHand = dealerHand;
        this.hand = hand;
        buildCombHand();
        this.rank = findRank();
    }

    /**
     * Combines the flop hand and the players hand
     * Sorts the new hand for easier
     */
    private void buildCombHand() {
        ArrayList<Card> combHand = new ArrayList<>();
        combHand.addAll(this.hand);
        combHand.addAll(this.dealerHand);
        Collections.sort(combHand,
                Card::compareTo);
    }

    public int findRank(){
        if (isRoyalFlush()){
            return 1;
        }
        else if (isStraightFlush()){
            return 2;
        }
        else if (isFourOfAKind()){
            return 3;
        }
        else if (isFullHouse()){
            return 4;
        }
        else if (isFlush()){
            return 5;
        }
        else if (isStraight()){
            return 6;
        }
        else if (isThreeOfAKind()){
            return 7;
        }
        else if (isTwoPair()){
            return 8;
        }
        else if (isOnePair()){
            return 9;
        }
        else{
            return 10;
        }
    }

    //Maybe iterate and add 10,11,12,13,1 to a list then check if there's a straight flush
    public boolean isRoyalFlush(){
        //TODO
        if (!isStraightFlush()){
            return false;
        }

        return false;
    }

    /**
     * Iterates through the hand
     * Check if the suit of the next card is the same and if the value is one greater
     * @return true if the requirements above are met for at least 5 cards, otherwise false
     */
    public boolean isStraightFlush(){
        int numInRow = 0;
        for (int x = 0; x < this.combHand.size(); x++){
            if (this.combHand.get(x).value +1 == this.combHand.get(x+1).value){
                if(this.combHand.get(x).suit == this.combHand.get(x+1).suit){
                    numInRow++;
                }
            }
            else if(this.combHand.get(x).value == this.combHand.get(x+1).value){
                continue;
            }
            else{
                numInRow = 0;
            }
        }
        if (numInRow >= 5){
            return true;
        }
        return false;
    }

    /**
     * Iterates through the hand
     * @return true if four cards with the same value are detected
     */
    public boolean isFourOfAKind(){
        for (int x = 0; x < this.combHand.size(); x++){
            int numSameCards = 0;
            for (int i = 0; i< this.combHand.size(); x++){
                if (this.combHand.get(x).value == this.combHand.get(x).value){
                    numSameCards ++;
                }
            }
            if (numSameCards == 4){
                return true;
            }
        }

        return false;
    }

    public boolean isFullHouse(){
        //TODO
        return false;
    }

    /**
     * Iterates through the hand comparing each cards suit to the current card
     * @return true if 5 cards have the same suit, otherwise false
     */
    public boolean isFlush(){
        for (int x = 0; x < this.combHand.size(); x++){
            int numSameSuit = 0;
            for (int i = 0; i< this.combHand.size(); x++) {
                if (this.combHand.get(x).suit == this.combHand.get(i).suit) {
                    numSameSuit++;
                }
                if (numSameSuit == 5) {
                    return true;
                }
            }
        }


        return false;
    }

    /**
     * Iterates through the hand
     * If the value of the next card in the hand is not 1 greater than the
     * @return
     */
    public boolean isStraight(){
        int numInRow = 0;
        for (int x = 0; x < this.combHand.size(); x++){
            if (this.combHand.get(x).value +1 == this.combHand.get(x+1).value){
                numInRow ++;
            }
            else if(this.combHand.get(x).value == this.combHand.get(x+1).value){
                continue;
            }
            else if (this.combHand.get(x).value +1 != this.combHand.get(x+1).value){
                numInRow = 0;
            }
        }
        if (numInRow >= 5){
            return true;
        }
        return false;
    }

    /**
     * Iterates through the hand comparing each card to the current card
     * @return true if three of the same value cards are detected, otherwise false
     */
    public boolean isThreeOfAKind(){
        for (int x = 0; x < this.combHand.size(); x++){
            int numSameCards = 0;
            for (int i = 0; i< this.combHand.size(); x++) {
                if (this.combHand.get(x).value == this.combHand.get(x).value) {
                    numSameCards++;
                }
                if (numSameCards == 3) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Iterates through the hand comparing each card to the current card
     * @return true if two pairs of cards with the same value are detected, otherwise false
     */
    public boolean isTwoPair(){
        int numPair = 0;
        for (int x = 0; x < this.combHand.size(); x++){
            for (int i = 0; i< this.combHand.size(); x++){
                if (this.combHand.get(x).value == this.combHand.get(x).value){
                    numPair ++;
                }
            }
        }
        if (numPair >= 2){
            return true;
        }

        return false;
    }

    /**
     * Iterates through the hand comparing each card to the current card
     * @return true if two cards with the same value are detected, otherwise false
     */
    public boolean isOnePair(){
        for (int x = 0; x < this.combHand.size(); x++){
            for (int i = 0; i< this.combHand.size(); x++){
                if (this.combHand.get(x).value == this.combHand.get(x).value){
                    return true;
                }
            }
        }
        return false;
    }
}
