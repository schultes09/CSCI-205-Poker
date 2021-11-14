package main;

import main.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Hand {
    private ArrayList<Card> hand;
    private int total;

    public Hand(){
        this.hand = new ArrayList<Card>();
        this.total = 0;
    }

    public void addCardToMyHand(Card newCard){
        this.hand.add(newCard);
        this.total += newCard.getCardValue();
    }

    public int getTotal() {
        Card card1 = new Card(14);
        if (hand.contains(card1) && total > 21 ){
            total -= 10;
        }
        return total;
    }

    public Card remove(){
        Card removed = this.hand.remove(0);
        return removed;
    }

    public void shuffle(){
        Collections.shuffle(this.hand);
    }

    public  List<Card> getHand() {
        return hand;
    }

    public int getSize(){
        return hand.size();
    }

}