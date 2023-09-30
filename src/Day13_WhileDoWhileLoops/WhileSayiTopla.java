package Day13_WhileDoWhileLoops;

import java.util.Scanner;

public class WhileSayiTopla {
    public static void main(String[] args) {
        //Klavyeden girilen tam sayıya kadar olan sayıları toplayan program.
        Scanner klavye = new Scanner(System.in);
        int sonuc = 0;
        int sayi = 0;
        int araToplam = 0;

        System.out.print("Klayyeden 0 dan büyük bir sayı giriniz---> ");
        sayi = klavye.nextInt();

        //Derste acelece kurgulanmıştı..o yüzden doğru çalışmıyor
        /*
        while (sayi > 0){
            sonuc = sonuc + sayi;
            if(sayi % 5 == 0){
                araToplam = sonuc;
                System.out.println("Ara toplam = " + araToplam);
            }
            sayi--;
        }
        */

//While loop ile yapılanı
        System.out.println("While loop.....");
        int j=0;
        while (sayi >= j){
            if((j % 5 == 0) && sonuc!=0 ){
                araToplam = sonuc;
                System.out.println("  Ara toplam = " + araToplam);
            }
            sonuc = sonuc + j;
            j++;
        }
        System.out.println("Toplam sonuç = " + sonuc);

        System.out.println("--------------------");
//For loop ile yapılanı
        System.out.println("For loop.....");
        sonuc = 0;

        for (int i = 0; i <= sayi; i++) {
            if((i % 5 == 0) && sonuc!=0){
                araToplam = sonuc;
                System.out.println("  Ara toplam = " + araToplam);
            }
            sonuc = sonuc + i;
        }
        System.out.println("Toplam sonuç = " + sonuc);

        System.out.println("****************************");

       //////////////////////////////////////////////////////
        System.out.println("Toplam sonuç = " + sonuc);

        int ciftSayi = 0,tekSayi = 0 ;

       /*
       System.out.print("\nKlavyeden bir tam sayı giriniz---> ");
        sayi = klavye.nextInt();
       */
        while (sayi > 0){
            if (sayi % 2 == 0){
                ciftSayi = ciftSayi + sayi;
            }else{
                tekSayi = tekSayi + sayi;
            }
            sayi--;
        }
        System.out.println();
        System.out.println("Çift sayıların toplamı  = " + ciftSayi);
        System.out.println("Tek sayıların toplamı   = " + tekSayi);
        System.out.println("Toplam sonuç            = " + (ciftSayi + tekSayi));
    }
}
