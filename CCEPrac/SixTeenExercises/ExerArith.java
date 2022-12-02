package CCE.SixTeenExercises;
import java.util.Scanner;

public class ExerArith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0; int num2 = 0;

        System.out.print("Enter First Number: ");
        num1 = scan.nextInt();

        System.out.print("Enter Second Number: ");
        num2 = scan.nextInt();
        scan.close();

        int sum = num1+num2;
        int diff = num1-num2;
        int prod = num1*num2;
        int quo = num1/num2;
        int mod = num1%num2;

        System.out.println("");

        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
        System.out.println("The difference of "+num1+" and "+num2+" is "+diff);
        System.out.println("The product of "+num1+" and "+num2+" is "+prod);
        System.out.println("The quotient of "+num1+" and "+num2+" is "+quo);
        System.out.println("The modulo of "+num1+" and "+num2+" is "+mod);
    }
}
