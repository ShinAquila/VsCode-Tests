package classMethodTests;
import java.util.Scanner;

public class classMainUwU {

    static int total = 0;
    static int num1 = 2;
    static int num2 = 4;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  1: sum, 2: sub, 3: mult");
        int operator = scan.nextInt();

        if (operator == 1) {
            classMainUwU.numSum();
            System.out.println("Total is: "+total);

        } else if (operator == 2) {
            classMainUwU.numSub();
            System.out.println("Total is: "+total);

        } else if (operator == 3) {
            classMainUwU.numMul();
            System.out.println("Total is: "+total);
            
        } else{
            System.out.println("Invalid operator");
        }
        scan.close();
    }

    public static void numSum(){
        total = num1+num2;
    }

    public static void numSub(){
        total = num1-num2;
    }

    public static void numMul(){
        total = num1*num2;
    }
}
