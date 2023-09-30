package Day32_Constructor_1;

import java.util.ArrayList;

public class Banka {
    int hesapNo = 1000;
    String adi;
    String adresi;
    ArrayList<Musteri> musteriler;

    public Banka(){
        musteriler = new ArrayList<>();
    }
    public Banka(String adi, String adresi){
        this.adi = adi;
        this.adresi = adresi;
        musteriler = new ArrayList<>();
    }

    public void musteriEkle(Musteri musteri){ //Passing Object as argument to method
        hesapNo++;
        musteri.hesapNo = hesapNo;
        this.musteriler.add(musteri);
        System.out.println(musteri.hesapNo + " hesap nolu " + musteri.adi + " isimli müşteri bankaya eklendi.");
    }

    public void paraCek(Musteri musteri,double miktar){
        if(musteri.bakiye >= miktar){
            musteri.bakiye -= miktar;
            musteri.showInfo();
        }else {
            System.out.println("Bakiyeniz " + miktar + " TL para çekmeye müsait değil!");
            System.out.println("Enfazla " + musteri.bakiye + "TL kadar para çekebilirsiniz.");
        }
    }
    public void showInfo(){
        System.out.println("Bankamızdaki müşterilerin bilgileri aşağıdadır.");
        System.out.println("Bankanın adı    : " + adi);
        System.out.println("Bankanın adresi : " + adresi);
        System.out.println("-----------------------------------------------");
        for(Musteri musteri : musteriler){
            musteri.showInfo();
        }
    }
}
