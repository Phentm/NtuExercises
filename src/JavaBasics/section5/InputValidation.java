package JavaBasics.section5;

import java.util.Scanner;

public class InputValidation {

    public static void main(String[] args) {
        
        //decleration stage
        int input = 0;
        boolean validInput = false;
        Scanner in = new Scanner(System.in);
        
        while (!validInput) {
            
            //prompting user for input
            System.out.print("Enter a number between 0-10 or 90-100: ");
            input = in.nextInt();
            
            //program logic
            if ((input >= 0 && input <= 10) || (input >= 90 && input <= 100))
                validInput = true;
            else
                System.out.println("Invalid input, try again...");
            
        }
        
        //printing stage
        System.out.println("You have entered: " + input);
        
    }

}
