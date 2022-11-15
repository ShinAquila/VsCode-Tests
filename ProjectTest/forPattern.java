
import java.util.Scanner;

public class forPattern {
    public static void main(String[] args) {
        Scanner rowScan = new Scanner(System.in);
        Scanner colScan = new Scanner(System.in);
        Scanner patScan = new Scanner(System.in);
        int i,j;

        System.out.println("Input amount for row: ");
        int rowNum = colScan.nextInt();

        System.out.println("Input amount for column: ");
        int colNum = colScan.nextInt();

        System.out.println("Input pattern: ");
        String patt = patScan.nextLine();

        colScan.close();
        rowScan.close();

        System.out.println("------------------------");
        for (i = 0; i < rowNum; i++) {
            for (j = 0; j < colNum; j++) {
                System.out.print(patt);
            }
            System.out.println("");
        }
        

    }
}
