package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class arrayDelete {
    public static void main(String[] args) {

        

        Scanner scan = new Scanner(System.in);

        String names[] = {"Qwo","Hui","Piu","Ko","Fbu","Gyu"};
        System.out.println("Old Array: "+Arrays.toString(names));

        System.out.println("Enter number to delete name from data: ");
        int numInput = scan.nextInt();
        scan.close();
        
        for (int i = numInput; i < names.length -1; i++) {
            names[i] = names[i+1];
        }

        System.out.println("New Array: "+Arrays.toString(names));

    }
}
