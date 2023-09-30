/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers;

import Day40_AccessModifiers.Pack_A.Class_A;

public class Class_ATest {
    public static void main(String[] args) {
        Class_A class_a = new Class_A(); //Public tanımlandığından başka paketlerden de erişilebilir. No args(Default) constructor
        class_a.name = "Deneme";

   //  Class_A class_a1 = new Class_A("deneme",234); //Default access mod. ile tanımlandığından erişilemez


    }
}
