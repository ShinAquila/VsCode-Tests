package CCE.arrayExercises;
import java.util.Scanner;

// Advance Search Names in 1D Array – Part 2

public class advExercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names [] = {"Clariedhel","Jayvive","Weelyn","Lorre","Mae Ann","Nelson","Mervin","Jay","Ryan","Eric","Michael","Joy","Angelo","Marisol","Kent","Vincent"};

        String cont = "";
        boolean detect = false;

        System.out.println("SEARCH ARRAY CODE");
        System.out.println("This is a system that can search the name of the student of ICT-TVL-B9");
        System.out.println("**************************************************************************");

        do {
            System.out.print("Please enter the Student Name:      ");
            String nameInput = scan.nextLine();
            System.out.println("--------------------------------------------------------------------------");

            for (int i = 0; i < names.length; i++) {
                if (nameInput.equals(names[i])) {
                    detect = true;
                }
            }

            if (detect == true) {
                System.out.print("NAME FOUND, Do you want to search for another name? (Y/N): ");
                cont = scan.nextLine(); 
                System.out.println(" ");
                detect = false;
            } else {
                System.out.print("No Name Found, Do you want to search for another name? (Y/N): ");
                cont = scan.nextLine(); 
                System.out.println(" ");
                detect = false;
            }

            

        } while (cont.equals("Y"));

        System.out.println("SEARCHING STOPPED");
        
        scan.close();



    }
}