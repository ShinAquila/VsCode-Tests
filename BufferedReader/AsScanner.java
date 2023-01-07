package BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsScanner {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();
        
        System.out.print("Are you okay? ");
        String inputString = input.readLine();

        System.out.println("You said "+inputString);
    }
}
