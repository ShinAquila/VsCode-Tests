package ArrayAndLooping;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int num[] = {85,67,79,97,64};

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
    
        System.out.println(Arrays.toString(num));
        System.out.println("Second Largest Number: "+secLarge);
    }
}
