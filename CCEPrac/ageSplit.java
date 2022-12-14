package CCEPrac;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ageSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
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
        String dateNow[] = currentDate.split("/");

        int BdayArray[] = new int[3];
        int currentDateArray[] = new int[3];

        for (int i = 0; i < bDay.length; i++) {
            BdayArray[i] = Integer.parseInt(bDay[i]);
        }

        for (int i = 0; i < dateNow.length; i++) {
            currentDateArray[i] = Integer.parseInt(dateNow[i]);
        }

        /*  0 - Month 
            1 - Day
            2 - Year
        */

        int ageYear = currentDateArray[2] - BdayArray[2];
        if (currentDateArray[1] < BdayArray[1]) {
            if (currentDateArray[0] >= BdayArray[0]) {
                ageYear = ageYear - 1;
            }
        }
        System.out.println("Age is: "+ageYear);
    }
}
