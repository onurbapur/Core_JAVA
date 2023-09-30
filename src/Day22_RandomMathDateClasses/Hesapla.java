package Day22_RandomMathDateClasses;

public class Hesapla {
   public final static double KDV_EGITIM = 0.1;
   public final static double KDV_GIDA = 0.18;
   public final static double PI= 3.14;

    //Object of the class cannot be created
    private Hesapla(){

    }
    public static int topla(int sayiA, int sayiB){
        return sayiA + sayiB;
    }
    public static int carpma(int sayiA, int sayiB){
        return sayiA * sayiB;
    }
}
