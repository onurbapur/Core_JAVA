package Day26_Array;

public class MyArrayMethods {

    public static void diziyiYazListe(String[] dizi){
        System.out.println("Liste halinde yazıyorum...");
        System.out.println("--------------------------");
        for (String eleman: dizi) {
            System.out.println(eleman);
        }
    }
    public static void diziyiYazListe(int[] dizi){
        System.out.println("Liste halinde yazıyorum...");
        System.out.println("--------------------------");
        for (int eleman: dizi) {
            System.out.println(eleman);
        }
    }

    public static void diziyiYazYanyana(String[] dizi){
        System.out.println("Yan yana tek satırda  halinde yazıyorum...");
        System.out.println("------------------------------------------");
        for (String eleman: dizi) {
            System.out.print(eleman + " ");
        }
    }

    public static void diziyiYazYanyana(int[] dizi){
        System.out.println("Yan yana tek satırda  halinde yazıyorum...");
        System.out.println("------------------------------------------");
        for (int eleman: dizi) {
            System.out.print(eleman + " ");
        }
    }

    public static void diziyiYazListe(String[] dizi, boolean buyukKucukHarf){
        System.out.println("Liste halinde yazıyorum...");
        System.out.println("--------------------------");
        for (String eleman: dizi) {
            if (buyukKucukHarf){
                System.out.println(eleman.toUpperCase());
            }else System.out.println(eleman);
        }
    }
}
