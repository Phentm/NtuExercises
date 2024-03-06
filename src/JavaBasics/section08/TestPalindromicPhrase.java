package JavaBasics.section08;

import java.util.Scanner;

public class TestPalindromicPhrase {

    public static void main(String[] args) {
        
        //decleration stage
        String input, leftStr="", rightStr="";
        Scanner in = new Scanner(System.in);
        
        //prompting user for input
        System.out.print("Input a plaintext string: ");
        input = in.nextLine();
        input = input.toLowerCase();
        
        //program logic
        for (int i = 0; i < input.length()/2; i++) {
            if ( Character.isAlphabetic(input.charAt(i) ) && Character.isAlphabetic( input.charAt(input.length() - 1 - i) )) {
                leftStr += input.charAt(i);
                rightStr += input.charAt( input.length() - 1 - i );
            }
        }
        
        //output stage
        if (leftStr.equals(rightStr)) {
            System.out.println("The string is palindromic");
        } else {
            System.out.println("The string is not palindromic");
        }
        
        
    }

}
