package MoreArrayPractice;
import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quarter = 0; int dime = 0; int nickel = 0; int penny = 0;
        int quarterCoins = 0; int dimeCoins = 0; int nickelCoins = 0; int pennyCoins = 0;

        System.out.print("Enter the amount of change from 1 to 99:      ");
        int cents = scan.nextInt();
        System.out.println();

        if (cents >= 1 && cents <= 99) {
            quarter = cents/25;
            quarterCoins = quarter * 25;
    
            dime = (cents-quarterCoins)/10;
            dimeCoins = dime * 10;
    
            nickel = (cents-quarterCoins-dimeCoins)/5;
            nickelCoins = nickel * 5;
            
            penny = (cents-quarterCoins-dimeCoins-nickelCoins)/1;
            pennyCoins = penny * 1;
    
            System.out.println(cents+" cents in coins:");
            System.out.println(quarter+" quarters            "+quarterCoins);
            System.out.println(dime+" dime                 "+dimeCoins);
            System.out.println(nickel+" nickel                 "+nickelCoins);
            System.out.println(penny+" penny                 "+pennyCoins);
        } else {
            System.out.println("Invalid-Maximum is only 1-99");
        }
    }
}
