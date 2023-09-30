/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_AbstractClass;

import java.util.ArrayList;

public class AracTest {

    public static void main(String[] args) {
        //Abstract class may have the reference of its sub-classes
        Arac sedan1 = new Sedan();
        Arac sedan2 = new Sedan();
        Arac sedan3 = new Sedan();
        Arac sedan4 = new Sedan();

        Arac kamyonet1 = new Kamyonet();
        Arac kamyonet2 = new Kamyonet();
        Arac kamyonet3 = new Kamyonet();


        ArrayList<Arac> araclar = new ArrayList<>();

        araclar.add(sedan1);
        araclar.add(sedan2);
        araclar.add(sedan3);
        araclar.add(sedan4);

        araclar.add(kamyonet1);
        araclar.add(kamyonet2);
        araclar.add(kamyonet3);


        sedan1.marka = "Honda Accord";
        sedan1.color = "Gray";
        sedan1.numberOfDoors = 4;
        sedan1.seatBelt = false;

        sedan1.start(sedan1.seatBelt);
        sedan1.move();
        sedan1.turnRight(35);
        sedan1.turnLeft(60);

        sedan1.printInfo();
    }
}
