package CCEPrac;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ageSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate now = LocalDate.now();
        String currentDate = dateFormat.format(now);

        boolean dateInvalid = true;
        String birthdayInput = "";
        
        System.out.println("Current Date: "+currentDate);
        System.out.println();
        do {
            try {
                System.out.println("Sample Format   (03/25/2000)");
                System.out.print("Enter Birthday:  ");
                birthdayInput = scan.nextLine();
                System.out.println();
                dateFormat.parse(birthdayInput);
                dateInvalid = false;
            } catch (DateTimeException e) {
                System.out.println("Error Try Again");
                dateInvalid = true;
            }
        } while (dateInvalid);
        scan.close();
        
        String bDay[] = birthdayInput.split("/");

        int BdayArray[] = new int[3];
        
        for (int i = 0; i < bDay.length; i++) {
            BdayArray[i] = Integer.parseInt(bDay[i]);
        }
        
        /*  0 - Month 
            1 - Day
            2 - Year
        */

        LocalDate pdate = LocalDate.of(BdayArray[2], BdayArray[0], BdayArray[1]);

        Period age = Period.between(pdate, now);
        System.out.printf("Age is:  %d years, %d months and %d days old.\n", age.getYears(), age.getMonths(), age.getDays());
    }
}