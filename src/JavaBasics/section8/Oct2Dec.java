package JavaBasics.section8;

import java.util.Scanner;

public class Oct2Dec {

    public static void main(String[] args) {
        
        //decleration stage
        String input;
        char curr;
        int decNum = 0;
        boolean octFlag = true;
        Scanner in = new Scanner(System.in);

        //prompting user for input
        System.out.print("Enter an octal string: ");
        input = in.next().toUpperCase();

        //program logic
        for (int i = 0; i < input.length(); i++) {
            curr = input.charAt(input.length() - 1 - i);
            if (!(curr >= '0' && curr <= '8')) {
                octFlag = false;
                break;
            }

            decNum += Character.getNumericValue(curr) * Math.pow(8, i);
            

        }

        //output stage
        if (octFlag) {
            System.out.println("The decimal equivilent of " + input + " is " + decNum);
        } else {
            System.out.println("The input string is not an octal string.");
        }

        
    }

}
