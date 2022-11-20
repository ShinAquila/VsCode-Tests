package CCE.arrayExercises;
import java.util.ArrayList;
import java.util.Scanner;

public class exercise04ver2 {
    public static void main(String[] args) {
        int numElements[] = new int[10];
        ArrayList <Integer> evenNum = new ArrayList<Integer>();
        ArrayList <Integer> oddNum = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        System.out.println("***********INPUT***********");
        System.out.println(" ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a Number: ");
            numElements[i] = scan.nextInt();

            if ((numElements[i] % 2) == 0) {
                evenNum.add(numElements[i]);
            } else {
                oddNum.add(numElements[i]);
            }
        }
        scan.close();
        System.out.println("");

        System.out.println("***********OUTPUT***********");
        System.out.println(" ");

        System.out.print("Original Elements: ");
        for (int i = 0; i < numElements.length; i++) {
            System.out.print(numElements[i] + " ");
        }
        System.out.println(" ");

        System.out.print("Even Elements: ");
        for (int i = 0; i < evenNum.size()-1; i++) {
            System.out.print(evenNum.get(i)+", ");
        }
        System.out.print(evenNum.get(evenNum.size()-1));


        System.out.println("");


        System.out.print("Odd Elements: ");
        for (int i = 0; i < oddNum.size()-1; i++) {
            System.out.print(oddNum.get(i)+", ");
        }
        System.out.print(oddNum.get(oddNum.size()-1));
        System.out.println("");
    }
}
