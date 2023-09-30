/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface;

public class Frog extends Animal implements IRunnable{
 private   String name;

    public Frog(String name, int age, String color) {
        super(name, age, color);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("I can eat insects and flies.");
    }

    @Override
    void sleep() {
        System.out.println("Sleeps like a frog.");
    }

    @Override
    public void run() {
        System.out.println("I can run like frog not the others.");
    }

    @Override
    public void fourLegsRun() {
        IRunnable.super.fourLegsRun();
        System.out.println("I can hop.");
    }
}
