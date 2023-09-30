/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception_2;

public class StackOverFlow {
    public static int factoriyel(int n){
        System.out.println(n + "\r");
        if(n==1){
            return 1;
        }else  return n * factoriyel(n-1);
    }
    public static void baskaMetod(){
        System.out.println("Başka metod.");
    }
    public static void main(String[] args) {
        try {
            System.out.println("factoriyel(5) = " + factoriyel(50000));
        }catch (StackOverflowError stk){
            System.out.println("Hata oluştu");
            System.out.println("Hata: " + stk.getClass().getSimpleName());
          //  stk.printStackTrace();
        }
        System.out.println("Normal durum.");
        baskaMetod();
    }
}
