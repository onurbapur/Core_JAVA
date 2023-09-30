package Day19_MethodOverloading;

public class VarArgs {
     public static int topla(int ... sayilar){
        int argSayisi;
        int sonuc = 0;
//        argSayisi = sayilar.length;
//        for (int i = 0; i < argSayisi ; i++) {
//           sonuc += sayilar[i];
//        }

        //For each
        sonuc = 0;
        for (int x: sayilar) {
            sonuc += x;
        }
       return sonuc;
    }

    public static void main(String[] args) {
        System.out.println("topla(5, 15, 20,45,67,89,12,34,5678,89,12345) = "
                + topla(5, 15, 20, 45, 67, 89, 12, 34, 5678, 89, 12345));

    }
}
