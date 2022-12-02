package CCEPrac;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class receiptTestt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String products[] = {"Candy","Fish","Biscuit","Juice","Milk"};
        int price[] = {1,100,10,50,45};

        ArrayList <String> cartProducts = new ArrayList<String>();
        ArrayList <Integer> cartQuantity = new ArrayList<Integer>();
        ArrayList <Integer> cartPrice = new ArrayList<Integer>();
        ArrayList <Integer> cartTotal = new ArrayList<Integer>();

        System.out.println("******************************");
        System.out.printf("%21s %n", "The IDFK Store");
        System.out.println("******************************");
        System.out.println("[0] Candy");
        System.out.println("[1] Fish");
        System.out.println("[2] Biscuit");
        System.out.println("[3] Juice");
        System.out.println("[4] Milk");
        System.out.println();

        System.out.print("Enter Product: ");
        int prodSearch = scan.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = scan.nextInt();
        scan.close();

        int prodPrice = 0;
        String prodName = "";

        for (int i = 0; i < price.length; i++) {
            prodName = products[prodSearch];
        }

        for (int i = 0; i < products.length; i++) {
            prodPrice = price[prodSearch];
        }
        
        int total = prodPrice * quantity;

        System.out.println();
        System.out.printf("%-10s %15s %15s %15s %n","Product","Price","Quantity","Total");
        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %15d %15d %15d %n",prodName,prodPrice,quantity,total);

    }
}
