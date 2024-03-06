package JavaBasics.section05;

import java.util.Scanner;

public class SalesTaxCalculator {

    public static void main(String[] args) {

        //decleration stage
        double taxIn, actual, tax;
        double totPrice = 0, totActual = 0, totTax = 0;
        Scanner in = new Scanner(System.in);

        //prompting user for input
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): $");
        taxIn = in.nextDouble();

        while (taxIn != -1) {

            //program logic
            tax = taxIn - (taxIn / 1.07);
            actual = taxIn - tax;

            totPrice += taxIn;
            totActual += actual;
            totTax += tax;
            
            //printing stage
            System.out.printf("Actual Price is: $%.2f", actual);
            System.out.printf(", Sales Tax is: $%.2f\n\n", tax);

            //prompting user for input
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): $");
            taxIn = in.nextDouble();

        }
        
        //printing stage
        System.out.printf("Total Price is: $%.2f\n", totPrice);
        System.out.printf("Total Actual Price is: $%.2f\n", totActual);
        System.out.printf("Total Sales Tax is: $%.2f\n", totTax);

    }

}
