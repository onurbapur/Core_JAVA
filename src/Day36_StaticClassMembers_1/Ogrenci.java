package Day36_StaticClassMembers_1;

import java.util.ArrayList;

public class Ogrenci {
    static int okulNo = 1000;
    String adi;
    int ogrNo;

    //Static vars...members of Class. Common for all instances of class.
    final static String okulAdi = "EuroTech Study";//Sabit(Constant) hale getirdik.
    final static String okulAdresi = "Germany";
    private static ArrayList<Ogrenci> ogrencilerList = new ArrayList<>();

    public Ogrenci(String adi) {
        okulNo++;//Class static variable
        this.ogrNo = okulNo;
        this.adi = adi;
       /* this.okulAdi = okulAdi;
        this.okulAdresi = okulAdresi;*/
    }
    public static void ogrenciEkle(Ogrenci... ogrenciler){//Var args
        for (Ogrenci eleman:ogrenciler){
            ogrencilerList.add(eleman);
        }
    }
    public static void ogrencilerListesi(){
        System.out.println("Öğrenciler Listesi");
        System.out.println("-----------------------------");
        for (Ogrenci ogrenci: ogrencilerList){
            System.out.println(ogrenci);
        }
    }
    @Override
    public String toString() {
        return "Ogrenci{" +
                "Öğrenci No=" + ogrNo +
                ", adi='" + adi + '\'' +
                ", okulAdi='" + okulAdi + '\'' +
                ", okulAdresi='" + okulAdresi + '\'' +
                '}';
    }
}
