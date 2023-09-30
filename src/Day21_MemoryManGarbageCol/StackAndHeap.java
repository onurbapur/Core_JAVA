package Day21_MemoryManGarbageCol;

public class StackAndHeap {

    public static void main(String[] args) {
        Urun urun1 = new Urun(); //new ile oluşturulan obje heap alanında yeralır.
                                // Oluşan objeye ulaşmak için kullandığımız değişken stack te yeralır(urun1,elma) gibi
        Urun elma = new Urun();

        //urun1 ve elma değişkenleri heap te oluşturulan objelere erişim için referans bilgilerini tutarlar ve stack te yeralırlar.

        int sayi = 0; // int primitive bir veri tipi olduğundan stack te yeralır.

        urun1.name = "Balık";

        //sayi is primitive variable therefore created on stack area
        //urun1 ...stack memory de oluşan değişken ve Heap te oluşturulan objenin adresini/referansını tutan değişken
        //elma ...stack memory de oluşan  değişken ve Heap te oluşturulan objenin adresini/referansını tutan değişken

        System.out.println(urun1); //urun1 değişkeninde bulunan heap te oluşturulan objenin referans adresin yazdırır.
        System.out.println(elma); //elma değişkeninde bulunan heap te oluşturulan objenin referans adresin yazdırır.

    }
    public void aMetodu(){ // stack
        int age; //Stack
        System.out.println("A metodu");
    }
}
