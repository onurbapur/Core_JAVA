/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.Pack_A;

import Day40_AccessModifiers.AccessModifiers;

public class AccesModTest2 {
    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
        System.out.println("Different package, may access only public members.");
        accessModifiers.pubMethod(); //public
        accessModifiers.name = "Ahmet"; //public

    }
}
