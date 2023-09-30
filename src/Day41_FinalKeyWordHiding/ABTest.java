/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding;

public class ABTest {

    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();
        System.out.println("aaa.message = " + aaa.message);
        System.out.println("bbb.message = " + bbb.message);

        //Parent Class-AAA tipinde bir tanımlama yaparsak, instance(aabb) üzerinden  parent class ın değişkenine erişilir.
        AAA aabb = new BBB();
        System.out.println("aabb.message = " + aabb.message);
        System.out.println("bbb.message = " + bbb.message);
        //SubClass(BBB) ye instance(aabb) cast edilirse child class ın değişkenine erişilebilir.
        System.out.println("(BBB)aabb.message = " + ((BBB) aabb).message);


    }
}