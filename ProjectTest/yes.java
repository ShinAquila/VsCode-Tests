import java.util.Scanner;

public class yes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names [] = {"Clariedhel","Jayvive","Weelyn","Lorre","Mae Ann","Nelson","Mervin","Jay","Ryan","Eric","Michael","Joy","Angelo","Marisol","Kent","Vincent"};

        String cont = "";

        System.out.println("SEARCH ARRAY CODE");
        System.out.println("This is a system that can search the name of the student of ICT-TVL-B9");
        System.out.println("**************************************************************************");

        do {
            boolean detect = false;
            System.out.print("Please enter the Student Name:      ");
            String nameInput = scan.nextLine();
            System.out.println("--------------------------------------------------------------------------");

            for (int i = 0; i < names.length; i++) {
                if (nameInput.equals(names[i])) {
                    detect = true;
                }
            }

            if (detect == true) {
                System.out.print("NAME FOUND, ");
            } else {
                System.out.print("No Name Found, ");
            }

            detect = false;

            System.out.print("Do you want to search for another name? (Y/N): ");
            cont = scan.nextLine(); 
            System.out.println(" ");

        } while (cont.equals("Y"));

        System.out.println("SEARCHING STOPPED");
        
        scan.close();
    }
}
