package Day27_MultiDimensionalArrays;

import java.util.Arrays;


public class Exercise1 {
    /*
    What elements does the array numbers contain after the following code is
    executed?
            int[ ][ ] numbers = new int[3][3];
            for (int r = 0; r < numbers.length; r++) {
                for (int c = 0; c < numbers[r].length; c++) {
                numbers[r][c] = r + c;
                }
            }
     */

    public static void main(String[] args) {
        int[ ][ ] numbers = new int[3][3];
        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[r].length; c++) {
                numbers[r][c] = r + c;
            }
        }
        //Manual trace results for each iteration
        //r = 0  numbers [0][0] = 0 + 0  [0,1,2]
        //r = 0  numbers [0][1] = 0 + 1
        //r = 0  numbers [0][2] = 0 + 2

        //r = 1  numbers [1][0] = 1 + 0  [1,2,3]
        //r = 1  numbers [1][1] = 1 + 1
        //r = 1  numbers [1][2] = 1 + 2

        //r = 2  numbers [2][0] = 2 + 0  [2,3,4]
        //r = 2  numbers [2][1] = 2 + 1
        //r = 2  numbers [2][2] = 2 + 2
        System.out.println(Arrays.deepToString(numbers));
    }
}

