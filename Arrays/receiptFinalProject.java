// package Arrays;

// import java.util.Formatter;
// import java.io.IOException;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import java.text.DecimalFormat;
// import java.util.Scanner;
// public class receiptFinalProject {
//     public static void main(String[] args) throws InterruptedException {
//         Scanner scanString = new Scanner(System.in);
//         Scanner scanInt = new Scanner(System.in);

//         String cashierName = "";
//         String numOR = "";
//         String itemName = "";
//         int itemQuant = 0;
//         int numItems = 0;
//         double totalPrice = 0;
//         double itemPrice = 0;
//         double subtotal = 0;
//         double vat = 0;
//         double totalPay = 0;
//         double custPay = 0;
//         double change = 0;
//         boolean toLoop = true;

//         String inputLine1 = "*".repeat(41);
//         String inputLine2 = "-".repeat(41);
//         String receiptLine1 = "*".repeat(52);
//         String receiptLine2 = "-".repeat(48);

//         DecimalFormat formatReceipt = new DecimalFormat("#,##0.00");
//         DateTimeFormatter date = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//         LocalDateTime dateToday = LocalDateTime.now();



//         System.out.println("\t PURCHASE RECEIPT SYSTEM");
//         System.out.printf("%30s %n","INPUT DETAILS BELOW");

//         System.out.println(inputLine1);
//         System.out.printf("%-29s","Enter Cashier Name:");
//         cashierName = scanString.nextLine();
        
//         System.out.printf("%-29s","Enter O.R. No:");
//         numOR = scanString.nextLine();
//         System.out.println(inputLine1);

//         System.out.printf("%-29s","Enter Number of Items:");
//         while (toLoop) {
//             try {
//                 numItems = Integer.parseInt(scanString.nextLine());    
//                 toLoop = false;
//             }
//             catch (NumberFormatException NFEx) {
//                 System.out.print("Invalid Integer. Try again...");
//                 Thread.sleep(2000);
//                 System.out.print("\b".repeat(50));
//                 System.out.printf("%-29s","Enter Number of Items:");
//             }
//         }
//         System.out.println(inputLine1);
        

//         int cartQuantity [] = new int[numItems];
//         String cartProduct [] = new String[numItems];
//         double cartPrice [] = new double[numItems];
//         double cartProductPrice [] = new double[numItems];

//         for (int i = 0; i < numItems; i++) {
//             int count = i+1;
//             System.out.printf("%-28s ","["+count+"] Enter Item Name:");
//             itemName = scanString.nextLine();
//             cartProduct[i] = itemName;
    
//             toLoop = true;
//             System.out.printf("%-29s","Enter Item Price:");
//             while (toLoop) {
//                 try {
//                     itemPrice = Double.parseDouble(scanString.nextLine());
//                     toLoop = false;
//                     cartPrice[i] = itemPrice;
                    
//                 } catch (NumberFormatException NFEx) {
//                     System.out.print("Invalid Integer. Try again...");
//                     Thread.sleep(2000);
//                     System.out.print("\b".repeat(50));
//                     System.out.printf("%-29s","Enter Item Price:");
//                 }
//             }
    
//             toLoop = true;
//             System.out.printf("%-29s","Enter Item Quantity:");
//             while (toLoop) {
//                 try {
//                     itemQuant = Integer.parseInt(scanString.nextLine());
//                     toLoop = false;
//                     cartQuantity[i] = itemQuant;
                    
//                 } catch (NumberFormatException NFEx) {
//                     System.out.print("Invalid Integer. Try again...");
//                     Thread.sleep(2000);
//                     System.out.print("\b".repeat(50));
//                     System.out.printf("%-29s","Enter Item Quantity:");
//                 }
//             }
    
//             System.out.println(inputLine2);
//         }

//         for (int i = 0; i < numItems; i++) {
//             totalPrice = cartPrice[i] * cartQuantity[i];
//             cartProductPrice[i] = totalPrice;
//             subtotal += totalPrice;
//         }

//         vat = subtotal * 0.05;
//         totalPay = subtotal + vat;


//         String newTotalPay = formatReceipt.format(totalPay);

//         System.out.printf("%-28s %2s %n","TOTAL PAYMENT: ","Php "+newTotalPay);
//         System.out.println(inputLine1);

//         toLoop = true;
//         System.out.printf("%-28s %2s","Enter Customer Payment: ","Php ");
//         while (toLoop) {
//             try {
//                 do {
//                     custPay = Double.parseDouble(scanString.nextLine());
//                     if (custPay < totalPay) {
//                         System.out.print("Payment Low. Try again...");
//                         Thread.sleep(2000);
//                         System.out.print("\b".repeat(50));
//                         System.out.printf("%-28s %2s","Enter Customer Payment: ","Php ");
//                     }
//                 } while (custPay < totalPay);
//                 toLoop = false;
                
//             } catch (NumberFormatException NFEx) {
//                 System.out.print("Invalid Integer. Try again...");
//                 Thread.sleep(2000);
//                 System.out.print("\b".repeat(50));
//                 System.out.printf("%-28s %2s","Enter Customer Payment: ","Php ");
//             }
//         }

//         scanInt.close();
//         scanString.close();

//         change = custPay - totalPay;
//         System.out.println(inputLine1);
        


//         try {
//             if (System.getProperty("os.name").contains("Windows")) {
//                 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//             } else {
//                 Runtime.getRuntime();
//             }
//         } catch (IOException | InterruptedException ex) {}

//         System.out.printf("%36s %n","Gaisano Grand Mall");
//         System.out.printf("%41s %n","Mc.Arthur Highway, Digos City");
//         System.out.printf("%42s %n","Tel. #: 553-2847 Fax: 679652382");
//         System.out.printf("%39s %n","GST Reg. No. 00023648294");
//         System.out.printf("%34s %n %n","RCB: 529873290");

//         System.out.printf("%35s %n %n","PURCHASE RECEIPT");
//         System.out.print("    Cashier: "+cashierName);
//         System.out.print("\t\t    O.R. No: "+numOR);
//         System.out.println("\n    Date: "+date.format(dateToday));
//         System.out.printf("%2s %1s %n"," ",receiptLine1);

        

//         System.out.print("      Qty.\t"+"Item/s\t\t\t     "+"Price/s");
//         System.out.println("\n     "+receiptLine2);
//         for (int i = 0; i < numItems; i++) {
//             String prodPrice = formatReceipt.format(cartProductPrice[i]);
//             System.out.printf("%6s %-8s %-30s %1s %n", " ", cartQuantity[i] , cartProduct[i] , prodPrice);
//         }

//         String newSubTotal = formatReceipt.format(subtotal);
//         String newVAT = formatReceipt.format(vat);
//         String newCustPay = formatReceipt.format(custPay);
//         String newChange = formatReceipt.format(change);

//         System.out.println("   "+receiptLine1);
//         System.out.print("      "+"SUBTOTAL\t\t\t\t   "+"Php "+newSubTotal);
//         System.out.print("\n\n      "+"VAT(5%)\t\t\t\t   "+"Php "+newVAT);
//         System.out.print("\n\n      "+"TOTAL\t\t\t\t   "+"Php "+newTotalPay);
//         System.out.print("\n\n      "+"CASH\t\t\t\t   "+"Php "+newCustPay);
//         System.out.print("\n      "+"CHANGE\t\t\t\t   "+"Php "+newChange);

//         System.out.print("\n\n\t\tThank you for Shopping!\n");
//     }
// }
