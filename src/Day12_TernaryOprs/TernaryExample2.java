package Day12_TernaryOprs;

import java.util.Scanner;

public class TernaryExample2 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int sayi = 0;
        String mesaj = "";

        System.out.println("Ternary example.");

        System.out.print("Sayının çift olup olmadığını kontrol edeceğim bir tamsayı giriniz ---> ");
        sayi = klavye.nextInt();


        if(sayi % 2 == 0){
            System.out.println("Sayı çift sayıdır.");
        }else{
            System.out.println("Sayı tek sayıdır.");
        }
        System.out.println("--------------");

        System.out.println("Ternary operation...");
        mesaj = (sayi % 2 == 0) ? "Sayı çift sayıdır." :"Sayı tek sayıdır.";
        System.out.println(mesaj);


    }
}
