import java.util.Date;

public class printf {
    public static void main(String[] args) {
    
        System.out.printf("nani%nthe%nfrick");

        System.out.println(" ");

        System.out.printf("%b%n", "oop");
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 5.3);
        System.out.printf("%b%n", "random text");

        System.out.println(" ");

        System.out.printf("'%s' %n", "pain");
        System.out.printf("'%S' %n", "pain");

        System.out.println(" ");

        System.out.printf("'%10s' %n", "pain");
        System.out.printf("'%-10s' %n", "baeldung");

        System.out.println(" ");

        System.out.printf("%2.2s", "Hi there!");

        System.out.println(" ");

        Date date = new Date();
        System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);
        System.out.printf("%1$tA, %1$tB %1$tY %n", date);
        System.out.printf("%1$td.%1$tm.%1$ty %n", date);

        System.exit(0);

    }
}
