package CCEPrac.SixTeenExercises;
import java.util.Scanner;

public class ExerDiffProdRem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----------INPUT----------");
        System.out.print("Enter first number:   ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number:    ");
        int num2 = scan.nextInt();

        System.out.println("----------OUTPUT----------");
        int rem = num1 % num2;
        int diff = num1 - num2;
        int prod = num1 * num2;

        if (rem == 0) {
            System.out.println("The Remainder is 0");
        } else {
            System.out.println("The Remainder is NOT 0");
        }
        
        System.out.println("The Difference is "+diff);
        System.out.println("The Product is "+prod);
        scan.close();
    }
}
