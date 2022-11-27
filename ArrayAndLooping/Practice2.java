package ArrayAndLooping;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int num[] = {5,42,88,34,46,98,25,62,88,12,34,5};

        int large = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > large) {
                large = num[i];
            }
        }

        int small = large;
        int secSmall = large;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < small) {
                small = num[i];
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] < secSmall && num[i] != small) {
                secSmall = num[i];
            }
        }
    
        System.out.println(Arrays.toString(num));
        System.out.println("Second Smallest Number: "+secSmall);
    }
}
