package CCE.arrayExercises;

public class exerciseTwoUwU {
    public static void main(String[] args) {
        int numElements[] = {12,23,120,60,320,45,93,21,60,310};

        // int lengthNum = numElements.length;

        System.out.print("ELEMENTS: ");
        for (int i = numElements.length-1; i>=0 ;i--) {
            System.out.print(numElements[i]);
            System.out.printf(", %-1s");
        }
        System.out.printf("");
    }
}
