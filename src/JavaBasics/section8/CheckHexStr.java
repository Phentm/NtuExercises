package JavaBasics.section8;

import java.util.Scanner;

public class CheckHexStr {

    public static void main(String[] args) {
        
        //decleration stage
        String input;
        boolean hexFlag = true;
        char cur;
        Scanner in = new Scanner(System.in);

        //prompting use for input
        System.out.print("Enter a hex string: ");
        input = in.next();

        //program logic
        for (int i = 0; i < input.length(); i++) {
            cur = input.charAt(i);
            if (!((cur >= '0' && cur <= '9') ||
                (cur >= 'a' && cur <= 'f') ||
                (cur >= 'A' && cur <= 'F')) ) {
                hexFlag = false;
                break;
            }
        }

        //output stage
        if (!hexFlag) {
            System.out.println("\"" + input + "\" is not a hexadecimal string");
        } else {
            System.out.println("\"" + input + "\" is a hexadecimal string");
        }
        
    }

}
