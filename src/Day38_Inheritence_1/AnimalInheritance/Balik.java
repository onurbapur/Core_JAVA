/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritence_1.AnimalInheritance;
//Child/sub class
public class Balik extends Animal{
    public Balik(String name, String renk, int age) {
        super(name, renk, age);
    }

    @Override
    public void sesCikar(){
        System.out.println("Ses çıkarıyorum. Ama sen duymazsın.");
    }

    @Override
    public void hareketEt(){
        yuz();
    }
    public void yuz(){
        System.out.println("Diğer hayvanlar hareket eder ben yüzerim. Hatta Derinlerde bile yüzebilirim.");
    }
}
