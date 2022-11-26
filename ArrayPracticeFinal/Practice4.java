package ArrayPracticeFinal;

public class Practice4 {
    public static void main(String[] args) {
        String star = "*";

        //Rectangle Star Pattern
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
        System.out.println();
        
        //Left Triangle Star Pattern
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            if (i != 0) {
                System.out.println();
            }
        }
        System.out.println();

        //Right Triangle Star Pattern
        System.out.print(star);
        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i; j++) {
                if (i != 1) {
                    System.out.print(star);
                }
            }

            if (i != 0) {
                System.out.println();
            }
        }
    }
}
