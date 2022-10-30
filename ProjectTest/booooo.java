
import java.util.Scanner;

public class booooo {
    public static void main(String[] args) {
        int myAge;
        int votingAge = 18;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        myAge = scan.nextInt();


        if (myAge >= votingAge) {
            System.out.println("You are allowed to vote!");

            System.out.println("Do you want to continue?");
            String conti = scan.nextLine();

            while(conti.equals("Yes")){
                
                myAge = scan.nextInt();

                if (myAge >= votingAge) {
                    System.out.println("You are allowed to vote!");
                } else {
                    System.out.println("You are not allowed to vote!");
                    break;
                }

            }
        } else {
            System.out.println("You are not allowed to vote!");
        }
        scan.close();
    }
}
