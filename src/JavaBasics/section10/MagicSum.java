package JavaBasics.section10;

import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {
        
        // DECLERATION STAGE
        
        int sum = 0, input = 0;
        
        Scanner in = new Scanner(System.in);
        
        
        // PROGRAM LOGIC
        
        do {
            
            try {
                System.out.print("Enter a positive integer (or -1 to exit): ");
                input = in.nextInt();
                
                if (MethodLib.hasEight(input))
                    sum += input;
                
            } catch (Exception e) {
                System.out.println("Error: " + e);
                in.next();
            }
            
        } while (input != -1);
        
        
        // OUTPUT STAGE
        
        System.out.println("The magic sum is " + sum);
        
    }

}
