/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_Review_Encapsulation_Static.Kutuphane;

import java.util.ArrayList;

public class Yazar {
    private static int id = 9000;
    private int yazarNo;
    private String name;
    private ArrayList<Book> yazarinKitaplari = new ArrayList<>();

    public Yazar(String name) {
        id++;
        setYazarNo(id);
        setName(name);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Yazar.id = id;
    }

    public int getYazarNo() {
        return yazarNo;
    }

    public void setYazarNo(int yazarNo) {
        this.yazarNo = yazarNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public ArrayList<Book> getYazarinKitaplari() {
        return yazarinKitaplari;
    }

    public void setYazarinKitaplari(ArrayList<Book> yazarinKitaplari) {
        this.yazarinKitaplari = yazarinKitaplari;
    }

    public void kitapEKle(Book kitap){
        yazarinKitaplari.add(kitap);
    }
    public void kitaplarPrint(){
        System.out.println();
        System.out.println(yazarInfo());
        System.out.println("Yazarın kitabı/ları");
        System.out.println("-------------------------");
        for (Book kitap:yazarinKitaplari){
            System.out.println(kitap);
        }
    }
    public String yazarInfo(){
        String str = "";
        str += "Yazar No    : " + getYazarNo() + "\n";
        str += "Yazar adı   : " + getName() + "\n";
        return str;
    }
    @Override
    public String toString() {
        String str = "";
        str += getYazarNo() + " " +  getName();
        return str;
    }
}
