package Day14_ForLoops;

public class NestedForLoop{
    public static void main(String[] args) {
        System.out.println("Nested for loop...");
        int sayac = 0;

        for (int i = 1; i <= 15; i++) {
            //Outher loop
            System.out.println(i+ " - Outher loop");
            for (int j = 1; j <=2 ; j++) {
                System.out.println(" ---> " + j + "-Inner loop");
                sayac++;
            }
        }
        System.out.println("İç döngünün tekrar sayısı = " + sayac);
    }
}
