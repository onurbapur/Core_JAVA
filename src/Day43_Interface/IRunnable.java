/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface;

public interface IRunnable {
   public static int speed = 40;
   public void run();
  static void staticBirMetod() {
      System.out.println("I am a static method in Interface. You can invoke me by Interface name and dot operator.");
  }

   private void ozelMetod(){
      System.out.println("I am a private defined method.");
   }
   default void fourLegsRun() {
        System.out.println("I am a default method added after JDK 8.");
        ozelMetod();
   }

}
