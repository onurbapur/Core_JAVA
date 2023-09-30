/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.Pack_A;

import Day40_AccessModifiers.AccessModifiers;

public class AccesModTest3 extends AccessModifiers {
    public static void main(String[] args) {

        AccesModTest3 accesModTest3 = new AccesModTest3();
        System.out.println("Different package, may access protected members by inheritance");
        accesModTest3.name= "Ahmet"; //public
        accesModTest3.TCNo = 121246713; // protected INHERITANCE relation
        accesModTest3.proMethod(); // protected INHERITANCE relation
        accesModTest3.pubMethod(); //public

    }
}
