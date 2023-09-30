package Day17_Method2;

public class AddTwoNumbers {
    public static void addNumbers(int sayiA, int sayiB){
        int toplam = sayiA + sayiB;
        System.out.println("Toplam = " + (sayiA + sayiB));
        System.out.println("Toplam 2 = " + toplam);
    }

    public static int addNumbersAndReturn(int sayiA, int sayiB){
        //int toplam = sayiA + sayiB;
        //return toplam;
        return sayiA + sayiB;
    }

    public static void main(String[] args) {
        addNumbers(15,25);

        System.out.println("Print return value " + addNumbersAndReturn(45,65));

        int toplam = addNumbersAndReturn(12,45);
        System.out.println("Print return value " + toplam);

        int toplam1 = addNumbersAndReturn(234,45);
        toplam= toplam1 + toplam;
        System.out.println("Toplam= toplam + toplam1 = " + toplam);

        toplam = addNumbersAndReturn(23,45) + addNumbersAndReturn(67,90);

        System.out.println("toplam = " + toplam);

        toplam = addNumbersAndReturn(addNumbersAndReturn(addNumbersAndReturn(23,78),34),100);

        System.out.println("Toplam = " + toplam);
    }
}
