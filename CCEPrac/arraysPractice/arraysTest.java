package CCE.arraysPractice;
import java.util.ArrayList;

public class arraysTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(23);
        list.add(67);
        list.add(36);
        list.add(19);
        list.add(48);

        for (int numbers : list) {
            System.out.println(numbers);
        }
    }
}
