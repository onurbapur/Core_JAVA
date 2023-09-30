/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_AbstractClass;

public abstract class Arac {
    //instance variables
    int numberOfDoors;
    String marka;
    String color;
    boolean seatBelt = true;

    //These are abstract methods which are mandatory to be implemented by sub-classes
    public abstract void start(boolean seatBelt);
    public abstract void stop();
    public abstract void move();
    public abstract void turnRight(int a);
    public abstract void turnLeft(int a);

    //This is none-abstract class which is non-mandatory to be implemented by sub-classes
    //It may be overrided.
    public void printInfo(){
        System.out.println("Marka = " + marka);
        System.out.println("Color = " + color);
        System.out.println("Doors = " + numberOfDoors);
    }
}
