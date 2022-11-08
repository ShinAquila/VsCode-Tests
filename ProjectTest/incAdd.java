import java.util.Scanner;

public class incAdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num");
        int num = scan.nextInt();
        int sum = 0;
        int list = 0;

        System.out.println("");
        scan.close();

        for(int i=1; i<=num; i++){
            list = i;
            System.out.println(i);
            sum = sum+list;
        }
  
        System.out.println("Total: "+sum);
        System.exit(0);
    }
}
