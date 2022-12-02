package CCE.arraysPractice;
import java.util.Arrays;
import java.util.Scanner;

public class arrayRemoveVal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[] = {12,23,34,45,56,67,78,89,90};
        int newNum[] = new int [num.length-1];
        System.out.println(Arrays.toString(num));

        System.out.println("Enter value to be removed: ");
        int removeVal = scan.nextInt();
        scan.close();

        int removeIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (removeVal == num[i]) {
                removeIndex = i;
            }
        }

        for (int i = 0; i < removeIndex; i++) {
            newNum[i] = num[i];
        }

        for (int i = removeIndex; i < newNum.length; i++) {
            newNum[i] = num[i+1];
        }

        System.out.println(Arrays.toString(newNum));
    }
}
