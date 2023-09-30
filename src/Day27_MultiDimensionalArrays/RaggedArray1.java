package Day27_MultiDimensionalArrays;

import java.util.Arrays;

public class RaggedArray1 {
    public static void main(String[] args) {
        int [][] triangleArray = new int[4][];

        triangleArray[0] = new int[2];
        triangleArray[1] = new int[5];
        triangleArray[2] = new int[1];
        triangleArray[3] = new int[1];

        System.out.println(Arrays.deepToString(triangleArray));
        System.out.println("-------------------");

        for (int i = 0; i < triangleArray.length; i++) {
            for (int j = 0; j < triangleArray[i].length; j++) {
                System.out.print(triangleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
