package OOP;

public class OOP01 {
    public int add(int num1, int num2){
        int result = num1+num2;
        return result;
    }

    public int mult(int num1, int num2){
        int result = num1*num2;
        return result;
    }

    public String creds(String credsIn){
        String str[] = credsIn.split("/");

        System.out.println("First Name: "+str[0]);
        System.out.println("Last Name: "+str[1]);
        System.out.println("Age: "+str[2]);

        return credsIn;
    }
}
