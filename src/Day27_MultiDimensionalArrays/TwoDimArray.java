package Day27_MultiDimensionalArrays;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        System.out.println("Two dimensional array");
        /*
                col
         row--> 0 0 1 0 0
                0 0 0 0 0
                0 0 0 0 0
                0 0 0 0 5
                0 0 0 0 0
         */
        int[][] matrix = new int[5][4];
        matrix[0][2] = 100;
        matrix[3][2] = 5000;
        matrix[4][3] = 400;

        for (int satir = 0; satir < matrix.length; satir++) {//traverse the row---satırı dolaşır
            for (int sutun = 0; sutun < matrix[satir].length; sutun++) { //traverse the column ---sutunları dolaşır
               // System.out.print(matrix[satir][sutun] + "\t\t");
                System.out.printf("%6d",matrix[satir][sutun]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Arrays class'ının deepToString() metodu ile dizi elemanlarının yazdırılması");
        System.out.println(Arrays.deepToString(matrix));

        System.out.println("-------------------");
        int[][] array ={
                {2,4,5},
                {1,6,3},
                {6,7,1},
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
