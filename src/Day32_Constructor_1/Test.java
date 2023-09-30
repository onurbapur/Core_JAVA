package Day32_Constructor_1;

public class Test {
    public static void main(String[] args) {
        //Default Constructor
        Circle daire = new Circle();

        System.out.println("Daire alanı hesapla(Default Constructor) = " + daire.alanHesapla());
        System.out.println();

        //Param. constructor
        Circle daire1 = new Circle(3.5);
        System.out.println("Daire alanı hesapla(Param. Constructor) = " + daire1.alanHesapla());
        System.out.printf("(Formatted string)-Alan = %.3f",daire1.alanHesapla());
    }
}
