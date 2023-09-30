package Day12_TernaryOprs;

public class TernaryExample1 {
    public static void main(String[] args) {
        System.out.println("Ternary example...");
        int sayi;
        String mesaj="";

        sayi = 25;

        //if else ile yapımı
        System.out.println("if..else operation");
        if(sayi > 20){
            mesaj = "Sayı 20'den büyüktür.";
        }else {
            mesaj = "Sayı 20'den büyük değildir.";
        }
        System.out.println(mesaj);

        System.out.println();
        //Ternary operation
        System.out.println("Ternary operation.");

        mesaj = (sayi > 20) ? "Sayı 20'den büyüktür." :"Sayı 20'den büyük değildir.";
        System.out.println(mesaj);

        //Assignmet yapmadan println ile ternary operasyon sonucunu yazdırabiliriz.
        System.out.println((sayi > 20) ? "Sayı 20'den büyüktür." :"Sayı 20'den büyük değildir.");
    }
}
