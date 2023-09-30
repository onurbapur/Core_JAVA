package Day31_ArrayList;

public class MobilyaClass {
    String name;
    String renk;
    String materyal;
    double fiyat;

    public MobilyaClass(){
        System.out.println("Default constructor invoked.");
    }
    public MobilyaClass(String name, String renk, String materyal, double fiyat){
        System.out.println("Parameterized constructor invoked.");
        this.name = name;
        this.renk = renk;
        this.materyal = materyal;
        this.fiyat = fiyat;
    }
    public String showInfo(){
        return "İsim        : " + name + "\n" +
               "Renk        : " + renk + "\n" +
               "Materyal    : " + materyal + "\n" +
               "Fiyat       : " + fiyat + " TL";
    }
    public String toString(){
        return "İsim        : " + name + "\n" +
                "Renk        : " + renk + "\n" +
                "Materyal    : " + materyal + "\n" +
                "Fiyat       : " + fiyat + " TL" +"\n";
    }
}
