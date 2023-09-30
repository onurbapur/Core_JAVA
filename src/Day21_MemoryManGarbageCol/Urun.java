package Day21_MemoryManGarbageCol;

public class Urun {
    String name;
    double birimFiyati;
    double miktar;

    public Urun(){

    }
    public Urun(String name, double birimFiyati, double miktar){
        this.name = name;
        this.miktar = miktar;
        this.birimFiyati = birimFiyati;
    }

    public void urunOlustur(String name, double birimFiyati, double miktar){
        this.name = name;
        this.miktar = miktar;
        this.birimFiyati = birimFiyati;
    }

    public double fiyatHesapla(){
        return birimFiyati * miktar;
    }
    public double kdvHesapla(){
        return fiyatHesapla() * 1.18;
    }
}
