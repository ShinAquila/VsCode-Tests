package javaTests;
import java.util.Scanner;

public class arrayyyy {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num");
        int num = scan.nextInt();
        num = num+1;

        System.out.println("");

        int[] a = new int[num];

        for(int i=1; i<num; ++i){
            a[i] = i;
        }

        for(int i=1; i<num; ++i){
            System.out.println(a[i]);
        }

        int sum = 0;
        for(int newNum : a){
            sum = sum+newNum;
            
        }
        System.out.println("Total: "+sum);
        
    }
}
