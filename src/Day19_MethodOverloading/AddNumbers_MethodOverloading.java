package Day19_MethodOverloading;

public class AddNumbers_MethodOverloading {
    public static int ikiSayiTopla(int sayiA, int sayiB){
        return sayiA + sayiB;
    }
    public static int ucSayiTopla(int sayiA, int sayiB, int sayiC){
        return sayiA + sayiB + sayiC;
    }

    public static int topla(int sayiA, int sayiB){
        return sayiA + sayiB;
    }

    public static int topla(int sayiA, int sayiB, int sayiC){
        return sayiA + sayiB+ sayiC;
    }

    public static double topla(double sayiA, int sayiB){
        return sayiA + sayiB;
    }
    public static double topla(int sayiA, double sayiB){
        return sayiA + sayiB;
    }

    public static long topla(long sayiA, int sayiB){
        System.out.println("Long parametreli olan çalıştı.");
        return sayiA + sayiB;
    }


    public static void main(String[] args) {
        System.out.println("Method overloading examples in Java.");
        double sonuc = ikiSayiTopla(15,45);
        System.out.println("Sonuç = " + sonuc);

        sonuc = ucSayiTopla(45,65,12);
        System.out.println("Sonuç = " + sonuc);
        System.out.println();

        System.out.println("Method overloading...");
        sonuc = topla(23,56);
        System.out.println("Sonuç = " + sonuc);

        sonuc = topla(34,78,90);
        System.out.println("Sonuç = " + sonuc);

        sonuc = topla(5.15,45);
        System.out.println("Sonuç = " + sonuc);

        sonuc= topla(5,5.9);
        System.out.println("Sonuç = " + sonuc);

        sonuc = topla(218_900_000_000_000L,15);
        System.out.println("Sonuç = " + sonuc);

    }
}
