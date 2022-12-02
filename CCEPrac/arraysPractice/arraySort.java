package CCE.arraysPractice;
import java.util.Arrays;
import java.util.Scanner;

public class arraySort {
    public static void main(String[] args) {
        int numStore = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of numbers to be sorted: ");
        numStore = scan.nextInt();

        int numb [] = new int[numStore];

        System.out.println("--------------------------");
        System.out.println("Enter numbers to be sorted");
        for (int i = 0; i < numStore; i++) {
            numb[i] = scan.nextInt();
        }

        Arrays.sort(numb);
        System.out.println("--------------------------");
        System.out.println("The sorted numbers: ");
        System.out.println("Sorted numbers: "+Arrays.toString(numb));

        scan.close();

    }
}
