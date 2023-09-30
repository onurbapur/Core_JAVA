package Day25_StringClass2;

import java.util.Scanner;

public class SwitchCase_KelimeTahmin {
    public static void main(String[] args) {
        System.out.println("Kelime tahmin oyunu...");
        System.out.println();
        System.out.println("Oyundan çıkmak için kelime tahminini 'bitir' olarak giriniz.");
        System.out.println("......................................");
        System.out.println("...          KELİME LİSTESİ        ...");
        System.out.println("... elma, armut, kiraz, muz, kavun ...");
        System.out.println("......................................");

        int rastgeleKelime = (int) (Math.random() * 5 + 1); //1 ile 5 arasında sayı(5 kelime olduğu için)
        System.out.println("Senin için rastgele bir kelime seçtim!");
        String kelime = "";
        String tahmin = "";
        Scanner kelimeGir = new Scanner(System.in);

        switch (rastgeleKelime){
            case 1:
                kelime = "elma";
                break;
            case 2:
                kelime = "armut";
                break;
            case 3:
                kelime = "kiraz";
                break;
            case 4:
                kelime = "muz";
                break;
            case 5:
                kelime = "kavun";
                break;
            default:
                System.out.println("Listede olmayan bir kelime seçtiniz!");
        }
        int tahminSayisi=0;

        boolean devamMi = true;

        while (devamMi) {
            //System.out.println("Seçtiğim Kelime : " + kelime);
            System.out.println();

            System.out.print("Tahmin ettiğiniz kelimeyi giriniz...: ");
            tahmin = kelimeGir.next();
            tahminSayisi++;

            if (tahmin.equals("bitir")){
                System.out.println("Kelime bulma oyununu oynadığınız için teşekkürler!");
                //break;
                devamMi = false;
            }else if (kelime.equals(tahmin)) {
                System.out.println("Tebrikler Doğru bildiniz...");
                System.out.println("Tuttuğum kelime ---> " + kelime);
                System.out.println(tahminSayisi + " tahminde bildiniz!");
                devamMi = false;
            }else{
                System.out.println("Tahmininiz yanlış!");
                //System.out.println("Tuttuğum kelime ---> " + kelime);
            }
        }

    kelimeGir.close();
    }
}
