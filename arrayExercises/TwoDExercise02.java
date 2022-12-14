package arrayExercises;

// ➢ Modify the program Exercise 1 so that it computes and prints the sum of each column of
// the array. And determine the largest result.

public class TwoDExercise02 {
    public static void main(String[] args) {
        int numTable[][] = {
            {23,34,50,21,10},
            {12,22,10,6,4},
            {4,67,16,40,56},
            {82,85,29,30,7},
            {6,34,34,45,79},
        };
        int largeCheck = 0;
        int colCount = 0;

        for (int i = 0; i < numTable.length; i++) {
            int colSum = 0;
            
            for (int j = 0; j < numTable.length; j++) {
                colSum += numTable[j][i];
            }
            System.out.println("Sum of Column "+ (i+1) +":         "+colSum);

            if (colSum > largeCheck) {
                largeCheck = colSum;
                colCount = i+1;
            }
        }

        System.out.println("");
        System.out.println("The largest sum is Column "+colCount+": "+largeCheck);
    }
}
