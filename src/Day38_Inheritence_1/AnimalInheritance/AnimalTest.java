/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritence_1.AnimalInheritance;

import java.util.ArrayList;

public class AnimalTest {


    public static void main(String[] args) {
        Kedi kedi = new Kedi("Leyla","Beyaz",3);
        Kopek kopek = new Kopek("Goffy","Siyah",6);
        Kus kus = new Kus("Pır pır","Sarı",4);
        Balik balik = new Balik("Hamsi","Gümüş",2);


        System.out.println(kedi);
        kedi.hareketEt();
        kedi.sesCikar();
        kedi.uyu();
        kedi.yemekYe();

        System.out.println(balik);
        balik.hareketEt();
        balik.sesCikar();
        balik.uyu();
        balik.yemekYe();
        balik.yuz();

        System.out.println( kopek);
        kopek.hareketEt();
        kopek.sesCikar();
        kopek.uyu();
        kopek.yemekYe();



        //Çiftlik
        ArrayList<Animal> hayvanatbahcesi = new ArrayList<>();

        hayvanatbahcesi.add(kedi);
        hayvanatbahcesi.add(kopek);
        hayvanatbahcesi.add(kus);
        hayvanatbahcesi.add(balik);

        System.out.println(kedi.getClass().getClasses().getClass().getSimpleName());

        System.out.println("-------------ÇİFTLİKTEKİ HAYVANLAR----------------");
        for (Animal animal: hayvanatbahcesi){
            System.out.println("Alibabanın çifliğinde...");
            //animal.getClass().getSimpleName()--> nesnenin hangi class tan olduğu bilgisini verir.
            System.out.print(animal.getClass().getSimpleName() + "-" + animal.getName() + " --" );
            animal.sesCikar();
            //Class larda ortak olmayan metodlar varsa. instanceof operatörü nesnenin hangi Class tan oluşturulduğunu karşılaştırmamıza yarar.
            if (animal instanceof Kus)((Kus) animal).uc();//animal objesi Kus class ından ise kus class ının uc() metodunu çalıştır.
            if (animal instanceof Balik) ((Balik) animal).yuz(); //animal objesi Balık class ından ise Balık class ının yuz() metodunu çalıştır.
        }
        System.out.println();
        System.out.println("-----En tepedeki Super Class olan Canlilar' dan Animal Class'ının miras aldığı metod-------");
        System.out.println("Canlilar Class ının metodu. Canlilar <---Animal <---Kopek");
        kopek.dogar();//Canlilar Class ının metodu. Canlilar <---Animal <---Kopek
        System.out.println("Canlilar Class ının metodu. Canlilar <---Animal <---Kedi");
        kedi.dogar();//Canlilar Class ının metodu. Canlilar <---Animal <---Kedi
    }

}
