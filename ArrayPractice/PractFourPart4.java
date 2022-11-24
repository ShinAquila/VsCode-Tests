package ArrayPractice;

public class PractFourPart4 {
    public static void main(String[] args) {

        String star = "*";
        System.out.print(star);
        
        for (int i = 0; i < 5; i++) {
            int j = 0;

            for (int k = i; k < 5; k++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                if (j==1) {
                    System.out.print(star.replace(star, ""));
                }
                if (j != 0) {
                    System.out.print(star);
                }
            }
            
            

            System.out.println();
        }
    }
}
