/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritence_1.AnimalInheritance;

public class Kedi extends Animal{
//Child/sub class
    public Kedi(String name, String renk, int age) {
        super(name, renk, age);
    }

    @Override
    public void sesCikar(){
        System.out.println("Miyav...miyav...miyav");
    }
}
