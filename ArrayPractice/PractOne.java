package ArrayPractice;

import java.util.Arrays;

public class PractOne {
    public static void main(String[] args) {
        int num [] = {12,95,63,50,13,74,82,20,41,54};
        
        System.out.println(Arrays.toString(num));

        Arrays.sort(num);

        System.out.println(Arrays.toString(num));

        System.out.println();

        System.out.println("The second largest Num is: "+num[num.length-2]);

    }

}
