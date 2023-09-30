
/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package OYUNLAR.Tombala;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TombalaCard {
    static int id;
    int kartNo;
    String color;
    int[][] sayilar = new int[3][5]; //Kart sayıları dizisi
    int[][] copyOfSayilar = new int[3][5]; //Kart sayıları dizisinin kopyası. Tombla olup olmadığını hesaplamak için kullanılacak

    static int[] torba = new int[90];//Torbadan sayı çekilişi için random 90 farklı sayı
    static int[] kartSayilar = new int[90];
    static ArrayList<TombalaCard> kazananKartlar = new ArrayList<>(); //Tombala yapan kartlar

    TombalaCard(String color){
        id++;
        this.kartNo = id;
        this.color = color.toUpperCase();
        tombalaKartOlustur();
        arrayYaz(sayilar,"Oyun kartı");
    }

    private void tombalaKartOlustur() {//Rastgele sayılarla kartların oluşturulması
        Random sayi = new Random();
        int rastSayi = 0;
        basadon:
        for (int i = 0; i < 90; i++) {
            rastSayi = sayi.nextInt(90)+1;
            for (int j = 0; j < kartSayilar.length; j++) {
                if(kartSayilar[j] != rastSayi){//1 ile 90 arası unique rastgele sayısı oluşturmak için kullanılan dizi
                    kartSayilar[j] = rastSayi;//Unique
                    for (int k = 0; k < sayilar.length; k++) {//Kartın satırları
                        for (int l = 0; l < sayilar[0].length; l++) {//Kartın sütünları
                            if(sayilar[k][l] == 0 || sayilar[k][l] == rastSayi){//sayı belirlenmediyse veya rastgele sayı ile aynıysa
                                sayilar[k][l] = rastSayi;
                                continue basadon; //döngünün başına dön yeni bir rasgele sayı oluştur.
                            }
                        }
                    }
                }
            }
        }
       copyArray(sayilar);
    }

    private void copyArray(int[][] source){//Orijinal sayı kartından bir kopya oluşturur.
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
               this.copyOfSayilar[i][j] = source[i][j];
            }
        }
    }
    public void nonTombalaKartlarYaz(){ //
        if(!compareArrZero(copyOfSayilar)){//Tombala yapan kart/kartların dışındakileri yazdır.
            arrayYaz(copyOfSayilar,"Eksik Numaralar");//oyunu kazanamayan kartların torbadan çıkmayan numaralarını yazdır
       }
    }
    public void findNumberinKart(int number){ //Torbadan çekilen sayı oyun kartında var mı?
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j <sayilar[0].length; j++) {
              if(sayilar[i][j] == number) {
                  //System.out.println("("+number + ") sayısı " + color + " renkli kartta var.");
                  System.out.println(color + "-" + kartNo +" nolu kart-> (" + number + ") sayısı bende var.");
                  copyOfSayilar[i][j] = 0;
              }
            }
        }
    }

    public boolean tombalaMi(){
        boolean result = false;
        boolean cinko = true;
        int cinkoSay = 0;

        //For each
        int i = 1;//For each satır sayısını yazdırmak için
        for(int[] rows: this.copyOfSayilar){
            for(int row: rows){
               // toplam += row;
                if(row != 0) cinko = false;
            }
            if (cinko){
                System.out.println(color + "-" + kartNo +" nolu kartın " + i + ". satırı ÇİNKO!");
                i++;
                cinkoSay++;
            }
        }
        if(cinkoSay == 3){// bütün satırlar çinko olduysa bu kart tombaladır.
            System.out.println("Çinko say : " + cinkoSay);
            result =  true;
        }
        return result;
    }

    public static void tombalaTorba(){ //Torba için 90 adet rastgele unique sayı oluştur
        Random torbaSayi = new Random();
        int sayi = 0;
        int counter = 0;
        basaDon:
        while (counter < 90 ){
            sayi = torbaSayi.nextInt(90) + 1;
            for (int j = 0; j < 90; j++) {
                if(torba[j] == sayi){
                    continue basaDon;
                }
            }
            torba[counter++] = sayi;
        }
       System.out.println("Tombala Torba sayılar = " + Arrays.toString(torba) );
    }

    private boolean compareArrZero(int[][] copyOfSayilar){//Dizi(Oyun Kartı) 0'lardsn oluşuyorsa tombala yapmıştır
        boolean result = false;
        int toplam = 0;

        //For each...
        for (int[] rows : copyOfSayilar) {
            for (int row : rows) {
                toplam += row;
            }
        }
        //For
     /* for (int i = 0; i < copyOfSayilar.length; i++) {
            for (int j = 0; j < copyOfSayilar[i].length; j++) {
                toplam += copyOfSayilar[i][j];
            }
        }*/
        if (toplam==0) result = true;
        return result;
    }
    public void arrayYaz(int[][] arr,String mesaj){
        System.out.println(color + "-" + kartNo + " " + mesaj);
        System.out.println("-------------------------");

        //For each
        int i = 1;
        for(int[] rows:arr){
            System.out.print("Satır-" + i + " -> ");
            for(int row: rows){
                System.out.printf("%2d " ,row);
            }
            i++;
            System.out.println();
        }

        //For
       /* for (int i = 0; i < arr.length; i++) {
            System.out.print("Satır-" + (i + 1) + " -> ");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%2d " ,arr[i][j]);
            }
            System.out.println();
        }
       */
        System.out.println("-------------------------");
    }
}
