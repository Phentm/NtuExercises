package JavaBasics.section5;

import java.util.Scanner;

public class Add2Integer {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int input1, input2;             //User inputs
        int sum;                        //Sum variable
        
        System.out.print("Enter first integer: ");
        input1 = s.nextInt();
        System.out.print("Enter second integer: ");
        input2 = s.nextInt();
        
        s.close();
        
        sum = input1 + input2;
        System.out.println("The sum is: " + sum);
        
    }

}
