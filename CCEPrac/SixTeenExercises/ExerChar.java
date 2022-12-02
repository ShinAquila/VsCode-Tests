package CCEPrac.SixTeenExercises;
import java.util.Scanner;

public class ExerChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter one Character: ");
        String charOne = scan.nextLine();

        System.out.println("Enter one Character: ");
        String charTwo = scan.nextLine();

        System.out.println(charOne+charTwo);
        scan.close();
    }
}
