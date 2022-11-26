package ArrayPract;

public class Practice1 {
    public static void main(String[] args) {
        int num[] = {42,88,34,46,98,25,62,88,12,34,100};

        int large = 0;
        int secLarge = 0;
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] > large) {
                large = num[i];
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] > secLarge && num[i] != large) {
                secLarge = num[i];
            }
        }
    
        System.out.println("Second Largest Number: "+secLarge);
    }
}
