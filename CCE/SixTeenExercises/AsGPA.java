package CCE.SixTeenExercises;
import java.util.Scanner;

public class AsGPA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your GPA: ");
        double gpa = scan.nextDouble();

        System.out.println("Enter your Admission Score: ");
        int score = scan.nextInt();

        if (gpa >= 3.0 && score >= 60) {
            System.out.println("\nAccepted");
        } else {
            System.out.println("\nRejected");
        }
        scan.close();
    }
}
