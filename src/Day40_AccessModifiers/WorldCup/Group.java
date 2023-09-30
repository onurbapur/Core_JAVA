/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.WorldCup;

import java.util.ArrayList;

public class Group {
    private String name;
    private ArrayList<Team> teams;

    public Group(String name){
        this.name = name;
        this.teams = new ArrayList<>(4);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
    public void addTeam(Team team){
        this.teams.add(team);
    }


}
