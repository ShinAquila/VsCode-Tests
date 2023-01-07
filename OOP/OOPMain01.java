package OOP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OOPMain01 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        OOP01 UwU = new OOP01();

        int num1 = 5;
        int num2 = 4;

        System.out.println("Addition: "+UwU.add(num1, num2));
        System.out.println("Multiply: "+UwU.mult(num1, num2));

        System.out.println();
        System.out.println("(FirstName/LastName/Age)");
        System.out.println("Input your credentials: ");
        String credsIn = input.readLine();
        System.out.println();
        
        UwU.creds(credsIn);
    }
}
