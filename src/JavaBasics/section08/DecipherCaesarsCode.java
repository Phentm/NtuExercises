package JavaBasics.section08;

import java.util.Scanner;

public class DecipherCaesarsCode {

    public static void main(String[] args) {
        
        //decleration stage
        String input, decrypted = "";
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
                current -= offset;

                if ((current > 'Z' && current < 'a') || (current < 'A')) {
                    current += 26;
                }
            }

            decrypted += current;

        }

        //output stage
        System.out.println("Decrypted string is: " + decrypted);
        
    }

}
