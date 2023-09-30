/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface;

public abstract class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Must be overrided by sub-classes
    abstract void eat();
    abstract void sleep();

    public String printInfo(){
        String str = "Name      : " + this.getName() + "\n";
              str += "Age       : " + this.getAge() + "\n";
              str += "Color     : " + this.getColor() + "\n";
        return str;
    }
}
