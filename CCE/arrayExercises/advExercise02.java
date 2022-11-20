package CCE.arrayExercises;
import java.util.Scanner;

public class advExercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names [] = {"Clariedhel","Jayvive","Weelyn","Lorre","Mae Ann","Nelson","Mervin","Jay","Ryan","Eric","Michael","Joy","Angelo","Marisol","Kent","Vincent"};

        boolean detect = false;
        String cont = "";

        System.out.println("SEARCH ARRAY CODE");
        System.out.println("This is a system that can search the name of the student of ICT-TVL-B9");
        System.out.println("**************************************************************************");

        do {
            System.out.print("Please enter the Student Name:      ");
            String nameInput = scan.nextLine();
            System.out.println("--------------------------------------------------------------------------");

            String nameFound = "";
            for (int i = 0; i < names.length; i++) {
                if (nameInput.equals(names[i])) {
                    detect = true;
                    nameFound = names[i];
                }
            }

            if (detect == true) {
                System.out.print("NAME FOUND, ");
            } else {
                System.out.print("No Name Found, ");

            }

            System.out.print("Do you want to search for another name? (Y/N): ");
            cont = scan.nextLine(); 
            System.out.println(" ");

        } while (cont.equals("Y"));

        System.out.println("SEARCHING STOPPED");
        
        scan.close();



    }
}
