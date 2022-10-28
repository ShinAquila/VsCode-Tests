package javaTests;
import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner operator = new Scanner(System.in);
        float num1, num2;
        
        while(true){
            String nomore = scan.nextLine();
            if(nomore.equals("C")){
                System.out.println("Input First Number:");
                num1 = scan.nextFloat();
    
                System.out.println("Input Second Number:");
                num2 = scan.nextFloat();
    
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

            } 
            else if(nomore.equals("STOP")){
                break;
            }
            
        }
        

    }
}

