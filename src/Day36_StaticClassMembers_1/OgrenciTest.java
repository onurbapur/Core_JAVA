package Day36_StaticClassMembers_1;

public class OgrenciTest {
    public static void main(String[] args) {
        /*Ogrenci ogrenci1 = new Ogrenci(123,"Ahmet Student","EuroTech Study","Almanya");
        Ogrenci ogrenci2 = new Ogrenci(456,"Hasan Ogrenci","EuroTech Study","Almanya");
        Ogrenci ogrenci3 = new Ogrenci(234,"Hans Smithon","EuroTech Study","Almanya");*/

        Ogrenci ogrenci1 = new Ogrenci("Ahmet Falanca");
        Ogrenci ogrenci2 = new Ogrenci("Mehmet Filanca");


        System.out.println("ogrenci1 = " + ogrenci1);
        System.out.println();
        System.out.println("ogrenci2 = " + ogrenci2);
        Ogrenci.ogrenciEkle(ogrenci1,ogrenci2); //Passing variable numbers of arguments type Ogrenci
        Ogrenci.ogrencilerListesi();
    }
}
