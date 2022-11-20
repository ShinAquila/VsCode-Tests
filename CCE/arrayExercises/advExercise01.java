package CCE.arrayExercises;

import java.util.Scanner;

public class advExercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names[] = {"Clariedhel","Jayvive","Weelyn","Lorre","Mae Ann","Nelson","Mervin","Jay","Ryan","Eric","Michael","Joy","Angelo","Marisol","Kent","Vincent"};

        boolean detect = false;
        System.out.println("SEARCH ARRAY CODE");
        System.out.println("This is a system that can search the name of the student of ICT-TVL-B9");
        System.out.println("**********************************************************");

        System.out.print("Please enter the Student Name:      ");
        String nameInput = scan.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------");

        String nameFound = "";
        for (int i = 0; i < names.length; i++) {
            if (nameInput.equals(names[i])) {
                detect = true;
                nameFound = names[i];
            }
        }

        if (detect == true) {
            System.out.println("Name Found: "+nameFound);
        } else {
            System.out.println("No Name Found");
        }
        
        scan.close();
    }
}
