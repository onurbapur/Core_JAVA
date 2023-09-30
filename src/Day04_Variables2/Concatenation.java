package Day04_Variables2;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println("Concatenation işlemleri...");
        System.out.println("--------------------------");
        System.out.println("Ankara" + "gücü"); //output--> Ankaragücü
        System.out.println("Mehmet" + "ali"); //output--> Mehmetali
        System.out.println("Elma" + 5); //output--> Elma5
        System.out.println(5 + "Elma"); //output--> 5Elma
        System.out.println(5 + "Elma" + 5); //output--> 5Elma5
        System.out.println(15 + 25.232324f); //aritmetik toplama yapar ve output-->40.232323 olur.

        final float KDV_YIYECEK = 0.18f;
        final float KDV_TEMIZLIK = 0.25f;
        final float KDV_EGITIM = 0.45F;

        int elmaFiyati = 100;
        int kacKilo;
        float toplam;
        float toplamKdvli;

       // kdv = 1.25f; final tanımlandığı için yeni bir değer atanamaz
        kacKilo = 1;
        toplam = elmaFiyati * kacKilo; //KDV siz
        toplamKdvli = toplam * (1 + KDV_YIYECEK); //toplamKdvli = (toplam * kdv) * 100

        System.out.println(); //Boş satır yazar
        System.out.println(toplam);

        System.out.println("Elmanın fiyatı........= " + elmaFiyati);
        System.out.println("Elma kilogram.........= " + kacKilo);
        System.out.println("KDV siz toplam fiyatı = " + toplam);
        System.out.println("KDV oranı.............= " + KDV_YIYECEK);
        System.out.println("KDV li  toplam fiyatı = " + toplamKdvli);



    }
}