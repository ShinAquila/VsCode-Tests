package ArrayPractice;
import java.util.Arrays;

public class PractTwo {
    public static void main(String[] args) {
        int num [] = {12,95,63,50,13,74,82,20,41,54,89};

        System.out.println(Arrays.toString(num));

        Arrays.sort(num);

        System.out.println(Arrays.toString(num));

        System.out.println("The second smallest Num is: "+num[1]);
    }
}