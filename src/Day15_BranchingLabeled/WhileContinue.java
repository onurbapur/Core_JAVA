package Day15_BranchingLabeled;

public class WhileContinue {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 100; i++) {
            System.out.println( i + "-Merhaba");
            System.out.println("Dünya");
            continue;
        //   System.out.println("Deneme");// Compiler error

        }
         */
     int start = 1;
     int sum = 0 ;
        do {
            if(start % 2 == 0){
                continue;
            }
            sum += start;
        }while (++start <= 10);
        System.out.println(sum);
    }
}
