package Arrays;
import java.util.Scanner;

public class arrayJo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names [] = {"joane","jo","an","de","sa"};
        int detect = 0;

        System.out.println("Input Name ");
        String nameInput = scan.nextLine();

        for(int i=0; i<names.length; i++){
            if(nameInput.equals(names[i])){
                detect = 1;
            }
        }
        
        if (detect == 1) {
            System.out.println("User Found");
        } else {
            System.out.println("User Not Found");
        }
        
        scan.close();
    }
}
