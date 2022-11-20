package CCE.arrayExercises;
import java.util.Arrays;
import java.util.Scanner;

public class exercise04ver3 {
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
        System.out.print("Even Elements:        "+Arrays.toString(evenElem));
        
        System.out.println(" ");

        System.out.print("Odd Elements:         "+Arrays.toString(oddElem));

        System.out.println(" ");
    }
}
