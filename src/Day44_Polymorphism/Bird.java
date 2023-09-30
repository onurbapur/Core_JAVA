/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism;

public class Bird extends Animal{
    public Bird() {
    }

    public Bird(String name, int age, String color) {
        super(name, age, color);
    }


    @Override
    public void sound() {
        System.out.println("Cik...cik");
    }
}
