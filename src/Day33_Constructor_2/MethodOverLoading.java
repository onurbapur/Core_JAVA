package Day33_Constructor_2;

public class MethodOverLoading {
    public static int topla(int sayi1, int sayi2){
        System.out.println("Toplam(int) = " + (sayi1 + sayi2));
        return sayi1 + sayi2;
    }

    public static double topla(double sayi1, double sayi2){
        System.out.println("Toplam(double) = " + (sayi1 + sayi2));
        return sayi1+sayi2;
    }

    public static void main(String[] args) {
        topla(12,25);
        topla(2.5,4.5);

        int toplam = topla(12,56);

        System.out.println("toplam = " + toplam);

        double genelToplam;

        genelToplam = topla(123,45) + topla(4.5,6.7);
        System.out.println("genelToplam = " + genelToplam);

    }
}
