package JavaBasics.section09;

import java.util.Scanner;

public class PrintArrayInStars {

    public static void main(String[] args) {

        // DECLERATION STAGE
        
        final int NUM_ITEMS;
        int[] items;

        int itemCounter = 0;
        String inputStr, tempStr;
        char currChar;

        boolean validInput = true;

        Scanner in = new Scanner(System.in);
        
        
        // INPUT PROMPT
        
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();

        in.nextLine();

        System.out.print("Enter the value of all items (seperated by space): ");
        inputStr = in.nextLine();

        in.close();
        
        
        // PROGRAM LOGIC
        
        // Validating the input for NUM_ITEMS
        if (NUM_ITEMS > 0) {
            items = new int[NUM_ITEMS];
        } else {
            validInput = false;
            items = new int[0];
        }

        // Validating the items input string
        if (inputStr.length() == 0) {
            validInput = false;
        } else if (inputStr.charAt(0) == ' '
                    || inputStr.charAt(inputStr.length() - 1) == ' ') {

            validInput = false;
        }

        for (int i = 0; i < inputStr.length() && validInput; i++) {

            currChar = inputStr.charAt(i);

            if (!Character.isDigit(currChar)                                    // Invalidating if the string contains any
                && currChar != ' ')                                             // character other than a number or a space
                
                validInput = false;            

            if (i > 0                                                           // Invalidating if the string contains two
                && (currChar == ' '                                             // spaces in a row
                && inputStr.charAt(i - 1) == ' ') )
                
                validInput = false;

            if (currChar == ' ')                                                // Counting the number of items a string contains
                itemCounter++;                                                  // (assuming the format of the string is valid)
            
        }

        if (itemCounter != NUM_ITEMS - 1)                                       // Invalidating input based on the number of items
            validInput = false;
        

        // Looping through item value string and adding items into array
        itemCounter = 0;
        tempStr = "";

        for (int j = 0; j < inputStr.length() && validInput; j++) {

            currChar = inputStr.charAt(j);

            if (Character.isDigit(currChar)
                || currChar == '-') {

                tempStr += currChar;
            } else {
                items[itemCounter] = Integer.parseInt(tempStr);

                tempStr = "";

                itemCounter++;

            }

        }

        if (tempStr.length() > 0)                                               // Adding the last element stored in tempStr
            items[itemCounter] = Integer.parseInt(tempStr);
        

        // OUTPUT STAGE
        
        System.out.println("\n-------------------------------------------\n");

        if (!validInput) {
            System.out.println("-------------- INVALID INPUT --------------");
        } else {

            for (int i = 0; i < items.length; i++) {

                System.out.print(i + ": ");

                for (int j = 0; j < items[i]; j++) {
                    System.out.print("*");
                }

                System.out.println("(" + items[i] + ")");

            }

        }

    }

}
