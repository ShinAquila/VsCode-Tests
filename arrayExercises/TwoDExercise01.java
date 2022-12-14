package arrayExercises;

// ➢ Use the table above and use it to create an initialized 2D Array
// ➢ Complete the following program so that it computes the sum of the elements in each
// row. And determine the largest result

public class TwoDExercise01 {
    public static void main(String[] args) {
        int numTable[][] = {
            {23,34,50,21,10},
            {12,22,10,6,4},
            {4,67,16,40,56},
            {82,85,29,30,7},
            {6,34,34,45,79},
        };
        int largeCheck = 0;
        int rowCount = 0;
        
        for (int i = 0; i < numTable.length; i++) {
            int rowSum = 0;

            for (int j = 0; j < numTable.length; j++) {
                rowSum += numTable[i][j];
            }
            System.out.println("Sum of Row "+ (i+1) +":         "+rowSum);

            if (rowSum > largeCheck) {
                largeCheck = rowSum;
                rowCount = i+1;
            }
        }

        System.out.println("");
        System.out.println("The largest sum is Row " +rowCount+ ": "+largeCheck);



    }
}
