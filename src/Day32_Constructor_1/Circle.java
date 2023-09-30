package Day32_Constructor_1;

public class Circle {
    public double radius; //Data field, state, attribute, property
    public double alan;
    //Default/No Argument constructor
    public Circle(){
        /*Constructor metodlarının temel amacı class lardan oluşturulacak olan nesnelerin
        Data field, attribute, variable, state, properties
        alanlarına başlangıç değerlerini(initial values) atamaktır.
         */
        System.out.println("Default/No Argument constructor called.");
        radius = 2.0;
    }
    //Parameterized constructor
    public Circle(double yaricap){
        /*Constructor metodlarının temel amacı class lardan oluşturulacak olan nesnelerin
        Data field, attribute, variable, state, properties
        alanlarına başlangıç değerlerini(initial values) atamaktır.
         */
        System.out.println("Parameterized constructor called.");
        radius = yaricap; //Constructor'a parametre olarak gönderilen değeri radius değişkenine atama işlemi
        alan = radius * radius * Math.PI; //radius değişkeninin değeri kullanılarak dairenin alan hesaplaması sonucu alan değişkenine atama işlemi
    }
    //Behavior-method-function-davranış-metod
    public double alanHesapla(){
        //alan = r * r * Pi sayısı --> daire alanı hesaplama formülü
        //return radius * radius * 3.14;
        System.out.println("Yarıçap = " + radius);
        alan = radius * radius * Math.PI;
        return alan;
    }

    public static void main(String[] args) {
        String str = new String(); //Instance of class has created--->object
        Circle daire1 = new Circle(); //Instance of class has created--->object
        Circle daire2 = new Circle(); //Default constructor.
        Circle daire3 = new Circle(5.0);
        Circle daire4 = new Circle(3.5);

        System.out.println("daire1.radius = " + daire1.radius);
        daire1.radius = 12;
        System.out.println("daire1.radius = " + daire1.radius);
        System.out.println("daire2.radius = " + daire2.radius);
        daire2.radius = 23;
        System.out.println("daire2.radius = " + daire2.radius);

        System.out.println("daire3.radius = " + daire3.radius);
        System.out.println("daire4.radius = " + daire4.radius);

        double alan = daire1.alanHesapla();
        System.out.println("alan = " + alan);
        System.out.println("daire1.alanHesapla() = " + daire1.alanHesapla());
        System.out.println("daire2.alanHesapla() = " + daire2.alanHesapla());

        System.out.println("daire3.alan = " + daire3.alan);
        System.out.println("daire3.alanHesapla() = " + daire3.alanHesapla());
    }
}
