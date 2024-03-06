package JavaBasics.section08;

import java.util.Scanner;

public class TestPalindromicWord {

    public static void main(String[] args) {
        
        //decleration stage
        String input;
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        
        //prompting user for input
        System.out.print("Input a plaintext sting: ");
        input = in.next();
        
        //program logic
        for (int i = 0; i < input.length()/2; i++) {
            if ((input.charAt(i) != input.charAt(input.length()-1-i)) || Character.isDigit(input.charAt(i))) {
                System.out.println("The word is not a palindrome");
                flag = false;
                break;
            }
        }
        
        //output stage
        if (flag)
            System.out.println("The word is a palindrome");
        
    }

}
