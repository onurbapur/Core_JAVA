/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day48_Collection_1;

import java.util.ArrayList;

public class Collections_1 {

    int number;
    String name;
    public static void main(String[] args) {
        System.out.println("Collections-1 in Java.");
        int[] sayilarArray = new int[5];
        sayilarArray[0] = 13;

        ArrayList sayilarList = new ArrayList<>();

        byte sayi= 25;

        sayilarList.add(sayi);//int ---Integer--Autoboxing
        sayilarList.add(10);
        sayilarList.add("Ahmet");
        sayilarList.add(true);
        sayilarList.add(new Collections_1());


        for (Object eleman : sayilarList){
            //System.out.println("eleman.getClass().getSimpleName() = " + eleman.getClass().getSimpleName());
            if (eleman instanceof Integer){
                sayilarList.set(sayilarList.indexOf(eleman),450);
            }
            if (eleman instanceof Collections_1){
               ((Collections_1) eleman).name= "Ahmet";
               ((Collections_1) eleman).number = 123;
            }
        }

        for (Object eleman : sayilarList){
            System.out.println(eleman);
            if(eleman instanceof Collections_1){
                System.out.println("((Collections_1) eleman).name = " + ((Collections_1) eleman).name);
                System.out.println("((Collections_1) eleman).number = " + ((Collections_1) eleman).number);
            }
            }
        }
    }
