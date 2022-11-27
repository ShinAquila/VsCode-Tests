package MoreArrayPractice;
import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the Year: ");
        int year = scan.nextInt();
        scan.close();

        boolean leapYear = false;
        if (year % 4 == 0) {
            leapYear = true;
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            }
        } else {
            leapYear = false;
        }

        System.out.print(year);
        if (leapYear == true) {
            System.out.print(" is a leap year");
        } else {
            System.out.print(" is not a leap year");
        }
        System.out.println();
    }
}
