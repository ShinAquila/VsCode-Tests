package CCEPrac;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ageSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate DateNow = LocalDate.now();
        String CurrentDateString = dateFormat.format(DateNow);

        boolean dateInvalid = true;
        String birthdayInput = "";
        
        System.out.println("Current Date: "+CurrentDateString);
        System.out.println();
        do {
            try {
                System.out.println("Sample Format   (03/25/2000)");
                System.out.print("Enter Birthday:  ");
                birthdayInput = scan.nextLine();
                dateFormat.parse(birthdayInput);

                System.out.println();
                dateInvalid = false;
            } catch (DateTimeException e) {
                System.out.println("Error Try Again");
                System.out.println();
                dateInvalid = true;
            }
        } while (dateInvalid);
        scan.close();
        
        String BDaySplit[] = birthdayInput.split("/");

        int BDayInteger[] = new int[3];
        
        for (int i = 0; i < BDaySplit.length; i++) {
            BDayInteger[i] = Integer.parseInt(BDaySplit[i]);
        }
        
        /*  0 - Month 
            1 - Day
            2 - Year
        */

        LocalDate BirthDate = LocalDate.of(BDayInteger[2], BDayInteger[0], BDayInteger[1]);

        Period age = Period.between(BirthDate, DateNow);
        System.out.printf("Age is: %d years, %d months and %d days old.\n", age.getYears(), age.getMonths(), age.getDays());
    }
}