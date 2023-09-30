/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding;

public class Person {
    //Instance/Object-variables every instance of class has own copy of variables
    int age;
    String name;

    //Class variables(Static) are shared by instance of class and created in memory only one copy
    static int id;
    static String workAddress ="ABC plaza Ortaköy/Istanbul";
    static String workWebAddress ="www.abcplaza.com.tr";
}
