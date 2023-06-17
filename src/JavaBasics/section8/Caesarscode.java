package JavaBasics.section8;

import java.util.Scanner;

public class Caesarscode {

    public static void main(String[] args) {
        
        //decleration stage
        String input, encrypted = "";
        char current;
        final int offset = 3;
        Scanner in = new Scanner(System.in);
        
        //prompt user for input
        System.out.print("Enter plaintext string: ");
        input = in.nextLine();
        
        //program logic
        for (int i = 0; i < input.length(); i++) {
            
            current = input.charAt(i);
            
            if (current != ' ') {
                current += offset;
                
                if ((current > 'Z' && current < 'a') || (current > 'z')) {
                    current -= 26;
                }
            }
            
            encrypted += current;
            
        }
        
        //output stage
        System.out.println("Encrypted string is: " + encrypted);
        
    }

}
