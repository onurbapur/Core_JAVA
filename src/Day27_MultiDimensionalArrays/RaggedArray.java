package Day27_MultiDimensionalArrays;

public class RaggedArray {
    public static void main(String[] args)    {
        // Declaring 2-D array with 4 rows
        int raggedArray[][] = new int[4][];
        // create a jagged or ragged array
        raggedArray[0] = new int[3];
        raggedArray[1] = new int[2];
        raggedArray[2] = new int[1];
        raggedArray[3] = new int[4];

        // Initializing array with values
        for (int i=0; i< raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                raggedArray[i][j] = (i + 1) * (j + 1);         //initial values for each row,column
            }
        }
        // display the contents of 2-D ragged or jagged array
        System.out.println("Two-dimensional Jagged or Ragged Array:");
        for (int i=0; i< raggedArray.length; i++)
        {
            for (int j=0; j< raggedArray[i].length; j++)
                System.out.print( raggedArray[i][j] + " ");
            System.out.println();
        }
    }
}
