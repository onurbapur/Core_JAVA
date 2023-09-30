/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface;

public class Cat extends Animal implements IRunnable{

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println("Likes to eat fish too much.");
    }

    @Override
    void sleep() {
        System.out.println("Sleeps day long but in the morning it does'nt.");
    }
    @Override
    public String printInfo(){
        String str = super.printInfo();
        str += "I am a Cat" + "\n";
        return str;
    }

    @Override
    public void run() {
        System.out.println("I can run with my 4 legs..");
    }
}
