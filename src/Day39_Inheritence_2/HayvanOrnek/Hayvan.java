/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritence_2.HayvanOrnek;

public class Hayvan { // Class lar Final olarak tanımlanırsa hiç bir class miras alamaz.
    final String yasamYeri = Sabitler.YASAM_YERI; //Instance of class cannot modify final variables
    int yas;
    String name;
    String renk;

    public void move(){
        System.out.println("Yürüyerek hareket ederim.");
    }
    final protected void eat(){ //Cannogt be overriding in sub classes.
        System.out.println("Acıkınca yemek yerim.");
    }

    public Hayvan mySelf(Hayvan hayvan){
            hayvan.name = "İsim değişti";
        return hayvan;
    }

}
