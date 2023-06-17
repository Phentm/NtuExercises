package JavaBasics.section5;

import java.util.Scanner;

public class Swap2Integers {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int first, second, temp;
        
        System.out.print("Enter first integer: ");
        first = s.nextInt();
        System.out.print("Enter second integer: ");
        second = s.nextInt();
        
        temp = first;
        first = second;
        second = temp;
        
        System.out.println("After swap the first integer is " + first + ", and the second integer is: " + second);
        
    }

}
