package Day17_Method2;

import java.util.Scanner;

public class MetodSayiAsalMi {
    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
                }
           }
        return true; // Number is prime
    }

    public static boolean asalMi(int sayi) {
        int sayac = 0;
        //Kendisinden başka sayılara tam bölünüp bölünmediğini test etmek için kendisinden küçük sayılara bakıyoruz. i < sayi
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                //Kendisinden başka bir sayıya kalansız bölünüyor demektir.
                //Dolayısıyla diğer sayılara bakmaya gerek yok.
                sayac++;
                break;
            }
        }
        if (sayac == 0){
            //Sayı asal bir sayıdır.
            return true;
        }
        return false;
    }
    public static void asalSayilar(int altSinir, int ustSinir){
        int sayac = 0; //Asal sayıların adetini belirleme için
        System.out.println(altSinir + " ile " + ustSinir + " arasındaki asal sayıların listesidir.");
        System.out.println("------------------------------------------------");
        for (int i = altSinir; i <= ustSinir; i++) {
            if (asalMi(i)) {
                sayac++;
                System.out.println(sayac +"- " + i + " bir asal sayıdır.");
            }
        }
        System.out.println();
        System.out.println(altSinir + " ile " + ustSinir + " sayıları arasında " + sayac + " adet asal sayı vardır.");
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.print("Asal olup olmadığını test edeceğiniz bir tam sayı giriniz : ");
        int sayi = klavye.nextInt();
        System.out.println(sayi + " asal bir sayı mı?  " + asalMi(sayi));

        if(asalMi(sayi)){
            System.out.println(sayi  + " asal bir sayıdır.");
        }else System.out.println(sayi  + " asal bir sayı değildir.");
        System.out.println();

        int baslangic = 0;
        int bitis = 0;
        System.out.println("Klavyeden girilen iki sayı arasındaki asal sayılar.");

        System.out.print("Başlangıç sayısını giriniz : ");
        baslangic= klavye.nextInt();

        System.out.print("Başlangıç sayısını giriniz : ");
        bitis= klavye.nextInt();
        System.out.println();

        //Method call
        asalSayilar(baslangic,bitis);
    }
}
