package Day32_Constructor_1;

public class BankaProgram {
    public static void main(String[] args) {
        Banka banka1 = new Banka("ABC Bank","Ortaköy İstanbul");
        Musteri musteri1 = new Musteri("Ahmet Falanca",123,1234567890,1500,555123098);
        Musteri musteri2 = new Musteri("Merry Smith",2345,98765,5000,1212345678);
       /* System.out.println("musteri1.adi = " + musteri1.adi);
        System.out.println("musteri1.hesapNo = " + musteri1.hesapNo);
        System.out.println("musteri1.kimlikNo = " + musteri1.kimlikNo);
        System.out.println("musteri1.telefonNo = " + musteri1.telefonNo);
        System.out.println("musteri1.bakiye = " + musteri1.bakiye);*/

        musteri1.showInfo();
        System.out.println();
        musteri2.showInfo();

        banka1.musteriEkle(musteri1);
        banka1.musteriEkle(musteri2);
        banka1.showInfo();

        System.out.println("----Para çekme-----");
        banka1.paraCek(musteri1,2500);
        System.out.println();
        banka1.paraCek(musteri2,1750);
    }
}
