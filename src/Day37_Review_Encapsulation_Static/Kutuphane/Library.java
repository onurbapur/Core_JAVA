/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_Review_Encapsulation_Static.Kutuphane;

import java.util.ArrayList;

public class Library {
   private String name;
   private String adresi;

   private ArrayList<Book> kitaplar = new ArrayList<>();

    public Library(String name, String adresi) {
        setName(name);
        setAdresi(adresi);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public String getAdresi() {
        return adresi;
    }

    public void setAdresi(String adresi) {
        this.adresi = adresi.trim().toUpperCase();
    }

    public ArrayList<Book> getKitaplar() {
        for (Book kitap: kitaplar){
            kitap.kitapInfo();
            kitap.yazarlarPrint();
        }
        return kitaplar;
    }

    public void setKitaplar(ArrayList<Book> kitaplar) {
        this.kitaplar = kitaplar;
    }

    public void kitapEkle(Book kitap){
        kitaplar.add(kitap);
    }

    public void yazarInfo(){
        for (Book kitap:getKitaplar()){
            for(Yazar yazar:kitap.getYazarlar()){
                yazar.yazarInfo();
            }
        }
    }
    public String kutuphaneInfo(){
        String str = "Kütüphane bilgileri\n";
        str += "-------------------------\n";
        str += "Kütüphane adı       : " + getName() + "\n";
        str += "Kütüphane adresi    : " + getAdresi() + "\n";
        str += "Kitap sayısı        : " + getKitaplar().size() + "\n";
        str += "Kütüphanedeki kitapların listesi \n";
        str += "-------------------------------- \n";
        str +=  getKitaplar() + "\n";
        return str;
    }

}
