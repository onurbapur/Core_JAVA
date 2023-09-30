package Day32_Constructor_1;

public class Musteri {
    String adi;
    int hesapNo;
    int kimlikNo;
    double bakiye;
    int telefonNo;

   public Musteri(){

    }

    public Musteri(String adi, int hesapNo, int kimlikNo, double bakiye, int telefonNo) {
        this.adi = adi;
        this.hesapNo = hesapNo;
        this.kimlikNo = kimlikNo;
        this.bakiye = bakiye;
        this.telefonNo = telefonNo;
    }

    public void showInfo(){
       System.out.println("*** Müşteri bilgileri ***");
       System.out.println("-------------------------");
       System.out.println("Müşteri adı      : " + adi);
       System.out.println("Müşteri kimlik no: " + kimlikNo);
       System.out.println("Müşteri hesap no : " + hesapNo);
       System.out.println("Müşteri telefon  : " + telefonNo);
       System.out.println("Hesap Bakiyesi   : " + bakiye);
   }

}
