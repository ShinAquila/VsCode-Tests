
import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        int myAge;
        int votingAge = 18;
        String cont = "";
        
        Scanner scan = new Scanner(System.in);
        Scanner next = new Scanner(System.in);
        
        do {
            System.out.println("Enter your age: ");
            myAge = scan.nextInt();

            if (myAge >= votingAge) {
                System.out.println("You are allowed to vote!\n");
            } else {
                System.out.println("You are not allowed to vote!\n");
            } 

            System.out.println("Do you want to continue?");
            cont = next.nextLine(); 
            System.out.println(" ");
        }while (cont.equals("Yes") || cont.equals("Y") || cont.equals("y"));
        
        scan.close();
        next.close();
    }
}
