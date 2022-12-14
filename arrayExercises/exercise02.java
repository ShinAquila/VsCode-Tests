package arrayExercises;

//Exercise 2 - Reversed Display
//Having the same elements from Exercise 1, create a java program that display the elements
//in a reverse sequence.

public class exercise02 {
    public static void main(String[] args) {
        int numElements[] = {12,23,120,60,320,45,93,21,60,310};

        System.out.print("ELEMENTS: ");
        System.out.print(numElements[numElements.length-1]);
        for (int i = numElements.length-2; i>=0 ;i--) {
            if (i >= 0) {
                System.out.print(", ");
            }
            System.out.print(numElements[i]);
        }
        System.out.println("");

    }
}
