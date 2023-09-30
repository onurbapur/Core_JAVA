package Day13_WhileDoWhileLoops;

import java.util.Scanner;

public class DoWhileCarpimTablosu {
    //Klavyeden girilen sayının çarpım tablosunu yazan program
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int sayi = 0;
        int sayi2 = 1;
        System.out.print("Klavyeden çarpım tablosunu yazdıracağınız bir sayı giriniz---> ");
        sayi = klavye.nextInt();

        do {//loop starts
            System.out.println(sayi + " * " + sayi2 + " = "  + (sayi * sayi2));
            sayi2++;

        }while (sayi2 <= 10);
    }
}
