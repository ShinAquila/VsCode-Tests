package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraySumVal {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of values to sum: ");
        int numStore = scan.nextInt();
        int numb[] = new int [numStore];

        System.out.println("--------------------------------------");
        System.out.println("Enter the values: ");
        for (int i = 0; i < numStore; i++) {
            numb[i] = scan.nextInt();
            sum += numb[i];
        }
        
        System.out.println("--------------------------------------");
        System.out.println("The values are: "+Arrays.toString(numb));

        System.out.println("--------------------------------------");
        System.out.println("The sum of the values are: "+sum);
        scan.close();
        
    }
}
