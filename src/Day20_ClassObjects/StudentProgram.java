package Day20_ClassObjects;

public class StudentProgram {
    public static void main(String[] args) {
        Student ogr1 = new Student();
        Student ogr2 = new Student();
        Student ogr3 = new Student();
        Student ogr4 = new Student();


        //Initial values by reference variables (ogr1,ogr2...)
        ogr1.number = 1234;
        ogr1.name = "Ahmet Falanca";
        ogr1.bolum = "Computer Sc.";
        ogr1.sinif = "4";

        ogr2.number = 14567;
        ogr2.name = "Ali Can";
        ogr2.bolum = "Social Sc.";
        ogr2.sinif = "3";

        ogr3.number = 3242525;
        ogr3.name = "Fatma Fatmagül";
        ogr3.bolum = "Engineer Sc.";
        ogr3.sinif = "1";

        //Initial values by method
        ogr4.createStudent("John Smith","4",7654,"Civilian Engineer ");

        ogr1.banaBilgileriniYaz();
        ogr2.banaBilgileriniYaz();
        ogr3.banaBilgileriniYaz();
        ogr4.banaBilgileriniYaz();

        //Initial values by Parameterized constructor
        Student ogr5 = new Student("Smith And","5",786148,"Computer Sc.");
        ogr5.banaBilgileriniYaz();

        //Initial values by Parameterized constructor
        Student ogr6 = new Student("Can Can",23423);
        ogr6.banaBilgileriniYaz();
    }
}
