package Day27_MultiDimensionalArrays;

public class RaggedArray2 {
    public static void main(String[] args) {
        int[][] raggedArray = new int[3][]; // Declaring a Ragged or Jagged array;
        int[] x = {1, 2}; //Creating one dimensional array of int.
        int[] y = {3,5,6,7,8}; //Creating one dimensional array of int.
        int[] z = {22,34,5,45,678,78,8}; //Creating one dimensional array of int.

        //Assigning one dimensional arrays to Ragged array as its row.
        raggedArray[0] = x; //assigning one dim array as named "x" to first row of ragged "raggedArray"
        raggedArray[1] = y; //assigning one dim array as named "y" to first row of ragged "raggedArray"
        raggedArray[2] = z; //assigning one dim array as named "z" to first row of ragged "raggedArray"

        System.out.println("Traversing the two-dimensional ragged array with for...loop");
        System.out.println("-----------------------------------------------------------");
        //Traversing the two-dimensional ragged array with for...loop
        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                System.out.print(raggedArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("------------------------------------------------------------");
        //Accessing an element of array by giving row and column index
        System.out.println("Accessing an element of array by giving row and column index");
        System.out.println("------------------------------------------------------------");
        System.out.println("Element of array[0][1] is " + raggedArray[0][1]); //printing second element of first row of "raggedArray"
        System.out.println("Element of array[1][1] is " + raggedArray[1][1]); //printing second element of second row of "raggedArray"
        System.out.println("Element of array[1][4] is " + raggedArray[1][4]); //printing second element of fifth row of "raggedArray"
        System.out.println("Element of array[2][3] is " + raggedArray[2][3]); //printing fourth element of second row of "raggedArray"
    }
}
