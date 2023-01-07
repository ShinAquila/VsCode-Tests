package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputFromTXT {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listOfStrings = new ArrayList<String>();

        String fruits[][] = {
            {"Apple","20"},
            {"Mango","15"},
            {"Peach","17"}
        };
        
        BufferedReader bf = new BufferedReader(new FileReader("BufferedReader/InputFromTXT.txt"));
       
        String line = bf.readLine();    
       
        while (line != null) {
            listOfStrings.add(line);
            line = bf.readLine();
        }
       
        bf.close();

        String tempStr;
        for (int i = 0; i < listOfStrings.size(); i++) {
            tempStr = listOfStrings.get(i);
            for (int j = 0; j < 3; j++) {
                if (tempStr.equals(fruits[j][0])) {
                    System.out.println("["+(i+1)+"]"+" The price of "+ listOfStrings.get(i) +" is: "+fruits[j][1]);
                }
            }
        }

    }
}
