/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding;

import java.util.ArrayList;

public class FinalArrayList {
    public static void main(String[] args) {
        //Final olarak tanımlanan diziler referance tip olduğundan referansını değiştiremeyiz.
        final ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

        arrayList.add(122);
        arrayList.add(7657);
        arrayList.add(9876);

        arrayList1.add(1777722);
        arrayList1.add(76888857);
        arrayList1.add(989999976);

        for (Integer number: arrayList){
            System.out.println("number = " + number);
        }
        System.out.println("-------------");
        for (Integer number: arrayList1){
            System.out.println("number = " + number);
        }

      //  arrayList = arrayList1; //Final tanımlandığında bu şekilde bir referans ataması yapamayız.
        arrayList.add(987889878);
        System.out.println("-------------------");
        for (Integer number: arrayList){
            System.out.println("number = " + number);
        }
        System.out.println("-------------");
        for (Integer number: arrayList1){
            System.out.println("number = " + number);
        }

    }
}
