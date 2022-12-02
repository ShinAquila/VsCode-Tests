package CCEPrac.SixTeenExercises;
import java.util.Scanner;

public class ExerGender {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Character (M/F): ");
        String gender = scan.nextLine();
        scan.close();

        if (gender.equals("M")) {
            System.out.println("Male");
        } else if (gender.equals("F")) {
            System.out.println("Female");
        } else {
            System.out.println("Invalid");
        }

    }
}
