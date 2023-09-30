package Day14_ForLoops;

public class ForLoopContinue {
    public static void main(String[] args) {
        System.out.println("Continue...");

        for (int i = 0; i < 5 ; i++) {
            if( i == 3){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("--------------------");
        for (int i = 1; i <= 15 ; i++) {
            //2 ye ve 3 e kalansız bölünen sayılar(6 tam bölünen)
            if (( i %2 == 0) && (i %3 == 0)){
                System.out.println(i);
                continue;
            }
        }
    }

}
