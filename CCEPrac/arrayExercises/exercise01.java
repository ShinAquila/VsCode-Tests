package CCEPrac.arrayExercises;

//Exercise 1 - Sum of an Initialized Elements
//Give an array of integer with a length of 10, or create a java program that display all
//the elements and the sum of all the elements.

public class exercise01 {
    public static void main(String[] args) {
        int totalSum = 0;
        int numElements[] = {12,23,120,60,320,45,93,21,60,310};

        System.out.print("ELEMENTS: ");
        for (int i = 0; i < numElements.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numElements[i]);
            totalSum += numElements[i];
        }

        System.out.println("\nSUM: "+totalSum);
    }
}
