/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception_2;

public class StackOverFlowTest {
    private int i = 0;


    public static void main(String[] args) {
        StackOverFlowTest stackOvr = new StackOverFlowTest();
        try {
            stackOvr.show();
        } catch (StackOverflowError err) {
            System.err.println("StackOverFlowError oluştu...");

        }
    }

    private void show() {
        System.out.println("I = " + i++);
        show();
    }
}
