package CCE.SixTeenExercises;
import java.util.Scanner;

public class ExerSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rate = 35.00;
        int overtime = 0;
        double overtimePay = 0;
        double overtimePayFinal = 0;
        double salary = 0;

        System.out.print("Enter hours worked: ");
        int hoursWorked = scan.nextInt();
        scan.close();

        if (hoursWorked >= 1 && hoursWorked <= 8) {
            salary = hoursWorked * rate;
        }
        else if (hoursWorked > 8) {
            overtime = hoursWorked - 8;
            overtimePay = overtime * rate;
            overtimePayFinal = overtimePay * 1.5;
            salary = 8 * rate;
        } 

        System.out.println("Normal Pay: "+salary);
        System.out.println("Overtime Pay: "+overtimePayFinal);
        System.out.println("Total Salary: "+ (salary + overtimePayFinal));
    }
}
