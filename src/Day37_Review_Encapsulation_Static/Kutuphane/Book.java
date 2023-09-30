/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_Review_Encapsulation_Static.Kutuphane;

import java.util.ArrayList;

public class Book {
    private static int id = 1000;
    private int kitapNo;
    private String name;
    private String turu;
    private String yayinEvi;

 /*   private String yazar1;
    private String yazar2;
    private String yazar4;
    private String yazar5;
    */
    private ArrayList<Yazar> yazarlar = new ArrayList<>();

    private Book(){
        id++;
        setKitapNo(id);
    }

    public Book( String name, String turu, String yayinEvi) {
        id++;
        setKitapNo(id);
        setName(name);
        setTuru(turu);
        setYayinEvi(yayinEvi);
    }

    public static int getId() {
        return id;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase().trim();
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu.toUpperCase().trim();
    }

    public String getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(String yayinEvi) {
        this.yayinEvi = yayinEvi.toUpperCase().trim() ;
    }

    public ArrayList<Yazar> getYazarlar() {
        return yazarlar;
    }

    public void setYazarlar(ArrayList<Yazar> yazarlar) {
        this.yazarlar = yazarlar;
    }

    public void yazarEkle(Yazar yazar){
        this.yazarlar.add(yazar);
    }

    public void yazarlarPrint(){
        System.out.println();
        System.out.println(kitapInfo());
        System.out.println("Kitabın yazarı/ları");
        System.out.println("-------------------------");
        for (Yazar yazar:yazarlar){
            System.out.println(yazar);
        }
    }
    public String kitapInfo(){
        String str = "Kitap bilgileri\n";
        str += "-------------------------\n";
        str += "Kitap No    : " + getKitapNo() + "\n";
        str += "Kitap adı   : " + getName() + "\n";
        str += "Kitap Türü  : " + getTuru() + "\n";
        str += "Yayın evi   : " + getYayinEvi() + "\n";
        return str;
    }
    @Override
    public String toString() {
        String str = "";
        str += getKitapNo() + " " +  getName() + " " + getTuru() + " " + getYayinEvi() ;;
        return str;
    }
}
