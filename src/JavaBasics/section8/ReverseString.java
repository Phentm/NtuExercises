package JavaBasics.section8;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        
        //decleration stage
        String input, reverse = "";
        Scanner in = new Scanner(System.in);
        
        //prompting user for input
        System.out.print("Enter a string: ");
        input = in.nextLine();
        
        //program logic
        for (int i = 0; i < input.length(); i++) {
            reverse = reverse + input.charAt(input.length() - i - 1);
        }
        
        //output stage
        System.out.println("The reverse of " + input + " is " + reverse);
    }

}
