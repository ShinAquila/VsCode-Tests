import java.util.Scanner;
public class hehe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double ratePhour = 35.00; double hourswork = 0; double overtime = 0; double overtimePay = 0;
        double normalPay = 0; double totalSalary = 0;

        System.out.print("Enter hours worked: ");
        hourswork = scan.nextDouble();
        scan.close();

        if (hourswork > 8) {
            normalPay = ratePhour * hourswork;
            overtime = hourswork - 8;
            overtimePay = overtime * (ratePhour * 1.5);
            totalSalary = normalPay + overtimePay;
            System.out.println("Normal Pay: "+normalPay);
            System.out.println("Overtime Pay: "+overtimePay);
            System.out.println("Total Salary: "+totalSalary);
        } else {
            normalPay = ratePhour * hourswork;
            totalSalary = normalPay + overtimePay;
            System.out.println("Normal Pay: "+normalPay);
            System.out.println("Overtime Pay: 0");
            System.out.println("Total Salary: "+totalSalary);
        }
    }
}
