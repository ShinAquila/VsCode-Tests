package ArrayAndLooping;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        int num [] = {89,95,63,50,33,74,82,20,41,54,12};

        int large = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > large) {
                large = num[i];
            }
        }

        int small = large;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < small) {
                small = num[i];
            }
        }

        System.out.println(Arrays.toString(num));
        System.out.println("The minimum value in the array is:      "+small);
        System.out.println("The maximum value in the array is:      "+large);
    }
}
