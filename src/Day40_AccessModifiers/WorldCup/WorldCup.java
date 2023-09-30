/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.WorldCup;

import java.util.ArrayList;

public class WorldCup {
    private String name;
    private int year;
    private String country;
    private ArrayList<Group> groups;


    public WorldCup(String name, int year, String country) {
        this.name = name;
        this.year = year;
        this.country = country;
        this.groups = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public void addGroup(Group group){
        this.groups.add(group);
    }

    public void worldCupGroupList(){
        for (Group group:this.groups){
            System.out.println(group.getName());
            System.out.println("----------------------------------------");
            for(Team team:group.getTeams()){
                System.out.println(" -" + team.getCountry());
            }
            System.out.println("----------------------------------------");
        }
    }
    public void worldCupInfo(){
        //GROUP
        for (Group group :this.groups) {
            System.out.println("Name of group = " + group.getName());
            System.out.println("----------------------------------------");
            //TEAM
            for (Team team: group.getTeams()){
                System.out.println(team.teamInfo());
                /*System.out.println("Country = " + team.getCountry());
                System.out.println("Team= " + team.getName());
                System.out.println("Name of Tech.Dir. = " + team.getTechDirector().getName());*/
                //PLAYER
                for (Player player:team.getPlayers()){
                    System.out.println(player.playerInfo());
                    /*System.out.println("Player name = " + player.getName());
                    System.out.println("Player role = " + player.getRole());
                    System.out.println("Player's number = " + player.getNumber());
                    System.out.println("Player's number of goals = " + player.getNumberOfGoals());*/
                }
            }
            System.out.println("----------------------------------------");
        }
    }
}
