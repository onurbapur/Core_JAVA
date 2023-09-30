package Day15_BranchingLabeled;
//While
public class WhileContinueExercise {
    public static void main(String[] args) {
        int i =0, sum = 0;

        while (i < 6){
           if(i % 3 == 0) {
              i++;
              continue;
            }
            sum += i;
            i++;
        }
        System.out.println(sum);
    }


}
