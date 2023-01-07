package BufferedReader;

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ATest04 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // FileReader file = new FileReader("BufferedReader/ATest4File.txt");
        // BufferedReader readFromFile = new BufferedReader(file);

        // try (BufferedReader br = new BufferedReader(new FileReader("BufferedReader/ATest4File.txt"))) {
        //     String line;
        //     while ((line = br.readLine()) != null) {
        //         System.out.println(line);
        //     }
        // }

        System.out.print("Pick a fruit: ");
        int pickNum = scan.nextInt();

        String fruit = Files.readAllLines(Paths.get("BufferedReader/ATest4.txt")).get(pickNum-1);
        String price = Files.readAllLines(Paths.get("BufferedReader/ATest4.txt")).get(pickNum+3);

        System.out.println("Picked fruit is: "+fruit);
        System.out.println("The Price is: "+price);

        // input.close();
        // readFromFile.close();
        scan.close();
    }
}
