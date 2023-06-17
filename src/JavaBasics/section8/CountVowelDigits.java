package JavaBasics.section8;

import java.util.Scanner;

public class CountVowelDigits {

    public static void main(String[] args) {
        
        //decleration stage
        String input;
        char c;
        int numCount = 0, vowCount = 0;
        Scanner in = new Scanner(System.in);
        
        //prompting user for input
        System.out.print("Enter a string: ");
        input = in.nextLine();
        input = input.toLowerCase();
        
        //program logic
        for (int i = 0; i < input.length(); i++) {
            
            c = input.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowCount++;
            else if (c >= '0' && c <= '9')
                numCount++;
            
        }
        
        //output stage
        System.out.printf("Number of vowels: %d (%.2f)\n", vowCount, (float)vowCount/input.length() * 100);
        System.out.printf("Number of digits: %d (%.2f)\n", numCount, (float)numCount/input.length() * 100);
        
    }

}
