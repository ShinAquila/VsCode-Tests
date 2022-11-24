package ArrayPract;

public class Practice1 {
    public static void main(String[] args) {
        int num[] = {88,86,98,62,88};

        int large = 0;
        int secLarge = 0;
        
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i]>num[j] && num[i] > large) {
                    large = num[i];
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] > secLarge) {
                if (num[i] != large) {
                    secLarge = num[i];
                }
            }
        }
    
        System.out.println("Second Largest Number: "+secLarge);
    }
}
