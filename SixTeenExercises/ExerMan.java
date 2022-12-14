package SixTeenExercises;
import java.util.Scanner;

public class ExerMan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Man's Age: ");
        int manAge = scan.nextInt();
        scan.close();

        int womanAge = (manAge/2) +7;
        System.out.println("The ideal woman age for a "+manAge+ " year old man is "+womanAge);
    }   
}
