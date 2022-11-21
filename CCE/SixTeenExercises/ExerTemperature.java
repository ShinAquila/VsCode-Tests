package CCE.SixTeenExercises;
import java.util.Scanner;

public class ExerTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Temperature: ");
        int tempVal = scan.nextInt();
        scan.close();

        if (tempVal < 0) {
            System.out.println("Ice");
        } else if (tempVal >= 0 && tempVal <= 100) {
            System.out.println("Water");
        } else if (tempVal > 100) {
            System.out.println("Steam");
        } else {
            System.out.println("Invalid Temperature");
        }
    }
}
