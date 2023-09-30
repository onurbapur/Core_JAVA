/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package OYUNLAR.Tombala.KagitMakas;

import java.util.Random;
import java.util.Scanner;

public class PaperScissorsStone {

    public static void main(String[] args) {

        String playerChoice;
        String computerChoice = "";
        int computerInt;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Let's play Paper, Scissors, Stone!");
        System.out.println("Please enter your choice: (paper, scissors, stone)");

        playerChoice = scan.nextLine();
        playerChoice = playerChoice.toLowerCase();

        while (!playerChoice.equals("paper") && !playerChoice.equals("scissors") && !playerChoice.equals("stone")) {
            System.out.println("Invalid input. Please enter your choice: (paper, scissors, stone)");
            playerChoice = scan.nextLine();
            playerChoice = playerChoice.toLowerCase();
        }

        computerInt = generator.nextInt(3) + 1;

        switch (computerInt) {
            case 1:
                computerChoice = "paper";
                break;
            case 2:
                computerChoice = "scissors";
                break;
            case 3:
                computerChoice = "stone";
                break;
        }

        System.out.println("Computer chooses " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a draw!");
        } else if (playerChoice.equals("paper")) {
            if (computerChoice.equals("scissors")) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }
        } else if (playerChoice.equals("scissors")) {
            if (computerChoice.equals("stone")) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }
        } else if (playerChoice.equals("stone")) {
            if (computerChoice.equals("paper")) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }
        }

        scan.close();
    }
}
