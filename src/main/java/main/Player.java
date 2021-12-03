/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Jake Etzler
 * Section: 01 - 8:30
 * Date: 12/3/21
 * Time: 8:50 AM
 *
 * Project: csci205_final_project
 * Package: main
 * Class: Player
 *
 * Description:
 *
 * ****************************************
 */
package main;

public class Player {

    private Hand hand;
    private String name;

    public Player() {
        this.hand = new Hand();
    }

    public Player(String nme) {
        this.name = nme;
        this.hand = new Hand();
    }
    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hnd) {
        this.hand = hnd;
    }


}
