package Day29_WrapperClasses_1;

import java.util.Scanner;

public class WrapperClass_Example_3 {
    public static void main(String[] args) {
        //Scanner class known problem and Wrapper Class solution
        Scanner verGir = new Scanner(System.in);
        double fiyat = 0;
        int miktar = 0;
        String isim = "";

        System.out.print("Ürün fiyatını giriniz : ");
        fiyat = Double.parseDouble(verGir.nextLine());

        System.out.print("Ürünün miktarını giriniz : ");
        miktar = Integer.parseInt(verGir.nextLine());

        System.out.print("Ürün adını giriniz : ");
        isim = verGir.nextLine();

        System.out.println("isim = " + isim);
        System.out.println("miktar = " + miktar);
        System.out.println("fiyat = " + fiyat);

       int abc = Integer.parseInt("12345");
       double dbl = Double.parseDouble("122.566");

       String str1 = "12345";
       int fiyati = Integer.parseInt(str1);
       Integer fiyatW = Integer.valueOf(str1);









    }

}
