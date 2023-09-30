package Day08_LogicalOprs;

public class Basamaklar {
    public static void main(String[] args) {
        System.out.println("Basamaklara ayırma.");
        System.out.println("-------------------");
        int sayi = 6543;
        int birler, onlar, yuzler, binler;

        birler = sayi % 10;
        System.out.println("Birler basamağı = " + birler);

        sayi = sayi / 10; // sayi = 654
        onlar = sayi % 10;
        System.out.println("Onlar basamağı = " + onlar);

        sayi = sayi / 10; // sayi = 65
        yuzler = sayi % 10;
        System.out.println("Yüzler basamağı = " + yuzler);

        sayi = sayi / 10; // sayi = 6
        binler = sayi % 10;
        System.out.println("Binler basamağı = " + binler);

    }
}
