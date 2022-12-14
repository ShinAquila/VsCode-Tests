package Arrays;
import java.util.Scanner;
public class payrollTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        boolean foundEmployee = true;
        String payrollContinue = "";
        String nameEmployee = "";
        // int idFound = 0;
        int i = 0;
        int employeeIDsearch = 0;

        int employeeID [] = {5121,5122,5123};
        String employeeName [] = {"John","Mark","Dave"};

        
        do {
            do {
                foundEmployee = false;
                System.out.println("*".repeat(80));
                System.out.printf("%-30s","Enter Employee ID: ");
                employeeIDsearch = scan.nextInt();
                System.out.println("*".repeat(80));
        
                for (i = 0; i < employeeID.length; i++) {
                    if (employeeIDsearch == employeeID[i]) {
                        foundEmployee = true;
                        nameEmployee = employeeName[i];
                        // idFound = i;
                    }
                }
            
                if (foundEmployee != true) {
                    try {
                        if (System.getProperty("os.name").contains("Windows"))
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception E) {}
                    System.out.printf("ID:%d not found in Database %n", employeeIDsearch);
                    System.out.println("Please Try Again...");
                }
            } while (foundEmployee != true);
            
            System.out.printf("%-30s","Payroll for Date: ");
            String payrollDate = scan1.nextLine();
            
            System.out.printf("%-30s","Rate per Day: ");
            int RPD = scan.nextInt();
            System.out.printf("%-30s","SSS Contribution: ");
            int sss = scan.nextInt();
            System.out.printf("%-30s","Pagibig Contribution: ");
            int pagibig = scan.nextInt();
            System.out.printf("%-30s","PhilHealth Contribution: ");
            int philhealth = scan.nextInt();
            System.out.println();


            System.out.printf("%-30s","Number of days Worked: ");
            int daysWork = scan.nextInt();
            System.out.printf("%-30s","Number of hours Late: ");
            int hoursLate = scan.nextInt();
            System.out.printf("%-30s","Number of hours Undertime: ");
            int hoursUndertime = scan.nextInt();
            System.out.printf("%-30s","Number of days Absent: ");
            int daysAbsent = scan.nextInt();
            

            int basicPay = RPD * daysWork;
            int lateUnderEquiv = RPD / 8;
            int late = lateUnderEquiv * hoursLate;
            int undertime = lateUnderEquiv * hoursUndertime;
            int absent = RPD * daysAbsent;

            int deduction = sss+pagibig+philhealth+late+undertime+absent;
            int takehomePay = basicPay - deduction;
    
            clrscr();
            System.out.println("*".repeat(80));
            System.out.printf("%d: %s %n",employeeIDsearch, nameEmployee);
            System.out.printf("%20s %1s %n %n","Period as of: ",payrollDate);

            System.out.println("Income");
            System.out.printf("%-30s %1d %n %n","Basic Pay",basicPay);
            System.out.printf("%40s %n","-".repeat(10));
            System.out.printf("%-30s %1d %n %n","Total Income", basicPay);
            System.out.println();
    
            System.out.println("Deduction");
            System.out.printf("%-30s %1d %n","SSS Contribution",sss);
            System.out.printf("%-30s %1d %n","Pagibig Contribution",pagibig);
            System.out.printf("%-30s %1d %n","PhilHealth Contribution",philhealth);
            System.out.printf("%-30s %1d %n","Late",late);
            System.out.printf("%-30s %1d %n","Undertime",undertime);
            System.out.printf("%-30s %1d %n %n","Absent",absent);
            System.out.println();

            System.out.printf("%-30s %1d %n %n","Total Deduction",deduction);
            System.out.printf("%-30s %1d %n %n","Take Home Pay",takehomePay);


            System.out.println();
            System.out.print("Do another Payroll? (Y/N): ");
            payrollContinue = scan1.nextLine();
            if (payrollContinue.equals("Y")) {
                clrscr();
            } 
        } while (payrollContinue.equals("Y"));

        scan.close();
        scan1.close();
    }

    public static void clrscr(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {}
    }
}
