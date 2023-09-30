package Day22_RandomMathDateClasses;

import java.util.Random;

public class RandomDice {
    public static void main(String[] args) {
        System.out.println("Two dices sum of 8.");
        Random zar = new Random();
        int dice1 = 0;
        int dice2 = 0;
        int sumOfTwoDices = 0;
        int counter = 0;

        while (sumOfTwoDices != 8){
            dice1 = zar.nextInt(6) + 1; //1-6 arasında 1 ve 6 dahil sayı ürettik
            dice2 = zar.nextInt(6) + 1;
            sumOfTwoDices = dice1 + dice2;
            System.out.println("Dices = " + dice1 + " - " + dice2);
            counter++;
        }
        System.out.println("Counter : " + counter);
    }
}
