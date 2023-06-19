package JavaBasics.section8;

import java.util.Scanner;

public class ExchangeCipher {

    public static void main(String[] args) {
        
        //decleration stage
        final int ALPH_SIZE = 26;
        char curr;
        String input, encrypted = "";
        Scanner in = new Scanner(System.in);
        
        //prompting user for input
        System.out.print("Please enter string to encrypt: ");
        input = in.nextLine();
        
        //program logic
        for (int i = 0; i < input.length(); i++) {
            
            curr = Character.toUpperCase( input.charAt(i) );
            
            if (curr == ' ') {
                encrypted += curr;
                continue;
            }
            
            curr = (char)('A' + 'Z' - curr);
            
            if ( Character.isLowerCase( input.charAt(i) ))
                curr = Character.toLowerCase(curr);
            
            encrypted += curr;
            
        }
        
        //output stage
        System.out.println("Encrypted string is: " + encrypted);
    }

}
