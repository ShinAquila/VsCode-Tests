package CCE.arrayExercises;
import java.util.Scanner;

// Ask 10 numbers from the user then determine the odd and even numbers entered by the
// user.

public class exercise04ver1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num[] = new int[10];
        int evenElem[] = new int[10];
        int oddElem[] = new int[10];
        
        System.out.println("***********INPUT***********");
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a Number: ");
            num[i] = scan.nextInt();

            if ((num[i] % 2) == 0) {
                    evenElem[i] = num[i];
            } else {
                    oddElem[i] = num[i];
            }
        }
        scan.close();
        
        System.out.println(" ");

        System.out.println("***********OUTPUT***********");
        System.out.println(" ");
        System.out.print("Even Elements:        ");
        for (int i = 0; i < evenElem.length-1; i++) {
            if (evenElem != null && evenElem[i] > 0) {
                System.out.print(evenElem[i]+" ");
            }
        }
        
        System.out.println(" ");

        System.out.print("Odd Elements:         ");
        for (int i = 0; i < oddElem.length-1; i++) {
            if (oddElem != null && oddElem[i] > 0) {
                System.out.print(oddElem[i]+" ");
            }
        }

        System.out.println(" ");
    }
}
