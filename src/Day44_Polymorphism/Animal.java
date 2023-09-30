/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism;

public abstract class Animal {
    private String name;
    private int age;
    private  String color;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
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

    public abstract void sound();//must be implemented by subclasses.

    public String showInfo(){
        String str = "My name is    : " + this.getName() + "\n";
        str +=       "My age is     : " + this.getAge() + "\n";
        str +=       "My color is   : " + this.getColor();
        return str;
    }

}
