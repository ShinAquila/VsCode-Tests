import java.util.Scanner;

public class dowhileTestttt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names = "";

        do {
           System.out.println("Enter a name: ");
           names = scan.nextLine();

        } while (!names.equals("STOP"));

        scan.close();
    }
}
