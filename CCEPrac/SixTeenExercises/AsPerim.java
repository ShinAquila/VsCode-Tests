package CCEPrac.SixTeenExercises;
import java.util.Scanner;

public class AsPerim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number to find the Perimeter: ");
        int side = scan.nextInt();

        int perim = side * 4;

        System.out.println("\nThe perimeter of "+side+" is ["+perim+"]");
        scan.close();
    }
}
