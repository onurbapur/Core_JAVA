/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void sound() {
        System.out.println("Miyav...miyav");
    }
}
