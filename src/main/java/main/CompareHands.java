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


public class CompareHands {
    private int rank;
    public Hand hand;
    public Hand dealerHand;

    public CompareHands(Hand hand, Hand dealerHand){
        this.hand = hand;
        this.dealerHand = dealerHand;
    }

    public int findRank(Hand handx){
        if (this.hand.isRoyalFlush()){
            return 1;
        }
        else if (this.hand.isStraightFlush()){
            return 2;
        }
        else if (this.hand.isFourOfAKind()){
            return 3;
        }
        else if (this.hand.isFullHouse()){
            return 4;
        }
        else if (this.hand.isFlush()){
            return 5;
        }
        else if (this.hand.isStraight()){
            return 6;
        }
        else if (this.hand.isThreeOfAKind()){
            return 7;
        }
        else if (this.hand.isTwoPair()){
            return 8;
        }
        else if (this.hand.isOnePair()){
            return 9;
        }
        else{
            return 10;
        }
    }

    public boolean isRoyalFlush(){
        //TODO
        if (!this.hand.isFlush){
            return false;
        }

        return false;
    }

    public boolean isStraightFlush(){
        //TODO
        if (this.hand.isFlush && this.hand.isStraight){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFourOfAKind(){
        //TODO
        if (this.hand.length() < 4){
            return false;
        }

        return false;
    }

    public boolean isFullHouse(){
        if (this.hand.length() != 5){
            return false;
        }

        return false;
    }

    public boolean isFlush(){
        if (this.hand.length() != 5){
            return false;
        }

        return false;
    }

    public boolean isStraight(){
        if (this.hand.length() != 5){
            return false;
        }

        return false;
    }

    public boolean isThreeOfAKind(){
        if (this.hand.length() < 3){
            return false;
        }

        return false;
    }

    public boolean isTwoPair(){
        if (this.hand.length() < 4){
            return false;
        }

        return false;
    }

    public boolean isOnePair(){
        //TODO
    }
}
