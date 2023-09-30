package Day24_StringClass1;

public class CompareObjects{
    public static void main(String[] args) {
        ObjClass obj1 = new ObjClass();
        obj1.name = "Merhaba";

        ObjClass obj2 = new ObjClass();
        obj2.name = "Merhaba";

        ObjClass obj3 = new ObjClass("Java");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        System.out.println("obj2.equals(obj1) = " + obj2.name.equals(obj1.name)); //.equals()

        if (obj1.name == obj2.name){
            System.out.println("Eşittir");
        }else System.out.println("Eşit değillerdir.");

        if (obj1.esitMidir(obj2)){
            System.out.println("Eşittir");
        }else System.out.println("Eşit değildir");

        if (obj1.esitMidir(obj3)){
            System.out.println("Eşittir");
        }else System.out.println("Eşit değildir");

    }

}
