/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: YOUR NAME
 * Section: YOUR SECTION
 * Date: 12/1/2021
 * Time: 8:52 AM
 *
 * Project: csci205_final_project
 * Package: main
 * Class: Hand
 *
 * Description:
 *
 * ****************************************
 */
package main;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hand implements Collection<Card> {

    private final int HAND_SIZE = 2;

    //private Card[] hand = new Card[HAND_SIZE];
    private ArrayList<Card> hand = new ArrayList<>();

    public Hand(Card c1, Card c2) {
        this.hand.set(0, c1);
        this.hand.set(1, c2);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Card> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Card card) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Card> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public Card get(int x) {
        return this.hand.get(x);
    }
}
