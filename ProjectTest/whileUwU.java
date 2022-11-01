import java.util.Scanner;

public class whileUwU {
    public static void main(String[] args) {
        int value;             
        int sum = 0;           
        int count = 0;   
        String suffix = "nd";

        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter first integer (enter 0 to quit):" );
        value = scan.nextInt();
    
        while ( value != 0 )    
        {
          sum = sum + value;
    
          count = count + 1;
    
            if ( count+1  == 2  ){
              suffix = "nd";
            }
            
            else if ( count+1 == 3  ){
              suffix = "rd";
            }
            else
              suffix = "th";
            

            System.out.println( "Enter the " + (count+1) + suffix + " integer (enter 0 to quit):" );

            value = scan.nextInt();
        }
    
        System.out.println( "Sum of the "  + count + " integers: " + sum );
        scan.close();
        System.exit(0);
    }
}
