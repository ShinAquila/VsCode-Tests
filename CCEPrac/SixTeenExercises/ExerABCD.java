package CCEPrac.SixTeenExercises;
import java.util.Scanner;

public class ExerABCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value for A: ");
        int A = scan.nextInt();

        System.out.print("Enter value for B: ");
        int B = scan.nextInt();

        System.out.print("Enter value for C: ");
        int C = scan.nextInt();

        System.out.print("Enter value for D: ");
        int D = scan.nextInt();

        scan.close();

        if (A > B && C < D || A > B && C < D) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
