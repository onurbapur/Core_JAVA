/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritence_2.B;

import Day39_Inheritence_2.A.APackageClass;

public class BPackageClass extends APackageClass {
    public int sayi;

    public BPackageClass(){
        super();
        System.out.println("BPackageClass- constructor called.");
    }

    public void abc(){
        super.salary = 111;
    }
    public static void main(String[] args) {
        BPackageClass bpak = new BPackageClass();
        System.out.println(bpak.salary); //Protected- different package but inheritance

       bpak.xyz();
    }
}
