package JavaBasics.section12;

import java.io.File;
import java.nio.file.Files;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    public static void main(String[] args) throws Exception{
        
        if (args.length != 1) {
            System.err.println("Invalid usage: \"WordGuess [string]\"");
            return;
        }
        
//        if (!args[0].matches("[a-zA-Z]+")) {
//            System.err.println("Invalid argument");
//            return;
//        }
        
        File dict = new File(args[0]);
        Random rnd = new Random();
        
        
        Scanner reader = new Scanner(dict);
        Scanner in = new Scanner(System.in);
        int numLines = (int)Files.lines(dict.toPath()).count();
        
        String argWord = "";
        for (int i = 0; i < rnd.nextInt(numLines); i++) {
            argWord = reader.nextLine();
        }
        
        
        int numTries = 1;
        //String argWord = args[0].toLowerCase();
        String guessWord;
        boolean[] letterStatus;
        
        
        
        letterStatus = new boolean[argWord.length()];
        
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
                    if (argWord.charAt(i) == guessChar) 
                        letterStatus[i] = true;
                
            } else {
                
                if (guessWord.toLowerCase().equals(argWord))
                    break;
                
            }
            
            System.out.print("Trial " + numTries + ": ");
            
            for (int i = 0; i < argWord.length(); i++) {
                if (letterStatus[i])
                    //System.out.print(args[0].charAt(i));
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
