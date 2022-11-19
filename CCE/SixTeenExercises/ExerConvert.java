package CCE.SixTeenExercises;
import java.util.Scanner;

public class ExerConvert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Dollars: ");
        int dollars = scan.nextInt();
        double pesos = 48.34;

        double convertedDollars = dollars * pesos;

        System.out.println("The Converted Dollars to Pesos is "+convertedDollars);
        scan.close();
    }
}
