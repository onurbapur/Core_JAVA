/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.Singleton;

public class Single { //Outer class can only be either public or default.Can not be Protected or private
    static Single singleInstance;
    String name;
    static int numberOfObject;
    static int numbersOfMax_Object;

     private Single(){
         numberOfObject++;
        System.out.println(numberOfObject +  " Object has created.");
    }
    public static Single objeOlustur(){
         if(numberOfObject < numbersOfMax_Object){
             singleInstance = new Single();
         } else singleInstance = null;
       return singleInstance;
    }
}
