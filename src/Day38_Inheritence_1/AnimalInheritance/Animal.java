/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritence_1.AnimalInheritance;
//Sub class of Canlilar
//Parent/Base/Super Class (Kedi,Köpek,Balik,Kus)
public class Animal extends Canlilar {
    private String name;
    private String renk;
    private int age;

    public Animal(String name, String renk, int age) {
        System.out.println("Parent/Super/Base class constructor called.");
        this.name = name;
        this.renk = renk;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void yemekYe(){
        System.out.println("yemek yiyorum.");
    }

    public void uyu(){
        System.out.println("Uyuyorum.");
    }
    public void hareketEt(){
        System.out.println("Hareket ediyorum.");
    }

    public void sesCikar(){
        System.out.println("Ses çıkarıyorum.");
    }

    @Override
    public String toString() {
        String str ="Adım   :" + getName() + "\n";
        str +=      "Rengim :" + getRenk()  + "\n";
        str +=      "Yaşım  :" + getAge()  + "\n";
        return str;
    }
}
