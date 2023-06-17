package JavaBasics.section8;

import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String[] args) {
        
        //decleration stage
        String input, numberStr = "";
        char c;
        Scanner in = new Scanner(System.in);
        
        //prompting user for input
        System.out.print("Enter a string: ");
        input = in.nextLine();
        input = input.toLowerCase();
        
        //program logic
        for (int i = 0; i < input.length(); i++) {
            
            c = input.charAt(i);
            
            switch (c) {
                case 'a': case 'b': case 'c':
                    numberStr += '2';
                    break;
                case 'd': case 'e': case 'f':
                    numberStr += '3';
                    break;
                case 'g': case 'h': case 'i':
                    numberStr += '4';
                    break;
                case 'j': case 'k': case 'l':
                    numberStr += '5';
                    break;
                case 'm': case 'n': case 'o':
                    numberStr += '6';
                    break;
                case 'p': case 'q': case 'r': case 's':
                    numberStr += '7';
                    break;
                case 't': case 'u': case 'v':
                    numberStr += '8';
                    break;
                case 'w': case 'x': case 'y': case 'z':
                    numberStr += '9';
                    break;
                
                default:
                    numberStr += ' ';
            }
            
        }
        
        //output stage
        System.out.println("Keypad string: " + numberStr);
        
    }

}
