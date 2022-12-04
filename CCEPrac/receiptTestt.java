package CCEPrac;
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Scanner;

public class receiptTestt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String products[] = {"Stop","Candy","Fish","Biscuit","Juice","Milk"};
        int price[] = {0,1,100,10,50,45};

        int prodSearch = 0;
        // String prodStop = "";
        String prodName = "";
        int quantity = 0;
        int prodPrice = 0;
        int total = 0;
        boolean cont = true;

        ArrayList <String> cartProducts = new ArrayList<String>();
        ArrayList <Integer> cartQuantity = new ArrayList<Integer>();
        ArrayList <Integer> cartPrice = new ArrayList<Integer>();
        ArrayList <Integer> cartTotal = new ArrayList<Integer>();

        System.out.println("******************************");
        System.out.printf("%21s %n", "The IDFK Store");
        System.out.println("******************************");
        System.out.println("[0] STOP");
        System.out.println("[1] Candy");
        System.out.println("[2] Fish");
        System.out.println("[3] Biscuit");
        System.out.println("[4] Juice");
        System.out.println("[5] Milk");
        System.out.println();


        do {
            System.out.print("Enter Product: ");
            prodSearch = scan.nextInt();
            if (prodSearch == 0) {
                cont = false;
            } else {
                prodName = products[prodSearch];
                cartProducts.add(prodName);
    
                System.out.print("Enter Quantity: ");
                quantity = scan.nextInt();
                cartQuantity.add(quantity);
                
                prodPrice = price[prodSearch];
                cartPrice.add(prodPrice);
                total = prodPrice * quantity;
                cartTotal.add(total);
                System.out.println();
            } 
        } while (cont == true);


        scan.close();

        System.out.println();
        System.out.printf("%-10s %15s %15s %15s %n","Product","Price","Quantity","Total");
        System.out.println("-".repeat(80));
        // System.out.printf("%-10s %15d %15d %15d %n",prodName,prodPrice,quantity,total);
        System.out.println(cartProducts);

    }
}
