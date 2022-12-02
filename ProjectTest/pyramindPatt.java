public class pyramindPatt {
    public static void main(String[] args) {
        int rows = 5;

        // for (int i=0; i<n; i++) {
        //     for (int j=n-i; j>1; j--) {
        //         System.out.print(" ");
        //     }

        //     for (int j=0; j<=i; j++ ) {
        //         System.out.print("* ");
        //     }
  
        //     System.out.println();
        // }

        for (int i = 0; i <= rows; i++) {

            for (int j = 0; j < rows-i; j++) {
                if (i != 0) {
                    System.out.print(" ");
                }
            }
            
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
