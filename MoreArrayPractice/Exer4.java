package MoreArrayPractice;
import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        String months[][] = {
            {"January","31","31"},
            {"February","28","29"},
            {"March","31","31"},
            {"April","30","30"},
            {"May","31","31"},
            {"June","30","30"},
            {"July","31","31"},
            {"August","31","31"},
            {"September","30","30"},
            {"October","31","31"},
            {"November","30","30"},
            {"December","31","31"}
        };

        String monthName = "";
        String days = "";

        Scanner scan = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int monthNum = scan.nextInt();

        if (monthNum <= 12) {
            System.out.print("Input a year: ");
            int year = scan.nextInt();
            scan.close();

            for (int i = 0; i < monthNum; i++) {
                if (i == monthNum-1) {
                    monthName = months[i][0];
                }
            }
            
            for (int j = 0; j < monthNum; j++) {
                if (j == monthNum-1) {
                    days = months[j][1];
                }
            }
            
            if (monthNum == 2) {
                if (year % 4 == 0) {
                    days = months [1][2];
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            days = months [1][2];
                        } else {
                            days = months [1][1];
                        }
                    }
                } else {
                    days = months [1][1];
                }
            }

            System.out.println();
            System.out.println(monthName+" "+year+" has "+days+" days");
        } else {
            System.out.println("Invalid Month Number");
        }
        
    }
}
