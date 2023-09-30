package Day20_ClassObjects;

public class Student {
    //Instance variables-Belongs to object- Nesneye ait değişkenler
    String name;
    String sinif;
    int number;
    String bolum;
    //Class variable and final nobody change (final static)
    final static String schoolName = "Ankara University";

    //Creating object by Default constructor
    public Student(){
        System.out.println("Default constructor called.");

    }

    //Creating object by Parameterized constructor
    public Student(String name, String sinif, int number, String bolum){
        System.out.println("Parameterized constructor called.");
        this.name = name;
        this.sinif = sinif;
        this.number = number;
        this.bolum = bolum;
    }

    //Creating object by Parameterized constructor
    public Student(String name, int number){
        System.out.println("Parameterized constructor called.");
        this.name = name;
        this.number = number;
    }
    //Method assigns Initial values of object
    public void createStudent(String name, String sinif, int number, String bolum){
        this.name = name;
        this.sinif = sinif;
        this.number = number;
        this.bolum = bolum;
    }


    public void banaBilgileriniYaz(){
        System.out.println("School name :" + schoolName);
        System.out.println("Name : " + name);
        System.out.println("Number : " + number);
        System.out.println("Class : " + sinif);
        System.out.println("Bölümü : " + bolum);
        System.out.println("------------------------------");
    }
}
