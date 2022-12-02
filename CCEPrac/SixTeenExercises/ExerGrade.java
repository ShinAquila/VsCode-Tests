package CCE.SixTeenExercises;
import java.util.Scanner;

public class ExerGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Grade: ");
        int grade = scan.nextInt();
        scan.close();

        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("D");
        } else if (grade < 60) {
            System.out.println("F");
        } else {
            System.out.println("Invalid Grade");
        }
    }
}
