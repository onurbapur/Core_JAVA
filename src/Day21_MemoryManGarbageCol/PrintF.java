package Day21_MemoryManGarbageCol;

public class PrintF {

    public static void main(String[] args) {
        String name;
        double fiyat;
        int sayi;

        name = "Golden";
        fiyat = 1035.545645756;
        sayi = 1500;

        //%s --> String
        //%f --> float ya da double
        //%d --> decimal
        //%n --> newline-satır başı.

        System.out.printf("Elma             %-5s ---- %-3.2f %-10d %n" ,name,fiyat,sayi);
        System.out.printf("Elma Amasya      %-5s ---- %-3.2f TL %5d TL %n" ,name,fiyat,sayi);
        System.out.printf("Elma Isparta     %-5s ---- %-3.2f TL %5d TL %n" ,name,fiyat,sayi);
        System.out.printf("Elma Gümüşhane   %-5s ---- %-3.2f TL %5d TL %n" ,name,fiyat,sayi);
        System.out.printf("Elma Tokat       %-5s ---- %-3.2f TL %5d TL %n" ,name,fiyat,sayi);

    }
}
