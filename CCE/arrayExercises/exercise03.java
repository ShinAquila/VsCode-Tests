package CCE.arrayExercises;

//Exercise 3 - Reversed Display
//Having the same elements from Exercise 1, create a java program that display the elements
//with indexes 0,2,4,6.

public class exercise03 {
    public static void main(String[] args) {
        int numElements[] = {12,23,120,60,320,45,93,21,60,310};

        System.out.print("ELEMENTS: ");
        for (int i = 0; i < numElements.length; i+=2) {
            if (i > 0) {
                System.out.print(", ");
            }

            System.out.print(numElements[i]);
        }
        System.out.println("");
    }
}
