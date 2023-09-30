/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding;

public class VariableHideTest {
    public static void main(String[] args) {
        VariableHiding variableParent = new VariableHiding();
        VariableHidingSub variableHidingSub = new VariableHidingSub();

        VariableHiding variableHidingParentAsSub = new VariableHidingSub();

        System.out.println("variableHidingSub.sayi = " + variableHidingSub.sayi);
        System.out.println("variableParent.sayi = " + variableParent.sayi);
        System.out.println("variableParent.toplama() = " + variableParent.toplama());

        variableHidingSub.print();

        System.out.println("variableHidingParentAsSub.sayi = " + variableHidingParentAsSub.sayi);
    }
}
