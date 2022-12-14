package SixTeenExercises;
import java.util.Scanner;

public class ExerBook {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter Book Title: ");
            String book = scan.nextLine();

            System.out.println("Enter number of " +book+ " copies: ");
            int copies = scan.nextInt();

            int price = copies * 250;

            System.out.println("The price of "+copies+ " copies of "+book+" is "+price);
            scan.close();
    }
}
