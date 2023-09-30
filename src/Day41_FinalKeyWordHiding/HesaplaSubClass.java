/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding;

public class HesaplaSubClass extends Hesapla{
   /* @Override
    public double kdvHesapla(double amount){
        System.out.println("Override edilmiş metod.");
        return amount * KDV + amount;
    }*/
    @Override
    public double kdvHesapla(int amount) {
       System.out.println("Override edilmiş metod.");
       return amount * KDV + amount;
   }


}
