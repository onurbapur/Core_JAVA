/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritence_2.A;

public class APackageClass {
    public int no;
    public String fName; //Everywhere
    protected int salary; //Inheritance---> can only be access in same package or inheritance
    String address; //Default same package
    private String special; //Same class

    public APackageClass(){//Only derived class can access
        System.out.println("APackageClass-Super class constructor called");
    }

    protected void xyz(){//Inheritance---> can only be access in same package or inheritance
      address = "Adress";
    }

    void print(){ //Default access--same package classes can only access
        System.out.println("Printing...");
    }

    int toplama(){ //Default access--same package classes can only access
      return 1;
    }

}
