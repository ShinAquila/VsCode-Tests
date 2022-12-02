package CCE.arraysPractice;

import java.util.Arrays;

public class arrayRemoveDupes {
    public static void main(String[] args) {
        int num[] = {12,23,34,45,12,56,67,78,89,90};
        int no_unique_elements = num.length;

        System.out.println("Original Array : ");
         
        for (int i = 0; i < num.length; i++)
        {
            System.out.print(num[i]+"\t");
        }
         
        for (int i = 0; i < no_unique_elements; i++) {
            for (int j = i+1; j < no_unique_elements; j++) {
                if(num[i] == num[j]) {
                    num[j] = num[no_unique_elements-1];
                     
                    no_unique_elements--;
                     
                    j--;
                }
            }
        }
         
        int[] array1 = Arrays.copyOf(num, no_unique_elements);
        System.out.println();
         
        System.out.println("Array with unique values : ");
         
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+"\t");
        }
         
        System.out.println();
         
        System.out.println("---------------------------");
    }
}
