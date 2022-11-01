import java.util.Scanner;
public class orderwhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int weight = 0;
        double sum = 0;
        double over = 0.25;
        double cost = 3;

        System.out.println("Weight of Order:");
        weight = scan.nextInt();

        while (weight != 0) {
            sum = 0;
            if(weight <= 10) {
                
            }
            else if (weight > 10){
                for (int i = 10; i < weight; i++) {
                    sum = sum + over;
                }
            }
            else{
                System.out.println("Error");
            }

            sum = sum + cost;
            System.out.println("Shipping cost: $"+sum);
            System.out.println("---------------");
            System.out.printf("%nWeight of Order:%n");
            weight = scan.nextInt();
        }

        System.out.println("bye");

        scan.close();
        System.exit(0);
    }
}
