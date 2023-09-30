package Day16_Method1;

public class JavaMethods {


    public static void main(String[] args) {
        System.out.println("Methods in Java.");
        mesajYaz(15,"Java da methodlar");

    }


    public static void displayMessage(){
        //Method body
        System.out.println("Hello world.");
    }
    public static void displayMessageTekrar(int sayi){
        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + " -");
            displayMessage();
        }
    }
    public static void mesajYaz(int tekrarSayisi, String mesaj){
        for (int i = 1; i <= tekrarSayisi; i++) {
            System.out.println(mesaj);
        }
    }
}
