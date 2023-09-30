package Day16_Method1;

import java.util.Scanner;

public class Converter {
    public static void celToFahr(int celcius){
        //fahrenheit = (celcius * 9) / 5 + 32;
        int fahr = (celcius * 9) / 5 + 32;
        System.out.println(celcius + " Derece = "  + fahr + " fahr. eder.");
    }
    public static void fahrToCel(int fahren){
        // celcius = (5 * (fahrenheit - 32)) / 9;
        int cel = (5 * (fahren - 32)) / 9;
        System.out.println(fahren + " Fahr. = "  + cel + " derece eder.");
    }
    public static void kdvHesapla(double fiyat){
       double kdvlFiyat = fiyat +  (fiyat * 0.18);
        System.out.println("Ürünün KDV'li fiyatı = " + kdvlFiyat);
    }
    public static void f(int y){
         int x= 2 * (y+1);
         System.out.println("f(x) = " + x);
    }
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        celToFahr(100);
        fahrToCel(100);
        celToFahr(20);
        kdvHesapla(12345);

        System.out.print("KDV'sini hesaplayacağınız ürünün fiyatını giriniz ---> ");
        kdvHesapla(klavye.nextDouble());

        f(15);

    }
}
