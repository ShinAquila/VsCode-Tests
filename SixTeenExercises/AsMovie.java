package SixTeenExercises;
import java.util.Scanner;

public class AsMovie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter your Age to enter the cinema: ");
        int age = scan.nextInt();

        if (age < 16) {
            System.out.println("\nYou're too young and not allowed!");
        } else {
            System.out.println("\nYou're old enough! You're allowed!");
        }
        scan.close();
    }
}
