import java.util.Scanner;
public class inrange {
    public static void main(String[] args) {
        int value;
        int sumInRange = 0;
        int sumOutRange = 0;
        Scanner scan = new Scanner(System.in);


        System.out.printf("In-range Adder%nLow end of Range:%n");
        int lowRange = scan.nextInt();

        System.out.println("High end of Range: ");
        int highRange = scan.nextInt();
        System.out.println("------------");

        
        System.out.println("Enter data:");
        value = scan.nextInt();

        while (value != 0) {
            if (value >= lowRange && value < highRange) {
                sumInRange = sumInRange + value;
            }
            else if (value >= highRange) {
                sumOutRange = sumOutRange + value;
            } 
            else{
                System.out.println("Error");
            }
            
            System.out.println("Enter data:");
            value = scan.nextInt();
        }
        System.out.println("Sum of in range values: "+ sumInRange);
        System.out.println("Sum of out of range values: "+ sumOutRange);

        scan.close();
        System.exit(0);

    }
}
