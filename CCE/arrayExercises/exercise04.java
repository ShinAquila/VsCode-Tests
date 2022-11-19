package CCE.arrayExercises;
import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {

        int separator = 0;

        Scanner scan = new Scanner(System.in);

        int num[] = new int[11];
        int evenElem[] = new int[11];
        int oddElem[] = new int[11];
        
        System.out.println("***********INPUT***********");
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a Number: ");
            num[i] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < 10; i++) {
            separator = num[i] % 2;

            if (separator == 0) {
                evenElem[i] = num[i];
            } else {
                oddElem[i] = num[i];
            }
        }
        
        System.out.println(" ");

        System.out.println("***********OUTPUT***********");
        System.out.println(" ");
        System.out.print("Even Elements:        ");
        for (int i = 0; i < evenElem.length; i++) {
            if (evenElem[i] != 0) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(evenElem[i]);
            }
        }
        
        System.out.println(" ");

        System.out.print("Odd Elements:         ");
        for (int i = 0; i < oddElem.length-2; i++) {
            if (oddElem[i] != 0) {
                System.out.print(oddElem[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print(oddElem[9]);
        System.out.println(" ");
    }
}
