package Day21_MemoryManGarbageCol;

public class MarketProg {
    public static void main(String[] args) {
        Urun peynir = new Urun();
        Urun zeytin = new Urun();
        Urun elma = new Urun();
        Urun elma1 = new Urun();

        //Initial values assigned dot(.) operator.
        peynir.name = "Ezine";
        peynir.birimFiyati = 80;
        peynir.miktar = 2;

        zeytin.name = "Gemlik";
        zeytin.birimFiyati = 75;
        zeytin.miktar = 1.5;

        elma.name = "Star king";
        elma.birimFiyati = 15;
        elma.miktar = 3;

        //Initial values assigned with method.
        elma1.urunOlustur("Golden",12.5,4);

        //Initial values assigned with parameterized constructor.
        Urun mandalina = new Urun("Finike",13,3);
        Urun balik = new Urun("Çinekop",125,1.5);

        double toplamOdeme;

        System.out.println("----------İstanbul Halk Fabrika------------");
        System.out.println("Peynir " + peynir.name + " = " + peynir.fiyatHesapla());
        System.out.println("Peynir KDV'li   = " + peynir.kdvHesapla());

        System.out.println("Zeytin          = " + zeytin.fiyatHesapla());
        System.out.println("Zeytin KDV'li   = " + zeytin.kdvHesapla());

        System.out.println("Elma            = " + elma.fiyatHesapla());
        System.out.println("Elma KDV'li     = " + elma.kdvHesapla());

        System.out.println("Mandalina       = "  + mandalina.fiyatHesapla());
        System.out.println("Mandalina KDV'li= " + mandalina.kdvHesapla());

        System.out.println("Balık           = " + balik.fiyatHesapla() );
        System.out.println("Balık KDV'li    = "  + balik.kdvHesapla());

        System.out.println("Elma    " + elma1.name + " = " + elma1.fiyatHesapla());
        System.out.println("Elma KDV'li     = " + elma1.kdvHesapla());

        toplamOdeme = peynir.kdvHesapla() + zeytin.kdvHesapla()
                + elma.kdvHesapla()
                + mandalina.kdvHesapla()
                + balik.kdvHesapla()
                + elma1.kdvHesapla();

        System.out.println("-----------------------------------");
        System.out.println("Ödenecek toplam alış veriş miktarı = " + toplamOdeme);
   }
}
