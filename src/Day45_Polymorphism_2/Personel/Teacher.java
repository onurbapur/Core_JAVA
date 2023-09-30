/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.Personel;

public class Teacher extends Person{
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " öğretmen olarak çalışıyorum.");
    }

    @Override
    public String  showfInfo() {
        return "My name is : " + this.getName();
    }

    public void doExam(){
        System.out.println("Sınav yapıyorum.");
    }
}
