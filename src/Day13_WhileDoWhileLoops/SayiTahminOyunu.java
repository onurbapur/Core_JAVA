package Day13_WhileDoWhileLoops;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        //Sayı tahmin oyunu
        int rastGeleSayi,tahminSayi, tahminAdedi = 1;
        Scanner klavye = new Scanner(System.in);

        Random rastgele  = new Random();
        rastGeleSayi = rastgele.nextInt(10) + 1;

       // System.out.println("Bilgisayarın tahmin ettiği sayı = " + rastGeleSayi);

        System.out.println("Sayı tahmin oyununa hoş geldiniz!");
        System.out.print("Tahmininizi giriniz ---> ");
        tahminSayi = klavye.nextInt();

        if(tahminSayi <= 10){
            while (rastGeleSayi != tahminSayi){
                tahminAdedi++;
                System.out.println("Tahmininiz yanlış!");
                if(rastGeleSayi > tahminSayi){
                    System.out.println("Benim tuttuğum sayı senin tahmininden büyüktür.");
                }else System.out.println("Benim tuttuğum sayı senin tahmininden küçüktür.");
                System.out.println();
                System.out.print("Yeni Tahmininizi giriniz ---> ");
                tahminSayi = klavye.nextInt();
            }
            System.out.println("Tebrikler! " +  tahminAdedi + " tahminde sayıyı doğru tahmin ettiniz!");
        }else System.out.println("Bilgisayarın tahmin sınırları dışında bir sayı girdiniz!");

    }
}
