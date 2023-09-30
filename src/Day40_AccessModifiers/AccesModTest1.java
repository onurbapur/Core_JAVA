/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers;

public class AccesModTest1 {
    public static void main(String[] args) {
        System.out.println("Same package but different class.");
        System.out.println("May access only public, protected and default members");
        AccessModifiers accessModifiers = new AccessModifiers();
        accessModifiers.pubMethod();
        accessModifiers.proMethod();
        accessModifiers.defaultMethod();

    }
}
