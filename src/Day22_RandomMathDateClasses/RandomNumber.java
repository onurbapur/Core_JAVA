/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rastgele  = new Random();
        int min = 1; //lowerBound
        int max = 6; //upperBound

        int range = (max - min) + 1;

        int rastgeleNumber;
        //rastgeleNumber = (rastgele.nextInt(max - min + 1) + min);
        rastgeleNumber = (rastgele.nextInt(range) + min);
        System.out.println("rastGeleSayi = " + rastgeleNumber);

        //Math.random()
        //int randomMath = (int)(Math.random() * (max - min) + 1) + min;
        int randomMath = (int)(Math.random() * range) + min;
        System.out.println("randomMath = " + randomMath);
    }
}
