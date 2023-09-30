/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritence_2.A;

public class AA {
    public static void main(String[] args) {
        APackageClass apak = new APackageClass();
        System.out.println(apak.salary); //Protected same package or inheritance
        System.out.println(apak.address); //Default
        System.out.println(apak.no); //Public
        System.out.println(apak.fName); //Public
     //   System.out.println(apak.special); //Private olduğundan bu class tan erişilemez.

        apak.xyz();
        System.out.println(apak.salary);

    }
}
