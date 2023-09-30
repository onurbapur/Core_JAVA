/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface;

public class Anfibi extends Animal implements IRunAndSwim{
    public Anfibi(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void run() {
        System.out.println("I run both land and surface of sea.");
    }

    @Override
    public void swim() {
        System.out.println("I can swim in sea and ocean.");

    }

    @Override
    void eat() {
        System.out.println("I can eat whatever found.");
    }

    @Override
    void sleep() {
        System.out.println("I can sleep wherever find a place.");
    }
}
