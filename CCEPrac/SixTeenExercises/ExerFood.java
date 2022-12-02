package CCE.SixTeenExercises;
import java.util.Scanner;

public class ExerFood {
    public static void main(String[] args) {
        Scanner scanFood = new Scanner(System.in);
        Scanner scanPrice = new Scanner(System.in);
        Scanner scanDeliver = new Scanner(System.in);

        double shipping = 0;

        System.out.print("Enter the item: ");
        String food = scanFood.nextLine();

        System.out.print("Enter the price: ");
        double cents = scanPrice.nextDouble();

        System.out.print("Overnight Delivery (0==NO, 1==YES): ");
        int deliver = scanDeliver.nextInt();

        scanFood.close();
        scanPrice.close();
        scanDeliver.close();

        double price = cents/100;

        if (price < 10) {
            shipping = 2.00;
        } else {
            shipping = 3.00;
        }

        if (deliver == 1) {
            shipping += 5.00;
        } else if (deliver != 0) {
            System.out.println("Invalid");
        }

        double total = price + shipping;

        System.out.println();
        System.out.println("Invoice:");
        System.out.println(food +"\t"+ price);
        System.out.println("Shipping"+"\t"+shipping);
        System.out.println("Total"+"\t \t"+total);
    }
}
