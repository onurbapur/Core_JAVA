package Day26_Array;

public class Array {
    public static void main(String[] args) {
        System.out.println("Array in Java.");

        String[] isimler = new String[3];
        isimler[0]="Ali";
        isimler[1]="Veli";
        isimler[2]="Selami";

        String ogrListesi[] = {"Ahmet","Mehmet","Merry"};
        String[] studentList = {"John","Carl","Elizabeth"}; //Tercih edilen tanımlama ( dataType[] refVar; )

        int[] sayilar = {1,5,7,6,8}; //Tercih edilen tanımlama ( dataType[] refVar; )
        int liste[] = {2,4,6,8};

        int[] notlar = new int[10];
        notlar[0] = 45;
        notlar[1] = 65;


        System.out.println("ogrListesi[0] = " + ogrListesi[0]);
        System.out.println("ogrListesi[1] = " + ogrListesi[1]);
        System.out.println("ogrListesi[2] = " + ogrListesi[2]);

        System.out.println("studentList[0] = " + studentList[0]);
        studentList[0] = "Smith";
        System.out.println("studentList[0] = " + studentList[0]);
        studentList[0] = "";
        System.out.println("studentList[0] = " + studentList[0]);

        studentList[0] = "Bill";
        System.out.println("studentList[0] = " + studentList[0]);

        System.out.println("Student list = " + studentList[0] + ", " + studentList[1] + ", " + studentList[2]);

    }
}
