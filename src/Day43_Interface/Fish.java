/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface;

public class Fish extends Animal implements ISwim{
    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println("Eats very tiny creatures in see.");
    }

    @Override
    void sleep() {
        System.out.println("Sleeps while its eyes open.");
    }

    @Override
    public void swim() {

    }

    @Override
    public void dive() {
        System.out.println("I can dive in to sea.");
    }

}
