package CCE.arraysUwU;
import java.util.Arrays;
import java.util.Scanner;

public class arrayFindIndex {
    public static void main(String[] args) {
        Boolean nameFound = false;
        Scanner scan = new Scanner(System.in);
        
        String names[] = {"John","Fed","Dan","Rob"};

        System.out.println("Input Name to find: ");
        String nameInput = scan.nextLine();

        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(nameInput)){
                nameFound = true;
            }
        }

        if (nameFound == true) {
            System.out.println("The index number for " +nameInput+ " is "+Arrays.asList(names).indexOf(nameInput));
        } else {
            System.out.println(nameInput+" not found in database");
        }

        scan.close();

    }
}
