import java.security.SecureRandom;
import java.util.Random;

public class passwordGen {
    public static void main(String[] args) {
        int length = 6;
    
        // final char[] lowercase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // final char[] uppercase = "ABCDEFGJKLMNPRSTUVWXYZ".toCharArray();
        // final char[] numbers = "0123456789".toCharArray();
        // final char[] symbols = "^$?!@#%&".toCharArray();
        final char[] allAllowed = "abcdefghijklmnopqrstuvwxyzABCDEFGJKLMNPRSTUVWXYZ0123456789^$?!@#%&".toCharArray();
    
        Random random = new SecureRandom();
    
        StringBuilder password = new StringBuilder(); 
    
        for (int i = 0; i < length; i++) {
            password.append(allAllowed[random.nextInt(allAllowed.length)]);
        }
    
        // password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
        // password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
        // password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
        // password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);
        
    
        System.out.println("Generated Random Password: "+password);
    }
}
