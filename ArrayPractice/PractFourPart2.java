package ArrayPractice;
import java.util.Scanner;

public class PractFourPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
