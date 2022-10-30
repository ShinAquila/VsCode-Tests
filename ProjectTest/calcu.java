
import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner operator = new Scanner(System.in);
        int num1, num2;
        
            System.out.println("Input First Number:");
            num1 = scan.nextInt();

            System.out.println("Input Second Number:");
            num2 = scan.nextInt();

            System.out.println("Input Operator:");
            String ope = operator.nextLine();


                if(ope.equals("+")){
                    System.out.println("Result is "+(num1 + num2));
                }

                else if(ope.equals("-")){
                    System.out.println("Result is "+(num1 - num2));
                }

                else if(ope.equals("*")){
                    System.out.println("Result is "+(num1 * num2));
                }

                else if(ope.equals("/")){
                    System.out.println("Result is "+(num1 / num2));
                }

                else{
                    System.out.println("Error");
                }

                System.out.println("---------------------------");
                scan.close();
                operator.close();

            
        }
        

    }


