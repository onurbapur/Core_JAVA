package Day16_Method1;

public class HangiSayiBuyuk {
    public static void sayinBuyugu(int birinciSayi, int ikinciSayi){
        if(birinciSayi > ikinciSayi){
            System.out.println("Birinci sayı ikinci sayıdan büyüktür.");
        }else if (birinciSayi==ikinciSayi){
            System.out.println("Her iki sayıda birbirine eşittir.");
        }else System.out.println("İkinci sayı birinci sayıdan büyüktür.");
    }

    public static void main(String[] args) {
        System.out.println("İki sayıdan büyüğünü ekrana yazdıran program.");

        //User defined method
        sayinBuyugu(122,12);
        sayinBuyugu(2,12);
        sayinBuyugu(122,122);

        //Math java library pre-defined
        System.out.println(Math.max(12,67));
        System.out.println(Math.min(122,670));

    }
}
