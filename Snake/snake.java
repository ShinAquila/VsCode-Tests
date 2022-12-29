package Snake;
import java.io.IOException;
import java.util.Scanner;

public class snake {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        boolean yes = true;
        int spaceNum = 0;
        while (yes) {
            clearScreen();
            // String move = scan.nextLine();
            System.out.print(" ".repeat(spaceNum)); 
            System.out.print("=====>>");
            spaceNum++;
            Thread.sleep(1000);
        }
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
