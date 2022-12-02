package CCE.arraysPractice;
import java.util.Arrays;
import java.util.Scanner;

public class arrayInsertValue {
    public static void main(String[] args) {
        int num[] = {12,23,34,45,56,67,78,89,90};
        int newNum[] = new int [num.length+1];

        System.out.println("Original: "+Arrays.toString(num));

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter New Value: \n");
        int newVal = scan.nextInt();
        System.out.print("Position to be inserted: \n");
        int indexInsert = scan.nextInt();
        scan.close();

        for (int i = 0; i < indexInsert; i++) {
            newNum[i] = num[i];
        }
        for (int i = num.length; i > indexInsert; i--) {
            newNum[i] = num[i-1];
        }

        newNum[indexInsert] = newVal;
        System.out.println("New Array: "+Arrays.toString(newNum));
    }
}
