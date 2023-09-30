package Day26_Array;

public class PassingArrayToMethodStatic {
    public static void main(String[] args) {
        String[] sehirler = {"Ankara","İstanbul","Manisa","Bilecik","Sivas"};
        int[] sayilar = {2,4,5,6,77,23};

        MyArrayMethods.diziyiYazListe(sehirler);
        System.out.println();

        MyArrayMethods.diziyiYazYanyana(sehirler);
        System.out.println();
        MyArrayMethods.diziyiYazListe(sayilar);

        MyArrayMethods.diziyiYazListe(new String[]{"Ahmet", "Mehmet"});
        MyArrayMethods.diziyiYazListe(new int[]{34,56,78,12,89,90});

    }
}
