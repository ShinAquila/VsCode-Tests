package CCEPrac;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class receiptFinalProject {
    public static void main(String[] args) {
        Scanner scanString = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        String cashierName = "";
        String numOR = "";
        String itemName = "";
        int itemQuant = 0;
        int numItems = 0;
        double totalPrice = 0;
        double itemPrice = 0;
        double subtotal = 0;
        double vat = 0;
        double totalPay = 0;
        double custPay = 0;
        double change = 0;

        String inputLine1 = "*".repeat(41);
        String inputLine2 = "-".repeat(41);
        String receiptLine1 = "*".repeat(52);
        String receiptLine2 = "-".repeat(48);

        DecimalFormat formatReceipt = new DecimalFormat("#,##0.00");
        DateTimeFormatter date = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime dateToday = LocalDateTime.now();



        System.out.println("\t PURCHASE RECEIPT SYSTEM");
        System.out.printf("%30s %n","INPUT DETAILS BELOW");

        System.out.println(inputLine1);
        System.out.printf("%-29s","Enter Cashier Name:");
        cashierName = scanString.nextLine();
        System.out.printf("%-29s","Enter O.R. No:");
        numOR = scanString.nextLine();
        System.out.println(inputLine1);

        System.out.printf("%-29s","Enter Number of Items:");
        numItems = scanInt.nextInt();
        System.out.println(inputLine1);


        int cartQuantity [] = new int[numItems];
        String cartProduct [] = new String[numItems];
        double cartPrice [] = new double[numItems];
        double cartProductPrice [] = new double[numItems];

        for (int i = 0; i < numItems; i++) {
            int count = i+1;
            System.out.printf("%-28s ","["+count+"] Enter Item Name:");
            itemName = scanString.nextLine();
            cartProduct[i] = itemName;
    
            System.out.printf("%-29s","Enter Item Price:");
            itemPrice = scanInt.nextDouble();
            cartPrice[i] = itemPrice;
    
            System.out.printf("%-29s","Enter Item Quantity:");
            itemQuant = scanInt.nextInt();
            cartQuantity[i] = itemQuant;
    
            System.out.println(inputLine2);
        }

        for (int i = 0; i < numItems; i++) {
            totalPrice = cartPrice[i] * cartQuantity[i];
            cartProductPrice[i] = totalPrice;
            subtotal += totalPrice;
        }

        vat = subtotal * 0.05;
        totalPay = subtotal + vat;


        String newTotalPay = formatReceipt.format(totalPay);

        System.out.printf("%1s %16s %2s %n","TOTAL PAYMENT: ","Php",newTotalPay);
        System.out.println(inputLine1);

        do {
            System.out.printf("%-28s %2s","Enter Customer Payment: ","Php ");
            custPay = scanInt.nextDouble();
        } while (custPay < totalPay);

        scanInt.close();
        scanString.close();

        change = custPay - totalPay;
        System.out.println(inputLine1);
        


        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime();
            }
        } catch (IOException | InterruptedException ex) {}


        
        System.out.printf("%36s %n","Gaisano Grand Mall");
        System.out.printf("%41s %n","Mc.Arthur Highway, Digos City");
        System.out.printf("%42s %n","Tel. #: 553-2847 Fax: 679652382");
        System.out.printf("%39s %n","GST Reg. No. 00023648294");
        System.out.printf("%34s %n %n","RCB: 529873290");

        System.out.printf("%35s %n %n","PURCHASE RECEIPT");
        System.out.printf("%13s %1s","Cashier: ",cashierName);
        System.out.printf("%27s %1s %n","O.R. No: ",numOR);
        System.out.printf("%10s %1s %n %n","Date: ",date.format(dateToday));
        System.out.printf("%2s %1s %n"," ",receiptLine1);

        

        System.out.printf("%10s %10s %30s %n","Qty.","Item/s","Price/s");
        System.out.printf("%4s %1s %n"," ",receiptLine2);
        for (int i = 0; i < numItems; i++) {
            String prodPrice = formatReceipt.format(cartProductPrice[i]);
            System.out.printf("%6s %-8s %-30s %1s %n", " ", cartQuantity[i] , cartProduct[i] , prodPrice);
        }

        String newSubTotal = formatReceipt.format(subtotal);
        String newVAT = formatReceipt.format(vat);
        String newCustPay = formatReceipt.format(custPay);
        String newChange = formatReceipt.format(change);

        System.out.printf("%2s %1s %n"," ",receiptLine1);
        System.out.printf("%14s %31s %1s %n %n","SUBTOTAL","Php",newSubTotal);
        System.out.printf("%13s %32s %1s %n %n","VAT(5%)","Php",newVAT);
        System.out.printf("%11s %34s %1s %n %n","TOTAL","Php",newTotalPay);
        System.out.printf("%10s %35s %1s %n","CASH","Php",newCustPay);
        System.out.printf("%12s %33s %1s %n %n","CHANGE","Php",newChange);

        System.out.printf("%15s %1s %n"," ","Thank you for Shopping!");
    }
}
