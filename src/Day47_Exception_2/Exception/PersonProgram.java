/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception_2.Exception;

import java.util.Scanner;

public class PersonProgram {
    public static void main(String[] args){
        System.out.println("Person programına hoşgeldiniz.");
        Person per = new Person();
       /* per.setName("Ahmet");
        per.setAge(45);
        per.setAddress("Istanbul-Bakırköy");*/

        Scanner klavye = new Scanner(System.in);

        boolean devam = true;
        while (devam){
            try {
                System.out.print("Lütfen adınızı giriniz : ");
                per.setName(klavye.nextLine());
                devam = false;
            }catch (ValidateFieldException adExcp){
                System.out.println(adExcp.getMessage());
            }
        }
        devam = true;
        while (devam){
            try {
                System.out.print("Lütfen yaşınızı giriniz : ");
                per.setAge(Integer.parseInt(klavye.nextLine()));
                devam = false;
            }catch (ValidateFieldException adExcp){
                System.out.println(adExcp.getMessage());
            }
        }

        System.out.print("Adresinizi giriniz : ");
        per.setAddress(klavye.nextLine());

        System.out.println(per.showInfo());
    }
}
