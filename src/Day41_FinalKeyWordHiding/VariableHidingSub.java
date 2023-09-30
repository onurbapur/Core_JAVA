/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding;

public class VariableHidingSub extends VariableHiding {
    int sayi = 5;

    void print(){
        System.out.println("super.sayi = " + super.sayi);
    }


}
