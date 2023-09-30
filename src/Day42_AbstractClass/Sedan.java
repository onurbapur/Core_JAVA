/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_AbstractClass;

public class Sedan extends Arac{
    boolean move;
    @Override
    public void start(boolean seatBelt) {
        if (seatBelt){
            System.out.println("Started successfully");
            move = true;
        }else System.out.println("Please fasten your seat belt!");

    }

    @Override
    public void stop() {
        System.out.println("Stopped!");
    }

    @Override
    public void move() {
        System.out.println("Sedan hareket etti");
        if (move){
            System.out.println("Moved");
        }

    }

    @Override
    public void turnRight(int a) {
        System.out.println(a + " degree turned right.");
    }

    @Override
    public void turnLeft(int a) {
        System.out.println(a + " degree turned left.");
    }
}
