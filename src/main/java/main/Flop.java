/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Jake Etzler
 * Section: 01 - 8:30
 * Date: 11/29/21
 * Time: 8:45 AM
 *
 * Project: csci205_final_project
 * Package: main
 * Class: Flop
 *
 * Description:
 *
 * ****************************************
 */
package main;

import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Flop {

    private ArrayList<Card> flop;

    public Flop() {
        this.flop = new ArrayList<>(5);
    }

    public void addCard(Card crd) {
        this.flop.add(crd);
    }

    public ArrayList getFlop() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.flop.get(i).toString());
        }
        return flop;
    }

}