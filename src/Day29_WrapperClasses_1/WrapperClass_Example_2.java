package Day29_WrapperClasses_1;

import java.util.Scanner;

public class WrapperClass_Example_2 {
    public static void main(String[] args) {
        //Scanner class known problem and classic solution
        Scanner veriGir = new Scanner(System.in);

        String isim = "";
        int fiyat = 0;

        System.out.print("Ürünün fiyatını giriniz : ");
        fiyat = veriGir.nextInt();

        veriGir.nextLine(); //Clear the keyboard buffer

        System.out.print("Ürünün adını giriniz : ");
        isim = veriGir.nextLine();

        System.out.println("isim = " + isim);
        System.out.println("fiyat = " + fiyat);


    }
}
