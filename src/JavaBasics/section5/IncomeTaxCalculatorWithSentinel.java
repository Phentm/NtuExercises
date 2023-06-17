package JavaBasics.section5;

import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int income;
        double next2, next3, rem, tax;
        
        System.out.print("Enter the taxable income (or -1 to end): $");
        income = s.nextInt();
        
        while (income != -1) {
            next2 = 0;
            next3 = 0;
            rem = 0;
            tax = 0;
            
            if (income <= 40_000 && income > 20_000) {
                next2 = (income - 20_000) * 0.1;
            } else if (income <= 60_000 && income > 40_000) {
                next2 = 2000;
                next3 = (income - 40_000) * 0.2;
            } else if (income > 60_000) {
                next2 = 2000;
                next3 = 4000;
                rem = (income - 60_000) * 0.3;
            }
        
            tax = next2 + next3 + rem;
            
            System.out.printf("Total tax is: %.2f%n" ,tax);
            
            System.out.print("Enter the taxable income: $");
            income = s.nextInt();
        }
        
        System.out.println("Bye!");
        
    }

}
