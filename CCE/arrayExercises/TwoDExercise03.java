package CCE.arrayExercises;
import java.util.Scanner;

public class TwoDExercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rowInput = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int colInput = scan.nextInt();
        System.out.println(" ");

        scan.close();

        int range = rowInput * colInput;

        int tableElem[][] = new int[range][range];

        for (int row = 0; row < rowInput; row++) {
            for (int col = 0; col < colInput; col++) {
                tableElem [row] [col] = (row+1) * (col+1);
            }
        }

        for (int row = 0; row < rowInput; row++) {
            for (int col = 0; col < colInput; col++) {
                System.out.print(tableElem[row][col]+"\t");
            }
            System.out.println("");
        }

    }
}
