package Day26_Array;

import java.util.Arrays;

public class PrintingElementsOfAnArray {
    /* Printing elements of an Array
        1- For loop
        2- For each loop
        3- Arrays.toString() method
    */

    public static void main(String[] args) {
        String[] ogrListesi = {"Ahmet","Mehmet","Merry"};
        int[] sayilar = {1,5,7,6,8};

        //Printing elements of an Array with For...loop
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ".index ögrenci = " + ogrListesi[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ".elemanlı ögrenci = " + ogrListesi[i]);
        }

        System.out.println();
        //Printing elements of an Array with For...loop
        for (int i = 0; i < ogrListesi.length; i++) {
            System.out.println(i + ".index ögrenci = " + ogrListesi[i].toUpperCase());
        }

        System.out.println();
        //For each -Modern for loop
        //Printing elements of an Array with For each loop
        System.out.println("For each -Modern for loop");
        for (String ogrenci: ogrListesi) {
            System.out.println(ogrenci);
        }

        System.out.println();
        //Printing elements of an Array with For each loop
        for (int sayi: sayilar) {
            System.out.println(sayi);
        }

        System.out.println();
        //Printing elements of an Array with Arrays.toString()
        //Arrays class .toString()
        System.out.println("Arrays.toString(ogrListesi) = " + Arrays.toString(ogrListesi));
    }
}
