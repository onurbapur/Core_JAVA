/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.WorldCup;

public class Player extends Person{
    private int number;
    private int numberOfGoals;

    public Player(String name, String country, String role, int number, int numberOfGoals) {
        super(name, country, role);
        this.number = number;
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }
    public String playerInfo(){
        String str = "";
        str += "Player name         : " + this.getName() + "\n";
        str += "Player role         : " + this.getRole() + "\n";
        str += "Player's number     : " + this.getNumber() + "\n";
        str += "Player's # goals    : " + this.getNumberOfGoals() + "\n";
        return str;
    }
}
