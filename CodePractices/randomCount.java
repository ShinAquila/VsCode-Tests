package CodePractices;
import java.io.IOException;
// import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class randomCount {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        
        int numRange = 0;
        do {
            System.out.println("[!] Range must not go above 99 [!]\n"); //kapoy lol
            System.out.print("Pick a number from 1 to: ");
            numRange = scan.nextInt();
            if (numRange > 99) {
                clearScreen();
            }
        } while (numRange > 99);

        int num = 0;
        do {
            num = random.nextInt(numRange);
        } while (num == 0);

        int j = 1;
        System.out.println("\nPicking Number from 1 to "+numRange+"...");
        System.out.print("[");
        for (int i = 1; i <= 2; i++) {
            for (j = 1; j <= numRange; j++) {
                if (j >= 1 && j <= 9) {
                    System.out.print("0");
                }
                System.out.print(j);
                
                if (numRange>=1 && numRange <= 20) {
                    Thread.sleep(50);
                } else if (numRange>=21) {
                    Thread.sleep(20);
                }

                System.out.print("\b\b");
                if (i == 2 && j == numRange) {
                    if (num >= 1 && num <= 9) {
                        System.out.print("0");
                    }
                    System.out.print(num+"]");
                }
            }
        }
        System.out.println();
        scan.close();
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime();
            }
        } catch (IOException | InterruptedException ex) {
        }
    }
}
