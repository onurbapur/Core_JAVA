/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers;

public class AccessModifiers {
    private int id;
    protected int TCNo;
    public String name;
    int sayi; //Default access modifier.

    private void add(){
        System.out.println("I am private method.");
    }

    protected void proMethod(){
        System.out.println("I am protected method.");
    }

    void defaultMethod(){//Default
        System.out.println("I am default method.");
    }

    public void pubMethod(){
        System.out.println("I am public method.");
    }

    private void privateMethod(){
        System.out.println("I am private method.");
    }

    public static void main(String[] args) {
        System.out.println("Access Modifiers in Java.");
        AccessModifiers accessModifiers = new AccessModifiers();
        accessModifiers.privateMethod();

        accessModifiers.id=1; //private olmasına rağmen aynı class da olduğum için erişebildim.

    }
}
