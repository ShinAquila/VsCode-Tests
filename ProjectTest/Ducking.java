import java.util.Scanner;

public class Ducking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = {"Angelo Ymas", "Arjay Escabas", "Laurence Sarominez", "Shereca Ave Verano", "Ericka Migue"};
        String course = "BSIT";
        String year = "1st year";
        String section = "Paterno";
        boolean qualification = false;


        System.out.print("Name: ");
        String nameInput = scan.nextLine();

        System.out.print("Course: ");
        String courseInput = scan.nextLine();

        System.out.print("Year: ");
        String yearInput = scan.nextLine();

        System.out.print("Section: ");
        String sectionInput = scan.nextLine();

        scan.close();

        for (int i = 0; i < names.length; i++){
            if (nameInput.equals(names[i])&& courseInput.equals(course) && yearInput.equals(year) && sectionInput.equals(section)){
                System.out.println("Hello "+ names[i] +" here are your class schedule's");
                System.out.println("");
                qualification = true;
                break;                  
            }   
            
        }
        if (qualification == true){
            System.out.println("First subject: GE 1");
            System.out.println("First subject: GE 2");
            System.out.println("First subject: GE 3");
            System.out.println("First subject: GE 4");
            System.out.println("First subject: GE 5");
           } else {
            System.out.println("ERROR");
           }
        
   }

}

