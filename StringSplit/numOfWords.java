package StringSplit;
import java.util.StringTokenizer;

public class numOfWords {
    public static void main(String[] args) {
        String words = "You@are@here@in@this@place";
        String wordArr[] = words.split("@");

        StringTokenizer wrd = new StringTokenizer(words);
        System.out.println("There are "+wrd.countTokens()+" words");

        System.out.println();
        // System.out.println("There are "+wordArr.length+" words");

        for (int i = 0; i < wordArr.length; i++) {
            System.out.println(wordArr[i]);
        }
    }
}
