package JavaBasics.section05;

import java.util.Scanner;

public class SumOfDigitsInt {

    public static void main(String[] args) {
        
        //decleration stage
        int number, digit, sum = 0, tmp;
        Scanner in = new Scanner(System.in);
        
        //promting user for input
        System.out.print("Enter a positive integer: ");
        number = in.nextInt();
        tmp = number;
        
        //program logic
        while (tmp > 0) {            
            digit = tmp % 10;
            
            sum += digit;
            
            tmp /= 10;
        }
        
        //printing stage
        System.out.println("The sum of all digits is: " + sum);
        
    }

}
