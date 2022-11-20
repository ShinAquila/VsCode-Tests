package CCE.arrayExercises;
import java.util.Scanner;

public class advExercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names [] = {"Clariedhel","Jayvive","Weelyn","Lorre","Mae Ann","Nelson","Mervin","Jay","Ryan","Eric","Michael","Joy","Angelo","Marisol","Kent","Vincent"};

        boolean detect = false;
        System.out.println("SEARCH ARRAY CODE");
        System.out.println("This is a system that can search the name of the student of ICT-TVL-B9");
        System.out.println("**************************************************************************");

        do {
            System.out.print("Please enter the Student Name:      ");
            String nameInput = scan.nextLine();
            System.out.println("--------------------------------------------------------------------------");
        } while (detect);
        
        scan.close();



    }
}
