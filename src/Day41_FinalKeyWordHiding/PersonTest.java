/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding;

public class PersonTest {
    public static void toplama(int sayiA, int sayiB){
        //sonuc is a local variable
        int sonuc = sayiA + sayiB;
        System.out.println("Sonuç = " + sonuc);
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.age= 19;
        student1.name = "Mehmet";
     /*   student1.workAddress = "ABC plaza Ortaköy/Istanbul";
        student1.workWebAddress = "www.abcplaza.com.tr";*/

        System.out.println(student1);

        Student student2 = new Student();
       /* student2.workAddress = "ABC plaza Ortaköy/Istanbul";
        student2.workWebAddress = "www.abcplaza.com.tr";*/
        System.out.println(student2);

        Student student3 = new Student();
        student3.workAddress = "XYZ plaza Ortaköy/Istanbul";
        student3.workWebAddress = "www.xyzplaza.com.tr";

        Person.workAddress = "XYZ plaza Ortaköy/Istanbul";
        Person.workWebAddress = "www.xyzplaza.com.tr";

        System.out.println(student3);
        System.out.println(student2);
        System.out.println(student1);

        //sayi is a local variable for this for loop and can not be reached outside the loop
        for (int sayi= 0; sayi < 3; sayi++) {//sayi is a local variable can be reached just inside the for loop
            System.out.println("Sayı = " + sayi);
        }

        //number is not a local variable for this for loop and can be reached outside the loop
        int number = 0;
        for (;number < 3; number++) {
            System.out.println("Number(inside loop) =" + number);
        }
        System.out.println("Number(out of loop) =" + number);

        toplama(3,5);
    }
}
