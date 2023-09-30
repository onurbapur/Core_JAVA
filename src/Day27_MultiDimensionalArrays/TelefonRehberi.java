package Day27_MultiDimensionalArrays;

public class TelefonRehberi {
    /*
        ad
        soyad
        telefonNo
        adresi
    */

    public static void main(String[] args) {
        Kisi[] rehberim = new Kisi[5];

        Kisi kisi1   = new Kisi();
        Kisi kisi2   = new Kisi();
        Kisi kisi3   = new Kisi();

        kisi1.ad = "Ali";
        kisi1.soyad = "Can";
        kisi1.telefonNo = 12345;
        kisi1.adres = "Ankara-Kızılay";

        kisi2.ad = "Mehmet";
        kisi2.soyad = "Can";
        kisi2.telefonNo = 34567;
        kisi2.adres = "İstanbul-Beyoğlu";

        kisi3.ad = "Ali";
        kisi3.soyad = "Gül";
        kisi3.telefonNo = 987654;
        kisi3.adres = "Kahramanmaraş-Merkez";

        rehberim[0] = kisi1;
        rehberim[1] = kisi2;
        rehberim[2] = kisi3;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Lütfen rehberde aradığınız ismi giriniz : ");
//        Kisi.isimdenBul(rehberim,sc.nextLine());

        Kisi.listele(rehberim);
        // Kisi.isimdenBul(rehberim,"Ali");
        // Kisi.soyadtanBul(rehberim,"Gül");
    }
}
