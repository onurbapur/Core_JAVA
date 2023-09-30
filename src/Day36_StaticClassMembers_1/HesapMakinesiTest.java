package Day36_StaticClassMembers_1;

public class HesapMakinesiTest {
    public static void main(String[] args) {
       /* HesapMakinesi hsp1 = new HesapMakinesi();
        hsp1.topla(5,6);
        System.out.println("hsp1.sonuc = " + hsp1.sonuc);*/

        HesapMakinesi.topla(12,56);
        HesapMakinesi.topla(2,20,5,5,5,5,5,5,53,3,5,2); //Passing variable numbers of arguments tyep int

        System.out.println("Math.sqrt(12) = " + Math.sqrt(12)); //Math class

        Ogrenci ogrenci1 = new Ogrenci("Ahmet");
        Ogrenci ogrenci2 = new Ogrenci("Ali");
        Ogrenci ogrenci3 = new Ogrenci("Hasan");
        Ogrenci ogrenci4 = new Ogrenci("Mehmet");
        Ogrenci ogrenci5 = new Ogrenci("Mustafa");
        Ogrenci ogrenci6 = new Ogrenci("Hatice");


    }
}
