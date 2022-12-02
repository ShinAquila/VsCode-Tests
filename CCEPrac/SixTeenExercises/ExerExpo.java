package CCEPrac.SixTeenExercises;
import java.util.Scanner;

public class ExerExpo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter the Base Value: ");
        int baseVal = scan.nextInt();

        System.out.println("Please Enter the Exponent Value: ");
        int expoVal = scan.nextInt();

        System.out.println("The value of "+baseVal+" raised to the power of "+expoVal+" is "+Math.pow(baseVal, expoVal));
        
        scan.close();
    }
}
