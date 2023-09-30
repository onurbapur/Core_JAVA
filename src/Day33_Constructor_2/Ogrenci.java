package Day33_Constructor_2;

public class Ogrenci {
    //Data fields
    String name;
    int age;
    long id;

    //Constructor overloading
    Ogrenci(){
        System.out.println("Default constructor with no parameter.");
    }

    Ogrenci(String name){
        System.out.println("Bir parametreli constructor - argument- String: " + name);
        this.name = name;
    }
    Ogrenci(int age){
        System.out.println("Bir parametreli constructor - argument- int: " + age);
        this.age = age;
    }
    Ogrenci(long id){
        System.out.println("Bir parametreli constructor - argument- long: " + id);
        this.id = id;
    }

    Ogrenci(String name, int age){
        System.out.println("iki parametreli constructor - argument- String: " + name + " int: " +age);
        this.name = name;
        this.age = age;
    }

    public Ogrenci(String name, int age, long id) {
        System.out.println("Bütün field ları parametre olarak alan constructor.");
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
