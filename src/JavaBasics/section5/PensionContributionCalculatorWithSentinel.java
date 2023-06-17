package JavaBasics.section5;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int salary, age;
        double contribution;
        
        System.out.print("Please enter salary: ");                  //initial inputs
        salary = s.nextInt();
        
        contribution = salary;
        
        while (salary != -1) {
            System.out.print("Please enter employee age: ");
            age = s.nextInt();
            
            if (contribution > 6000) {
                contribution = 6000;                                //capping out the contributable amount to 6000
            }

            if (age <= 55) {
                System.out.printf("The employee's contribution is: %.2f%n", contribution * 0.2);
                System.out.printf("The employer's contribution is: %.2f%n", contribution * 0.17);
                System.out.printf("Total contribution is: %.2f%n", (contribution * 0.2) + (contribution * 0.17));
                System.out.println("");
            } else if (age > 55 && age <= 60) {
                System.out.printf("The employee's contribution is: %.2f%n", contribution * 0.13);
                System.out.printf("The employer's contribution is: %.2f%n", contribution * 0.13);
                System.out.printf("Total contribution is: %.2f%n", (contribution * 0.13) + (contribution * 0.13));
                System.out.println("");
            } else if (age > 60 && age <= 65) {
                System.out.printf("The employee's contribution is: %.2f%n", contribution * 0.075);
                System.out.printf("The employer's contribution is: %.2f%n", contribution * 0.09);
                System.out.printf("Total contribution is: %.2f%n", (contribution * 0.075) + (contribution * 0.09));
                System.out.println("");
            } else {
                System.out.printf("The employee's contribution is: %.2f%n", contribution * 0.05);
                System.out.printf("The employer's contribution is: %.2f%n", contribution * 0.075);
                System.out.printf("Total contribution is: %.2f%n", (contribution * 0.05) + (contribution * 0.075));
                System.out.println("");
            }
            
            System.out.print("Please enter salary: ");
            salary = s.nextInt();
            
        }
        
        System.out.println("Bye!");
        
    }

}
