package CCEPrac;
import java.util.ArrayList;
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

        System.out.print("Enter Product: ");
        String prodSearch = scan.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = scan.nextInt();
        scan.close();

        int prodPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (prodSearch.equals(products[i])) {
                prodPrice = price[i];
            }
        }
        
        int total = prodPrice * quantity;

        System.out.println();
        System.out.printf("%-10s %15s %15s %15s %n","Product","Price","Quantity","Total");
        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %15d %15d %15d %n",prodSearch,prodPrice,quantity,total);

    }
}
