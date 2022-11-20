package CCE.arrayExercises;
import java.util.Scanner;

public class TwoDExercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int column = scan.nextInt();

        scan.close();

        int tableElem[][] = new int[row+1][column+1];

        for (int i = 0; i < tableElem.length; i++) {
            for (int j = 0; j < tableElem[i].length; j++) {
                System.out.print(tableElem [i] [j] = (i) * (j));
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
