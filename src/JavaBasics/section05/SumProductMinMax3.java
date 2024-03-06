package JavaBasics.section05;

import java.util.Scanner;

public class SumProductMinMax3 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int input1, input2, input3;             //User inputs
        int sum, product, min, max;             //Calculated variables
        
        System.out.print("Enter first integer: ");
        input1 = s.nextInt();
        System.out.print("Enter second integer: ");
        input2 = s.nextInt();
        System.out.print("Enter third integer: ");
        input3 = s.nextInt();
        
        s.close();
        
        sum = input1 + input2 + input3;
        product = input1 * input2 * input3;
        min = Math.min(input3, Math.min(input1, input2));
        max = Math.max(input3, Math.max(input1, input2));
        
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
        
    }

}
