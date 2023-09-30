package Day19_MethodOverloading;

public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("Standard main metodu.");
        String str = main("Merhaba ben overload edilmiş main metoduyum.");
        System.out.println(str);

        int sonuc = main(5);
        System.out.println("Sonuç = " + sonuc);
    }
    //Main method overloaded
    public static String main(String args) {
        System.out.println("Overloaded main metodu.");
        return args;
    }
    //Main method overloaded
    public static int main(int sayi){
        return sayi * 5;
    }
}
