package JavaBasics.section12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        
        String argWord = "", guessWord;
        int numTries = 1;
        
        if (args.length != 1) {
            System.err.println("Invalid usage: \"WordGuess [string]\"");
            return;
        }
        
        if (!args[0].matches("[a-zA-Z]+")) {
            try {
                
                Scanner reader = new Scanner(Paths.get(args[0]));
                Random rnd = new Random();
                
                int numLines = (int)Files.lines(Paths.get(args[0])).count();
                int chosenLine = rnd.nextInt(numLines + 1);
                
                for (int i = 0; i < chosenLine; i++) {
                    argWord = reader.nextLine();
                }
                
            } catch (IOException e) {
                System.err.println("Invalid argument");
                return;
            }
        } else {
            argWord = args[0];
        }
        
        boolean[] letterStatus = new boolean[argWord.length()];
        
        while (!trueArray(letterStatus)) {
            
            System.out.print("Key in one character or your guess word: ");
            
            guessWord = in.nextLine();
            
            if (!guessWord.matches("[a-zA-Z]+")) {
                System.err.println("Invalid guess: must be a letter or a single word.");
                continue;
            }
            
            if (guessWord.length() == 1) {
                
                char guessChar = Character.toLowerCase(guessWord.charAt(0));
                
                for (int i = 0; i < argWord.length(); i++)
                    if (argWord.toLowerCase().charAt(i) == guessChar) 
                        letterStatus[i] = true;
                
            } else {
                
                if (guessWord.toLowerCase().equals(argWord.toLowerCase()))
                    break;
                
            }
            
            System.out.print("Trial " + numTries + ": ");
            
            for (int i = 0; i < argWord.length(); i++) {
                if (letterStatus[i])
                    System.out.print(argWord.charAt(i));
                else
                    System.out.print("_");
            }
            
            System.out.println();
            
            numTries++;
        }
        
        System.out.println("Congratulation!");
        System.out.println("You got it in " + numTries + " tries.");
    }
    
    // Returns true if all values in a boolean array are true
    public static boolean trueArray(boolean[] arr) {
        for (boolean b: arr)
            if (!b) return false;
        return true;
        
    }

}
