package Day22_RandomMathDateClasses;

public class HesaplaTest {
    public static void main(String[] args) {
        System.out.println("(Hesapla.KDV_GIDA * 100) = " + ((Hesapla.KDV_GIDA * 100) + 100));
        System.out.println("((Hesapla.KDV_EGITIM * 100) * 100) = " + ((Hesapla.KDV_EGITIM * 100) + 100));
        System.out.println("Hesapla.topla(23,56) = " + Hesapla.topla(23, 56));

        System.out.println("Hesapla.PI = " + Hesapla.PI);
        System.out.println("Math.PI = " + Math.PI);

    }
}
