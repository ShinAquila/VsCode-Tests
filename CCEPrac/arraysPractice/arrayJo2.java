package CCEPrac.arraysPractice;
import java.util.Scanner;

public class arrayJo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names [] = {"joane","jo","an","de","sa"};
        Boolean detect = false;

        System.out.println("Input Name ");
        String nameInput = scan.nextLine();

        for(int i=0; i<names.length; i++){
            if(nameInput.equals(names[i])){
                detect = true;
            }
        }

        if (detect == true) {
            System.out.println("User Found");
        } else {
            System.out.println("User Not Found"); 
        }
        scan.close();
    }
}
