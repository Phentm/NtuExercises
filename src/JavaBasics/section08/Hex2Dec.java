package JavaBasics.section08;

import java.util.Scanner;

public class Hex2Dec {

    public static void main(String[] args) {
        
        //decleration stage
        String input;
        char curr;
        int decNum = 0;
        boolean hexFlag = true;
        Scanner in = new Scanner(System.in);
        
        //prompting user for input
        System.out.print("Enter a hexedecimal string: ");
        input = in.next().toUpperCase();
        
        //program logic
        for (int i = 0; i < input.length(); i++) {
            curr = input.charAt(input.length() - 1 - i);
            if (!( (curr >= '0' && curr <= '9')
                    || (curr >= 'A' && curr <= 'F') )) {
                hexFlag = false;
                break;
            }
            
            if (curr > '9') {   //converting hex character ('a' - 'f') to decimal
                curr -= 55;
                decNum += (int)curr * Math.pow(16, i);
            } else {
                decNum += Character.getNumericValue(curr) * Math.pow(16, i);
            }
            
        }
        
        
        //output stage
        if (hexFlag)
            System.out.println("The decimal equivilent of " + input + " is " + decNum);
        else
            System.out.println("The input string is not a hex string.");
        
    }

}
