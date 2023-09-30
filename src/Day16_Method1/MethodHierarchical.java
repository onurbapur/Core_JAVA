package Day16_Method1;

public class MethodHierarchical {
    public static  void mesajGoster2(){
        System.out.println("Merhaba ben mesajGoster2 metoduyum.");
    }
    public static void mesajGoster(){
        System.out.println("Merhaba ben mesajGoster metoduyum.");
        mesajGoster2();
    }

    public static void main(String[] args) {
        mesajGoster();
        System.out.println("Merhaba ben main metoduyum.");
   }
}
