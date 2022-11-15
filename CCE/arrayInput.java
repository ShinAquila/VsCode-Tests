package CCE;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        int numStore;  
        Scanner scan=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: "); 
        numStore =scan.nextInt(); 
        numStore += 1;
        
        String[] array = new String[numStore];
        
        System.out.println("----------------------------------");
        System.out.println("Enter the elements of the array: "); 
        for(int i = 0; i < array.length; i++){  
            array[i]=scan.nextLine();  
        }  

        System.out.println("----------------------------------");
        System.out.println("Array elements are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }

        scan.close();

    }
}
