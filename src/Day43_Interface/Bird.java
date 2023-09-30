/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface;

public class Bird extends Animal implements IFlyable,IRunnable {
    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println("Eats seeds and worms.");
    }

    @Override
    void sleep() {
        System.out.println("Sleeps at trees.");
    }

    @Override
    public void fly() {
        System.out.println("I can fly.");
    }

    @Override
    public void run() {
        System.out.println("I can run with my 2 legs.");
    }

}
