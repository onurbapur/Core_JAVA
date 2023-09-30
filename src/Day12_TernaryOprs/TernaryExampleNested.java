package Day12_TernaryOprs;

public class TernaryExampleNested {
    public static void main(String[] args) {
        System.out.println("Nested operation with ternary operator.");

        int sayi1, sayi2, sayi3, enbuyukSayi = 0;
        sayi1 = 290;
        sayi2 = 45;
        sayi3 = 6789;

        // iki sayı arasında en büyük olanını bulan ternary ops.
        enbuyukSayi = (sayi1 > sayi2) ? sayi1 : sayi2;
        System.out.println("iki sayıdan en büyük olanı --> " + enbuyukSayi);

        // üç sayı arasında en büyük olanını bulan ternary ops.
        enbuyukSayi = (sayi1 > sayi2)
                ?  ((sayi1 > sayi3) ? sayi1 : sayi3)
                :  ((sayi2 > sayi3) ? sayi2 : sayi3);
        System.out.println("üç sayıdan en büyük olanı --> " + enbuyukSayi);

        enbuyukSayi= (sayi1>sayi2) && (sayi1>sayi3)? sayi1
                :(sayi2>sayi3) ?sayi2
                :sayi3;
        System.out.println("üç sayıdan en büyük olanı --> " + enbuyukSayi);

        enbuyukSayi = (sayi1 > sayi2)? sayi1 : sayi2;
        enbuyukSayi = (enbuyukSayi > sayi3)? enbuyukSayi : sayi3;
        System.out.println("üç sayıdan en büyük olanı --> " + enbuyukSayi);


    }

}
