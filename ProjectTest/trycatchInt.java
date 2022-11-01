import java.util.Scanner;
public class trycatchInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Input number: ");
        num = scan.nextInt();

        try {
            int[] numDatabase = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println(numDatabase[num-1] + " is available in Database");
        } catch (Exception e) {
            System.out.println(num + " is not available in Database");
        }
        scan.close();
        System.exit(0);
    }
}
