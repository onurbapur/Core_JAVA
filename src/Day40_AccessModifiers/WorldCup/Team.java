/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.WorldCup;

import java.util.ArrayList;

public class Team {
    private String country;
    private ArrayList<Player> players;
    private Person techDirector;

    public Team(String country) {
        this.country = country;
        this.techDirector =new Person();
        players = new ArrayList<>(11);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Person getTechDirector() {
        return techDirector;
    }

    public void addTechDirector(Person techDirector) {
        this.techDirector = techDirector;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public String teamInfo(){
        String str = "";
        str += "Country             : " + this.getCountry() + "\n";
        str += "Tech.Dir. Country   : " + this.getTechDirector().getCountry() + "\n";
        str += "Tech.Dir. Name      : " + this.getTechDirector().getName() + "\n";
        return str;
    }
}
