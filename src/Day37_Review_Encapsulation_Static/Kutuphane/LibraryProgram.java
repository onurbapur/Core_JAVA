/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_Review_Encapsulation_Static.Kutuphane;

public class LibraryProgram {

    public static void main(String[] args) {
        Library kutuphane = new Library("Halk Kütüphanesi","İstanbul/Ortaköy");

        Book kitap2 = new Book("Nutuk","Tarih","ABC yayın evi");
        Book kitap3 = new Book("Çalıkuşu","Roman","XYZ yayın evi");
        Book kitap4 = new Book("Java Programming","Bilgisayar","Primier yayın evi");

        Yazar yazar1 = new Yazar("M.Kemal Atatürk");
        Yazar yazar2 = new Yazar("Reşat Nuri Gültekin");
        Yazar yazar3 = new Yazar("John Smith");
        Yazar yazar4 = new Yazar("Ahmet Falanca");

        kitap2.yazarEkle(yazar1);
        kitap3.yazarEkle(yazar2);
        kitap4.yazarEkle(yazar3);
        kitap4.yazarEkle(yazar4);

        System.out.println(kitap2);
        System.out.println(kitap3);

        System.out.println(kitap2.kitapInfo());
        System.out.println(kitap3.kitapInfo());

        kitap2.yazarlarPrint();
        kitap3.yazarlarPrint();
        kitap4.yazarlarPrint();

        yazar1.kitapEKle(kitap2);
        yazar2.kitapEKle(kitap3);
        yazar3.kitapEKle(kitap4);
        yazar4.kitapEKle(kitap4);

        yazar1.kitaplarPrint();
        yazar2.kitaplarPrint();
        yazar3.kitaplarPrint();
        yazar4.kitaplarPrint();

        kutuphane.kitapEkle(kitap2);
        kutuphane.kitapEkle(kitap3);
        kutuphane.kitapEkle(kitap4);

        System.out.println(kutuphane.kutuphaneInfo());
        kutuphane.yazarInfo();
    }
}
