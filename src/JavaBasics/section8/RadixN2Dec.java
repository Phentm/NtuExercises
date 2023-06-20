package JavaBasics.section8;

import java.util.Scanner;

public class RadixN2Dec {

    public static void main(String[] args) {
        
        // DECLERATION STAGE
        boolean validStr = true;
        int radix, decNum = 0;
        char curr;
        String input;
        Scanner in = new Scanner(System.in);
        
        // INPUT PROMPT
        System.out.print("Enter the radix: ");
        radix = in.nextInt();
        
        // checking radix validity (0 - 16)
        while (radix < 0 || radix > 16) {
            System.out.println("Invalid radix input");
            System.out.print("Enter the radix: ");
            radix = in.nextInt();
        }
        
        System.out.print("Enter the string: ");
        input = in.next().toUpperCase();
        
        // PROGRAM LOGIC
        
        // checking input string validity to the chosen radix
        for (int i = 0; i < input.length(); i++) {
            curr = input.charAt(i);
            
            if (curr < '0') {
                validStr = false;
                break;
            }
            
            if ( (int)curr > radix + 48                             // (char)48 == '0', validity check does not
                    && radix <= 10) {                               // include A-F characters since case assumes
                validStr = false;                                      // Radix is less than or equals to 10
                break;
            }
            
            if ( !( curr <= '9'                                     // (char)54 + (11 through 16) == 'A'..'F',
                    || (curr >= 'A' && (int)curr <= 54 + radix) )   // validity check includes A-F characters
                    && radix > 10 ) {                               // (only in the case where the Radix is greater than 10)    
                validStr = false;
                break;
                
            }
            
        }
        
        // converting the input string into the chosen radix base
        if (validStr) {
            for (int i = 0; i < input.length(); i++) {
                curr = input.charAt(input.length() - 1 - i);
                
                if (curr > '9') {                                   // converting characters ('A'..'F') to decimal
                    curr -= 55;
                    decNum += (int) curr * Math.pow(radix, i);
                } else {
                    decNum += Character.getNumericValue(curr) * Math.pow(radix, i);
                }
                
            }
        }
        
        
        // OUTPUT STAGE
        if (validStr) {
            System.out.println("The decimal equivilent of " + input + " is " + decNum);
        } else {
            System.out.println("The input string is not valid string.");
        }
        
    }

}
