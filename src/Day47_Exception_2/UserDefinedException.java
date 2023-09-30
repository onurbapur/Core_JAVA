/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception_2;

import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        System.out.print("Yaşınızı giriniz : " );
        age = scanner.nextInt();

        try {
            if(age < 18){
              throw new YasHatasi("Yaş ile ilgili bir hata oluştu!");
            }else System.out.println("Uygun yaş bilgisi girilmiş.");
        }catch (YasHatasi yasHatasi){
            //yasHatasi.printStackTrace();
            System.out.println("yasHatasi.getMessage() = " + yasHatasi.getMessage());
        }
        System.out.print("Kilonuzu giriniz : " );
        int kilo = scanner.nextInt();

        try {
            if(kilo > 90){
                throw new FazlaKiloException("Kilonuz bu cihazı kullanmaya elverişli değildir.");
            }else System.out.println("Bu cihazı kullanabilirsiniz.");
        }
        catch (FazlaKiloException fazlaKiloException){
            System.out.println(fazlaKiloException.getMessage());
        }
    }
}
