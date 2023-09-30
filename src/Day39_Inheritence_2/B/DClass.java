/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritence_2.B;

import Day39_Inheritence_2.A.APackageClass;

public class DClass extends APackageClass {
    String str = super.fName;

    DClass(){
        super();
    }
    public static void main(String[] args) {
        DClass dpak = new DClass();

        dpak.xyz(); //Protected method..
    }
}
