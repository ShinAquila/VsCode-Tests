package CCE.arraysPractice;

import java.util.Arrays;

public class arrayAverage {
    public static void main(String[] args) {
        int num[] = {12,23,34,45,56,67,78,90};

        double sum = 0; 
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        double ave = sum/num.length;

        System.out.println(Arrays.toString(num));
        System.out.println("The average is: "+ave);
    }
}
