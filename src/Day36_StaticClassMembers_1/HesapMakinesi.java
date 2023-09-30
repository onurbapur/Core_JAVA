package Day36_StaticClassMembers_1;


public class HesapMakinesi {
    public static double sonuc;

    public static void topla(int sayiA, int sayiB){
        sonuc = 0;
        sonuc = sayiA + sayiB;
        System.out.println("sonuc = " + sonuc);
    }
    public static void topla(int... sayi){//(Var args) variable arguments-değişen sayıda arguman
        sonuc=0;
        System.out.println(sayi.length);
        for (int i = 0; i < sayi.length; i++) {
            System.out.println("sayi[i] = " + sayi[i]);
            sonuc += sayi[i];
        }
        System.out.println("sonuc = " + sonuc);

    }


}
