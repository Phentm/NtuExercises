package JavaBasics.section5;

import java.util.Scanner;

public class ReverseInt {

    public static void main(String[] args) {
        
        //decleration stage
        int number, digit, reverse = 0, tmp;
        Scanner in = new Scanner(System.in);
        
        //promting user for input
        System.out.print("Enter a positive integer: ");
        number = in.nextInt();
        tmp = number;
        
        //program logic
        while (tmp > 0) {            
            digit = tmp % 10;
            
            reverse *= 10;
            reverse += digit;
            
            tmp /= 10;
        }
        
        //printing stage
        System.out.println("The reverse is: " + reverse);
        
    }

}
