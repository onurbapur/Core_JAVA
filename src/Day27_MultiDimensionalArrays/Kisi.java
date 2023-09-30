package Day27_MultiDimensionalArrays;

public class Kisi {
    String ad;
    String soyad;
    int telefonNo;
    String adres;

    public void printInfo(){
        System.out.println("Adı         : " + ad);
        System.out.println("Soyadı      : " + soyad);
        System.out.println("Telefon no  : " + telefonNo);
        System.out.println("Adres       : " + adres);
    }

    public static void listele(Kisi[] kisiler){
        for (Kisi kisi : kisiler) {
           if(kisi!=null) {
               kisi.printInfo();
               System.out.println("------------------------------------");
           }
        }
    }

    public static void isimdenBul(Kisi[] kisiler, String isim){
        System.out.println("Rehberimdeki isim listesi");
        System.out.println("-------------------------");
        int sayac = 0;
        for (Kisi kisi : kisiler) {
            if(kisi!=null && kisi.ad != null && kisi.ad.equals(isim.trim())){ //trim() başta ve sonda olan boşlukları siler
                sayac++;
                kisi.printInfo();
                System.out.println("------------------");
            }
        }
        if (sayac == 0 ) {
            System.out.println("Kişi rehberde bulunamadı!");
        } else System.out.println(sayac + " kayıt listelendi.");
    }

    public static void soyadtanBul(Kisi[] kisiler, String soyad){
        System.out.println("Rehberimdeki isim listesi");
        System.out.println("-------------------------");
        int sayac = 0;
        for (Kisi kisi : kisiler) {
            if(kisi!=null && kisi.soyad != null && kisi.soyad.equals(soyad.trim())){
                sayac++;
                kisi.printInfo();
                System.out.println("------------------");
            }
        }
        if (sayac == 0 ) {
            System.out.println("Kişi rehberde bulunamadı!");
        } else System.out.println(sayac + " kayıt listelendi.");
    }
}
