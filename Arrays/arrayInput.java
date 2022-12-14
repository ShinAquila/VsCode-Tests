package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class arrayInput {
    public static void main(String[] args) {
        int numStore;  
        Scanner scan=new Scanner(System.in);  
        System.out.print("Enter the amount of numbers you want to store: "); 
        numStore =scan.nextInt(); 
        
        int[] array = new int[numStore];
        
        System.out.println("----------------------------------");
        System.out.println("Enter " +numStore+ " numbers: "); 
        for(int i = 0; i < numStore; i++){  
            array[i]=scan.nextInt();  
        }  

        System.out.println("----------------------------------");
        System.out.println("Array elements are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("----------------------------------");
        System.out.println("Array elements are: "+Arrays.toString(array));

        scan.close();

    }
}
