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


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareHands {
    private int rank;
    /**
     * DECLARED AS ARRAYLIST TO TEST, WILL BE CHANGED TO HAND LATER ON
     */
    public Hand hand;
    public Hand dealerHand;
    public Hand combHand;

    public CompareHands(Hand hand, Hand dealerHand){

        this.dealerHand = dealerHand;
        this.combHand = Collections.singletonList(this.hand.addAll(this.dealerHand));
        this.rank = findRank();
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

    public boolean isRoyalFlush(){
        //TODO
        if (!isFlush()){
            return false;
        }

        return false;
    }

    public boolean isStraightFlush(){
        //TODO
        if (isFlush() && isStraight()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFourOfAKind(){
        //TODO
        if (this.combHand.size() < 4){
            return false;
        }

        return false;
    }

    public boolean isFullHouse(){
        if (this.combHand.size() < 5){
            return false;
        }

        return false;
    }

    public boolean isFlush(){
        if (this.combHand.size() < 5){
            return false;
        }

        return false;
    }

    public boolean isStraight(){
        if (this.combHand.size() < 5){
            return false;
        }

        return false;
    }

    public boolean isThreeOfAKind(){
        if (this.combHand.size() < 3){
            return false;
        }

        return false;
    }

    public boolean isTwoPair(){
        if (this.combHand.size() < 4){
            return false;
        }

        return false;
    }

    public boolean isOnePair(){
        //TODO
        for (int x = 0; x < this.combHand.size(); x++){
            for (int i = 0; i< this.combHand.size(); x++){
                if (this.combHand[x].value == this.combHand[x].value){
                    return true;
                }
            }
        }
        return false;
    }
}
