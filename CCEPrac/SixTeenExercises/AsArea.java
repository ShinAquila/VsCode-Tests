package CCE.SixTeenExercises;
import java.util.Scanner;

public class AsArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Length of the Rectangle: ");
        int leng = scan.nextInt();

        System.out.println("Enter the Width of the Rectangle: ");
        int widt = scan.nextInt();

        int area = leng * widt;

        System.out.println("\nThe Area of the Rectangle is ["+area+"]");
        scan.close();
    }
}
