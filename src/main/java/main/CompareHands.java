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

public class CompareHands extends ArrayList{
    public Hand hand;
    public Hand dealerHand;
    public Hand combHand;

    public CompareHands(Hand hand, Hand dealerHand){
        this.dealerHand = dealerHand;
        this.hand = hand;
        buildCombHand();
    }
    public CompareHands(Hand hand){
        this.combHand = hand;
    }

    /**
     * Combines the flop hand and the players hand
     * Sorts the new hand for easier
     */
    private void buildCombHand() {
        ArrayList<Card> combHandArray = new ArrayList<>();
        combHandArray.addAll(this.hand.getHand());
        combHandArray.addAll(this.dealerHand.getHand());
        combHandArray.sort(Card::compareTo);
        this.combHand = new Hand(combHandArray);
    }

    /**
     * Calls each of the comparing methods until it determines what hand the player has.
     * @return in rank, 1-10 depending on the strength of the hand. 1 is the strongest, 10 is the weakest.
     */
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

    public String findNameRank(){
        if (isRoyalFlush()){
            return "Royal FLush";
        }
        else if (isStraightFlush()){
            return "Straight Flush";
        }
        else if (isFourOfAKind()){
            return "Four of a Kind";
        }
        else if (isFullHouse()){
            return "Full House";
        }
        else if (isFlush()){
            return "Flush";
        }
        else if (isStraight()){
            return "Straight";
        }
        else if (isThreeOfAKind()){
            return "Three of a Kind";
        }
        else if (isTwoPair()){
            return "Two Pair";
        }
        else if (isOnePair()){
            return "One Pair";
        }
        else{
            return "High Card";
        }
    }

    /**
     * Adds all cards with value 10, 11, 12, 13 and 1 to a new array
     * Check if the new array includes a straight flush which would show that the full hand is a royal flush
     * @return true if conditions are met, otherwise false
     */
    public boolean isRoyalFlush(){
        ArrayList temp = new ArrayList();
        for (int x = 0; x < this.combHand.getHand().size(); x++){
            if (this.combHand.getHand().get(x).value == 10 || this.combHand.getHand().get(x).value == 11 || this.combHand.getHand().get(x).value == 12 ||this.combHand.getHand().get(x).value == 13 ||this.combHand.getHand().get(x).value == 1){
                temp.add(this.combHand.getHand().get(x));
            }
        }
        Hand temp2 = new Hand(temp);
        //System.out.println(temp);
        CompareHands comp = new CompareHands(temp2);
        return comp.isStraightFlush();
    }

    /**
     * @return true if the requirements above are met for at least 5 cards, otherwise false
     */
    public boolean isStraightFlush(){
        //Create a temporary arraylist to store all teh cards of the same suit
        ArrayList temp = new ArrayList();
        //Iterate through looking for cards of the same suit
        for (int x = 0; x < this.combHand.getHand().size(); x++){
            //Clear the current list of same suit if there are not enough of that suit to fulfil
            temp.clear();
            //Add the first element b/c it gets skipped later
            temp.add(this.combHand.getHand().get(x));
            for (int i = 0; i < this.combHand.getHand().size(); i++){
                //Skip objects that are the same
                if (this.combHand.getHand().get(x) == this.combHand.getHand().get(i));
                    //Check if the suits are the same
                else if (this.combHand.getHand().get(x).suit == this.combHand.getHand().get(i).suit){
                    //If suits are the same : add to arraylist of other cards with same suit
                    temp.add(this.combHand.getHand().get(i));
                }
            }
            //If there are enough cards of the same suit
            if(temp.size() >= 5){
                //Switch from ArrayList to Hand
                Hand temp2 = new Hand(temp);
                int numInRow = 1;
                //Iterate through checking if the cards of the same suit make a straight
                for (int z = 0; z < temp2.getHand().size(); z++){
                    if (this.combHand.getHand().get(x).value +1 == this.combHand.getHand().get(x+1).value){
                        numInRow ++;
                        //Check if there is a straight
                        if (numInRow >=5){
                            return true;
                        }
                    }
                    else {
                        numInRow = 0;
                    }
                }
            }
        }
        //If all else fails return false
        return false;
    }

    /**
     * Iterates through the hand
     * @return true if four cards with the same value are detected
     */
    public boolean isFourOfAKind(){
        for (int x = 0; x < this.combHand.getHand().size(); x++){
            if (x >= 4);
            else if ((this.combHand.getHand().get(x).value == this.combHand.getHand().get(x+1).value) && (this.combHand.getHand().get(x+2).value == this.combHand.getHand().get(x).value) && (this.combHand.getHand().get(x).value == this.combHand.getHand().get(x+3).value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Go through the hand keeping track of how many cards of each number there are, add these numbers to an array
     * check the array to see if it contains both 2 and 3.
     * @return true if above is met. false otherwise
     */
    public boolean isFullHouse(){
        ArrayList numbers = new ArrayList();
        for (int x = 0; x < this.combHand.getHand().size(); x++){
            int amount = 0;
            for (int i = 0; i < this.combHand.getHand().size(); i++){
                //Check if the numbers are equal
                if(this.combHand.getHand().get(x).value == this.combHand.getHand().get(i).value){
                    amount ++;
                }
            }
            numbers.add(amount);
        }
        return(numbers.contains(2)&&numbers.contains(3));
    }

    /**
     * Iterates through the hand comparing each cards suit to the current card
     * @return true if 5 cards have the same suit, otherwise false
     */
    public boolean isFlush(){
        for (int x = 0; x < this.combHand.getHand().size(); x++){
            int numSameSuit = 0;
            for (int i = 0; i < this.combHand.getHand().size(); i++) {
                //System.out.println(this.combHand.getHand().get(x).suit + " | " + this.combHand.getHand().get(i).suit);
                if (this.combHand.getHand().get(x) == this.combHand.getHand().get(i));
                if (this.combHand.getHand().get(x).suit == this.combHand.getHand().get(i).suit) {
                    numSameSuit++;
                    if (numSameSuit >= 5) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Iterates through the hand
     * If the value of the next card in the hand is not 1 greater than the
     * @return true if there is a straight false otherwise
     */
    public boolean isStraight(){
        int numInRow = 1;
        for (int x = 0; x < this.combHand.getHand().size(); x++){
            if(x == 6);
            else if (this.combHand.getHand().get(x).value +1 == this.combHand.getHand().get(x+1).value){
                numInRow ++;
                if (numInRow >=5){
                    return true;
                }
            }
            else if(this.combHand.getHand().get(x).value == this.combHand.getHand().get(x+1).value){
            }
            else if (this.combHand.getHand().get(x).value +1 != this.combHand.getHand().get(x+1).value){
                numInRow = 0;
            }
        }
        return false;
    }

    /**
     * Iterates through the hand comparing each card to the current card
     * @return true if three of the same value cards are detected, otherwise false
     */
    public boolean isThreeOfAKind(){
        for (int x = 0; x < this.combHand.getHand().size(); x++){
            if (x >= 5);
            else if (this.combHand.getHand().get(x).value == this.combHand.getHand().get(x+1).value && this.combHand.getHand().get(x+2).value == this.combHand.getHand().get(x).value) {
                return true;
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
        for (int x = 0; x < this.combHand.getHand().size(); x++){
            if (x == 6);
            else if ((this.combHand.getHand().get(x).value == this.combHand.getHand().get(x+1).value) && (this.combHand.getHand().get(x).value != this.combHand.getHand().get(x-1).value)){
                numPair++;
            }
        }
        return numPair >= 2;
    }

    /**
     * Iterates through the hand comparing each card to the current card
     * @return true if two cards with the same value are detected, otherwise false
     */
    public boolean isOnePair(){
        for (int x = 0; x < this.combHand.getHand().size(); x++){
            for (int i = 0; i< this.combHand.getHand().size(); i++){
                if(this.combHand.getHand().get(x) == this.combHand.getHand().get(i));
                else if (this.combHand.getHand().get(x).value == this.combHand.getHand().get(i).value){
                    return true;
                }
            }
        }
        return false;
    }
    public String toString() {
        return this.combHand.toString();
    }
}
