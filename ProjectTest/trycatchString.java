import java.util.Scanner;

public class trycatchString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Input number: ");
        num = scan.nextInt();

        try {
            String[] numDatabase = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
            System.out.println(numDatabase[num-1] + " is available in Database");
        } catch (Exception e) {
            System.out.println(num + " is not available in Database");
        }
        scan.close();
        System.exit(0);
    }
}
