/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.Singleton;

public class SingleTest {
    public static void main(String[] args) {
        /*Single single1 =  new Single(); //Constructor is private therefore instance can not be created.
        Single single2 =  new Single();
        Single single3 =  new Single();
        */

        Single.numbersOfMax_Object = 3;
        Single obje1 = Single.objeOlustur();
        Single obje2 = Single.objeOlustur();
        Single obje3 = Single.objeOlustur();
        Single obje4 = Single.objeOlustur();
        Single obje5 = Single.objeOlustur();

        obje1.name="Deneme";
        obje2.name = "Başka bir şey";

        System.out.println("obje1.name = " + obje1.name);

        System.out.println("obje2.name = " + obje2.name);
    }
}
