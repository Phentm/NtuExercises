package JavaBasics.section09;

import java.util.Scanner;

public class Dec2Hex {

    public static void main(String[] args) {
        
        // DECLERATION STAGE
        
        final char[] LOOKUP_TABLE = {'A', 'B', 'C', 'D', 'E', 'F'};
        
        int input;
        String output = "";
        
        Scanner in = new Scanner(System.in);
        
        
        // INPUT STAGE
        
        while (true) {
            try {
                System.out.print("Input a positive integer: ");
                input = in.nextInt();
                
                if (input < 0)
                    throw new Exception("Input must be positive");
                 else
                    break;
                
            } catch (Exception e) {
                System.out.println("Error, invalid input (" + e + ")");
                in.nextLine();
            }
        }
        
        
        // PROGRAM LOGIC
        
        int mod, div = input;
        
        while (div != 0) {
            mod = div % 16;
            div /= 16;
            
            if (mod >= 10) {
                output = LOOKUP_TABLE[mod-10] + output;
            } else {
                output = Integer.toString(mod) + output;
            }
        }
        
        
        // OUTPUT STAGE
        
        System.out.println("The equivalent hexadecimal number is " + output);
        
    }

}
