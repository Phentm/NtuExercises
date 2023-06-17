package JavaBasics.section5;

import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int income;
        double next2 = 0, next3 = 0, rem = 0, tax = 0;
        
        System.out.print("Enter the taxable income: $");
        income = s.nextInt();
        
        s.close();
        
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
        
        //-----Calculate rebate-----//
        double rebate = tax * 0.1;
        if (rebate > 10_000) {
            rebate = 10_000;
        }
        
        tax -= rebate;
        
        System.out.printf("Total tax is: %.2f%n" ,tax);
        
    }

}
