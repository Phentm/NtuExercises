package JavaBasics.section10;

import java.util.Scanner;

public class OddEvenTest {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int input;
        
        // TESTING METHOD
        
        System.out.print("Enter a number: ");
        input = in.nextInt();
        
        if (MethodLib.isOdd(input))
            System.out.println(input + " is an odd number.");
        else
            System.out.println(input + " is an even number.");
        
    }

}
