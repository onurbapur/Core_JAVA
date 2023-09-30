package Day04_Variables2;

public class CharDemo {
    public static void main(String[] args) {
        System.out.println("Char veri tipi demo programı.");
        System.out.println("-----------------------------");

        String okulAdi;
        char subeAdi;
        char sinifGecme;

        okulAdi = "BootFlow Academy";
        subeAdi = 'A';
        sinifGecme = 'B';

        System.out.println("Okulun adı  : " + okulAdi);
        System.out.println("Şubesi : " + subeAdi + ", sınıf geçme notu : " + sinifGecme);
        System.out.println("-------------------------------------");
        System.out.println();

        char abc;
        abc = 'A';
        System.out.println(abc);
        abc = 66;
        System.out.println(abc);

        abc = 'A' + 35;
        System.out.println(abc);

        abc = 35535;
        System.out.println(abc);
    }
}
