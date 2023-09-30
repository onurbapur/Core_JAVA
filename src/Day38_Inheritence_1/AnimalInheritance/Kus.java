/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritence_1.AnimalInheritance;
//Child/sub class
public class Kus extends Animal{
    public Kus(String name, String renk, int age) {
        super(name, renk, age);
    }

    @Override
    public void sesCikar(){
        System.out.println("Cik...Cik...cik.");
    }

    public void uc(){
        System.out.println("Uçuyorum.");
    }

    @Override
    public void hareketEt(){
        uc();
    }
}
