/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package OYUNLAR.Tombala;

public class TombalaOyunu {
    public static void main(String[] args) throws InterruptedException {
        boolean kazandiMi = false;
        TombalaCard[] kartlar = new TombalaCard[10];
        //10 adet kart nesnesi oluşturuldu.
        TombalaCard kart1 = new TombalaCard("Mavi");
        TombalaCard kart2 = new TombalaCard("Kırmızı");
        TombalaCard kart3 = new TombalaCard("Sarı");
        TombalaCard kart4 = new TombalaCard("Yeşil");
        TombalaCard kart5 = new TombalaCard("Siyah");
        TombalaCard kart6 = new TombalaCard("Lacivert");
        TombalaCard kart7 = new TombalaCard("Pembe");
        TombalaCard kart8 = new TombalaCard("Mor");
        TombalaCard kart9 = new TombalaCard("Kahverengi");
        TombalaCard kart10 = new TombalaCard("Turkuaz");

        //Ouşturulan 10 addet kart diziye eklendi.
        kartlar[0] = kart1;
        kartlar[1] = kart2;
        kartlar[2] = kart3;
        kartlar[3] = kart4;
        kartlar[4] = kart5;
        kartlar[5] = kart6;
        kartlar[6] = kart7;
        kartlar[7] = kart8;
        kartlar[8] = kart9;
        kartlar[9] = kart10;

        TombalaCard.tombalaTorba(); //Tombala torbası için rastgele unique sayı üretir.

        System.out.println("-----------------------------------");
        for (int i = 0; i < 90; i++) {
            System.out.println("TORBADAN " + TombalaCard.torba[i] + " sayısını çektim."); //Torbadan sayı çek.
            Thread.sleep(3000); //Torbadan numara çekme hızı (mili saniye)

            for (int j = 0; j < 10; j++) {// 10 adet oyun kartı
                kartlar[j].findNumberinKart(TombalaCard.torba[i]);//Torbadan çekilen sayının herbir oyun kartında olup olmadığını kontrol.
                if(kartlar[j].tombalaMi()){
                    kazandiMi = true; //Oyunu bitirmk için Tombala yapan kart kontrolu.
                    TombalaCard.kazananKartlar.add(kartlar[j]); //Kart tombala ise kazananlar listesine ekle
                }
            }
            if (kazandiMi) break; //Tombala yapan kart varsa kart kontrolünü/oyunu bitir.
        }
        tombalaKartlarYaz(); //Tombala yapan kartları yazar.

        System.out.println("-- KAZANAMAYAN KARTLAR --");
        for (int j = 0; j < 10; j++) {
            kartlar[j].nonTombalaKartlarYaz(); //Kartların en son halini yazdır.
        }
    }
    public static void tombalaKartlarYaz(){
        //Tombala yapan kartları listeler.
        System.out.println("TOMBALA YAPAN KART SAYISI = " + TombalaCard.kazananKartlar.size());
        for (TombalaCard tombalaCard: TombalaCard.kazananKartlar){
            tombalaCard.arrayYaz(tombalaCard.sayilar, "TOMBALA YAPTI");
        }
    }
}
