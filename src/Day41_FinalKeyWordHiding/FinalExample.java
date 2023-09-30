/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding;

public class FinalExample {
    //Final variable Value can be assigned with in the declaration statement
    final int baseSalary = 1000;
    final double PI_SAYISI = 3.14;
    final double VIZE_KAT_SAYISI = 0.4;

    final double KDV;
    final double KDV_EGITIM;

    //Final variable Value can be assigned with in the initialize block
    {
        KDV = 0.18;
    }

    //Final variable Value can be assigned with in the constructor
    FinalExample(){
        KDV_EGITIM = 0.1;
    }

    public static void main(String[] args) {
      final int[] sayilar = new int[3]; //Final olarak tanımlanan diziler referance tip olduğundan referansını değiştiremeyiz.
      final int abc = 23423;
        sayilar[0] = 1;
        sayilar[1] = 5;
        sayilar[2] = 345;
        System.out.println("Sayılar ref.value = " + sayilar);

        int[] numbers = new int[3];
        numbers[0] = 345345;
        System.out.println("Numbers ref.value = " + numbers);

        // sayilar = numbers; //Final tanımlandığında bu şekilde bir atama yapamayız.

        System.out.println("Sayılar ref.value = " + sayilar);


        //  sayilar = new int[3]; //Final tanımlandığında bu şekilde bir referans ataması yapamayız.
        for(int sayi: sayilar){
            System.out.println("sayi = " + sayi);
        }
        //Final olarak tanımlansa bile dizilere eleman ekleme, silme ve güncelleme yapabiliriz
        sayilar[0] = 1456;
        sayilar[1] = 534;
        sayilar[2] = 345;

        for(int sayi: sayilar){
            System.out.println("sayi = " + sayi);
        }
    }
}
