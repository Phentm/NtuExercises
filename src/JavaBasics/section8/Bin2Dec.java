package JavaBasics.section8;

import java.util.Scanner;

public class Bin2Dec {

    public static void main(String[] args) {
        
        //decleration stage
        String input;
        int decNum = 0, cIndex;
        boolean binFlag = true;
        Scanner in = new Scanner(System.in);
        
        //prompting user for input
        System.out.print("Enter a binary string: ");
        input = in.next();
        
        //program logic
        for (int i = 0; i < input.length(); i++) {
            cIndex = input.length() - 1 - i;
            if (!(input.charAt(cIndex) == '0' || input.charAt(cIndex) == '1')) {
                binFlag = false;
                break;
            }
            
            decNum += Character.getNumericValue(input.charAt(cIndex)) * Math.pow(2, i);
        }
        
        //output stage
        if (binFlag)
            System.out.println("The decimal equivilent of " + input + " is " + decNum);
        else
            System.out.println("The input string is not a binary string.");
        
    }

}
