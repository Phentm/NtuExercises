package JavaBasics.section5;

import java.util.Scanner;

public class AverageWithInputValidation {

    public static void main(String[] args) {

        //decleration stage
        int mark1 = 0, mark2 = 0, mark3 = 0, total = 0;
        double avg;
        boolean valid = false;
        Scanner in = new Scanner(System.in);

        //prompting user for input
        while (!valid) {
            System.out.print("Enter the mark (0-100) for student 1: ");
            mark1 = in.nextInt();

            if (mark1 >= 0 && mark1 <= 100) {
                valid = true;
            } else {
                System.out.println("Invalid input, please try again...");
            }

        }
        valid = false;

        while (!valid) {
            System.out.print("Enter the mark (0-100) for student 2: ");
            mark2 = in.nextInt();

            if (mark2 >= 0 && mark2 <= 100) {
                valid = true;
            } else {
                System.out.println("Invalid input, please try again...");
            }

        }
        valid = false;

        while (!valid) {
            System.out.print("Enter the mark (0-100) for student 3: ");
            mark3 = in.nextInt();

            if (mark3 >= 0 && mark3 <= 100) {
                valid = true;
            } else {
                System.out.println("Invalid input, please try again...");
            }

        }
        

        //program logic
        total = mark1 + mark2 + mark3;
        avg = total / 3.0;
        
        //printing stage
        System.out.printf("Average score is: %.2f\n",avg);
        
    }

}
