/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.Personel;

public class Engineer extends Person{
    String universite;
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " mühendis olarak çalışıyorum.");
    }

    @Override
    public String showfInfo() {
        return "My name is : " + this.getName();
    }

    public void doDesign(){
        System.out.println("Tasarım yapıyorum.");
    }
}
