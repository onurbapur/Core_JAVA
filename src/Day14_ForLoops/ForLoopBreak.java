package Day14_ForLoops;

public class ForLoopBreak {
    public static void main(String[] args) {
        System.out.println("Break....");
        for (int i = 1;i <= 5; i++) {
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
    }
}
