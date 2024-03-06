package JavaBasics.section09;

import java.util.Scanner;

public class Hex2Bin {

    public static void main(String[] args) {
        
        // DECLERATION STAGE
        
        final String[] LOOKUP_TABLE = {"0000", "0001", "0010", "0011", "0100",
                                        "0101", "0110", "0111", "1000", "1001",
                                        "1010", "1011", "1100", "1101", "1110",
                                        "1111"};
        
        String input;
        String output = "";
        
        Scanner in = new Scanner(System.in);
        
        
        // INPUT STAGE
        
        System.out.print("Please input a hex string: ");
        input = in.nextLine().toLowerCase();
        
        while (input.contains(" ")) {
            System.out.println("Input cannot contain spaces.");
            System.out.print("Please input a hex string: ");
            input = in.nextLine().toLowerCase();
        }
        
        while (!input.matches("[0-9a-f]+")) {
            System.out.println("Input must be hexadecimal.");
            System.out.print("Please input a hex string: ");
            input = in.nextLine();
        }
        
        
        // PROGRAM LOGIC
        
        for (int i = 0; i < input.length(); i++) {
            
            if (input.charAt(i) >= 'a') {
                output += LOOKUP_TABLE[(int)input.toLowerCase().charAt(i) - 87] + " ";
            } else
                output += LOOKUP_TABLE[input.toLowerCase().charAt(i)] + " ";
            
        }
        
        
        // OUTPUT STAGE
        
        System.out.println("The equivalent binary for hexadecimal " +
                            input + " is: " + output);
        
    }

}
