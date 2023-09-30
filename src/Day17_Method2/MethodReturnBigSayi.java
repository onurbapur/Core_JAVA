package Day17_Method2;

public class MethodReturnBigSayi {
    public static int greatestNumber(int sayi1,int sayi2, int sayi3){
        if ((sayi1 >= sayi2) && (sayi1 >= sayi3)){
            return sayi1;
        } else if ((sayi2 >= sayi1) && (sayi2 >= sayi3)) {
            return sayi2;
        } else return sayi3;
    }

    public static void main(String[] args) {
        System.out.println("GreatestNumber = " + greatestNumber(120, 4, 67));
    }
}
