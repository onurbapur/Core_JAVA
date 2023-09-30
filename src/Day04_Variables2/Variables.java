package Day04_Variables2;
//Bu program değişken tanımlamalarına ilişkin örnekleri içerir.
public class Variables {
    public static void main(String[] args) {
        System.out.println("Merhaba Java.");
        System.out.println("Değişkenleri öğreniyoruz.");

        //Variable declaration
        //int yas, kilo, boy;
        int yas = 50, kilo = 67, boy = 180;

        int yasOkulCagi; //Camel case
        /*
        int yas = 10;
        int kilo = 35;
        int boy = 155;
         */

        //Variable assignment literal( 45, 92 , 176)
        //Yorum satırı
        //Yorum satırı

        System.out.print("Yaş = ");
        System.out.println(yas); //Yaş bilgisini tuttuğum değişkeni ekrana yazdırır.
        System.out.println("---------");

        System.out.print("Kilo = ");
        System.out.println(kilo);
        System.out.println("---------");

        System.out.print("Boy = ");
        System.out.println(boy);
        System.out.println();

        yas = 45;
        kilo = 92;
        boy = 176;

        System.out.print("Yaş = ");
        System.out.println(yas);
        System.out.println(); //Console boş bir satır yazar.,

        System.out.print("Kilo = ");
        System.out.println(kilo);
        System.out.println();

        System.out.print("Boy = ");
        System.out.println(boy);

        System.out.println("Yaş = " + yas + "," + "Boy = " + boy + "," + "Kilo = " + kilo);

    }
}




