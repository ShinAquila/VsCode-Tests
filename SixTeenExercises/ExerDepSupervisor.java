package SixTeenExercises;
import java.util.Scanner;

public class ExerDepSupervisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Department Number:    ");
        int depNum = scan.nextInt();
        scan.close();

        System.out.println("");
        System.out.println("Supervisor");
        if (depNum >= 1 && depNum <= 3) {
            System.out.println("Mr. X");
        } else if (depNum >= 4 && depNum <= 7) {
            System.out.println("Mr. Y");
        } else if (depNum >= 8 && depNum <=9) {
            System.out.println("Mr. Z");
        } else {
            System.out.println("Deparment Number Not Found");
        }


    }
}
