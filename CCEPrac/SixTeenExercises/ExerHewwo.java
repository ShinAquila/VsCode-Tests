package CCEPrac.SixTeenExercises;
import java.util.Scanner;

public class ExerHewwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number (1-3):     ");
        int num = scan.nextInt();
        scan.close();

        if (num == 1) {
            System.out.println("Hello");
        } else if (num == 2) {
            System.out.println("Hi");
        } else if (num == 3) {
            System.out.println("Bye");
        } else {
            System.out.println("Invalid");
        }

    }
}
