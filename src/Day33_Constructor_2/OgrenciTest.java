package Day33_Constructor_2;

public class OgrenciTest {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci();
        Ogrenci ogrenci2 = new Ogrenci("Ahmet");
        Ogrenci ogrenci3 = new Ogrenci("Mehmet",35);
        Ogrenci ogrenci4 = new Ogrenci(35);
        Ogrenci ogrenci5 = new Ogrenci(123456L);
        Ogrenci ogrenci6 = new Ogrenci("Filiz",28,12398654L);

        /*ogrenci1.name = "Ali";
        ogrenci1.age = 48;
        ogrenci1.id = 1223456L;*/
        System.out.println();
        System.out.println("No arguments-Default Constructor-Ogrenci Info");
        System.out.println("ogrenci1.name = " + ogrenci1.name);
        System.out.println("ogrenci1.age = " + ogrenci1.age);
        System.out.println("ogrenci1.id = " + ogrenci1.id);
        System.out.println();

        System.out.println("Single argument Constructor-Ogrenci(Name) Info");
        System.out.println("ogrenci2.name = " + ogrenci2.name);
        System.out.println("ogrenci2.age = " + ogrenci2.age);
        System.out.println("ogrenci2.id = " + ogrenci2.id);
        System.out.println();

        System.out.println("Two arguments Constructor-Ogrenci(Name & Age) Info");
        System.out.println("ogrenci3.name = " + ogrenci3.name);
        System.out.println("ogrenci3.age = " + ogrenci3.age);
        System.out.println("ogrenci3.id = " + ogrenci3.id);
        System.out.println();

        System.out.println("Single argument Constructor-Ogrenci(Age) Info");
        System.out.println("ogrenci4.name = " + ogrenci4.name);
        System.out.println("ogrenci4.age = " + ogrenci4.age);
        System.out.println("ogrenci4.id = " + ogrenci4.id);
        System.out.println();

        System.out.println("Single argument Constructor-Ogrenci(Id) Info");
        System.out.println("ogrenci5.name = " + ogrenci5.name);
        System.out.println("ogrenci5.age = " + ogrenci5.age);
        System.out.println("ogrenci5.id = " + ogrenci5.id);
        System.out.println();

        System.out.println("All arguments Constructor-Ogrenci(Name & Age & Id) Info");
        System.out.println("ogrenci6.name = " + ogrenci6.name);
        System.out.println("ogrenci6.age = " + ogrenci6.age);
        System.out.println("ogrenci6.id = " + ogrenci6.id);
        System.out.println();
    }
}
