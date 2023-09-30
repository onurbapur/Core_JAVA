/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.WorldCup;

public class WorldCupTest {
    public static void main(String[] args) {
        WorldCup qatar = new WorldCup("Qatar World Cup Football",2022,"QATAR");
        Group groupA = new Group("A gurubu");
        Group groupB = new Group("B gurubu");
        Group groupC = new Group("C gurubu");
        Group groupD = new Group("D gurubu");
        Group groupE = new Group("E gurubu");
        Group groupF = new Group("F gurubu");
        Group groupG = new Group("G gurubu");
        Group groupH = new Group("H gurubu");

        Team teamQatar = new Team("Qatar");
        Team teamEcuador = new Team("Ecuador");
        Team teamSenegal = new Team("Senegal");
        Team teamNetherlands = new Team("Netherlands");
        groupA.addTeam(teamQatar);
        groupA.addTeam(teamEcuador);
        groupA.addTeam(teamSenegal);
        groupA.addTeam(teamNetherlands);

        Team teamEngland = new Team("England");
        Team teamIran = new Team("Iran");
        Team teamUSA = new Team("USA");
        Team teamWales = new Team("Wales");
        groupB.addTeam(teamEngland);
        groupB.addTeam(teamIran);
        groupB.addTeam(teamUSA);
        groupB.addTeam(teamWales);

        Team teamArgentina = new Team("Argentina");
        Team teamSaudi = new Team("Saudi Arabia");
        Team teamMexico = new Team("Mexico");
        Team teamPoland = new Team("Poland");
        groupC.addTeam(teamArgentina);
        groupC.addTeam(teamSaudi);
        groupC.addTeam(teamMexico);
        groupC.addTeam(teamPoland);

        System.out.println("Welcome to 2022 World Cup Football in Qatar.");

        qatar.addGroup(groupA);
        qatar.addGroup(groupB);
        qatar.addGroup(groupC);
        qatar.addGroup(groupD);
        qatar.addGroup(groupE);
        qatar.addGroup(groupF);
        qatar.addGroup(groupG);
        qatar.addGroup(groupH);

        Player player1 = new Player("Justin Bijlow","Netherlands","Goal Keeper",1,0);
        Player player2 = new Player("Virgil van Dijk","Netherlands","Defenders",3,0);
        teamNetherlands.addPlayer(player1);
        teamNetherlands.addPlayer(player2);

        Player player3 = new Player("Moises Ramirez","ECUADOR","Goal Keeper",1,0);
        Player player4 = new Player("Carlos Gruezo","ECUADOR","Midfielders",7,0);
        teamEcuador.addPlayer(player3);
        teamEcuador.addPlayer(player4);

        Person techDir1 = new Person("Zico Miko","ECUADOR","Teknik Direktor");
        teamEcuador.addTechDirector(techDir1);

        Person techDir2 = new Person("John Mohn","Netherlands","Teknik Direktor");
        teamNetherlands.addTechDirector(techDir2);

        qatar.worldCupGroupList();
        System.out.println();
        qatar.worldCupInfo();

    }
}
/*
Group A. Qatar. Ecuador. Senegal. Netherlands.
Group B. England. Iran. USA. Wales.
Group C. Argentina. Saudi Arabia. Mexico. Poland.
Group D. France. Denmark. Tunisia.
Group E. Spain. Costa Rica. Germany. Japan.
Group F. Belgium. Canada. Morocco. Croatia.
Group G. Brazil. Serbia. Switzerland. Cameroon.
Group H. Portugal. Ghana. Uruguay. Korea Republic.
 */
