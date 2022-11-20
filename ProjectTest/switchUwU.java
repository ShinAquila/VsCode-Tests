import java.util.Scanner;

public class switchUwU {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What day is it? ");
        String day = scan.nextLine();
        scan.close();

        switch (day) {
            case "su":
                System.out.println("Sunday");
                break;
            case "m":
                System.out.println("Monday");
                break;
            case "t":
                System.out.println("Tuesday");
                break;
            case "w":
                System.out.println("Wednesday");
                break;
            case "th":
                System.out.println("Thursday");
                break;
            case "f":
                System.out.println("Friday");
                break;
            case "sa":
                System.out.println("Saturday");
                break;
        }
    }
}
