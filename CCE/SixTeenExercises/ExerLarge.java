package CCE.SixTeenExercises;
import java.util.Scanner;

public class ExerLarge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter 2nd Number: ");
        int num2 = scan.nextInt();
        scan.close();

        if (num1 > num2) {
            System.out.println("The largest number is "+num1);
        } else {
            System.out.println("The largest number is "+num2);
        }
    }
}
