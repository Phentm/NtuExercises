package JavaBasics.section08;

import java.util.Scanner;

public class CheckBinStr {

    public static void main(String[] args) {
        
        //decleration stage
        String input;
        boolean binFlag = true;
        Scanner in = new Scanner(System.in);
        
        //prompting use for input
        System.out.print("Enter a binary string: ");
        input = in.next();
        
        //program logic
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0' && input.charAt(i) != '1') {
                binFlag = false;
                break;
            }
        }
        
        //output stage
        if (!binFlag) {
            System.out.println("\"" + input + "\" is not a binary string");
        } else {
            System.out.println("\"" + input + "\" is a binary string");
        }
        
        
    }

}
