package JavaBasics.section12;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        
        int goal = rnd.nextInt(100), guess, tries = 1;
        
        while (true) {
            try {
                System.out.println("Key in your guess: ");
                guess = in.nextInt();
                break;
            } catch (Exception e) {
                System.err.println(e + "\ninput must be an integer.");
            }
        }
        
        do {
            
            if (guess > goal) {
                
                System.out.println("Try lower");
                
                try {
                    guess = in.nextInt();
                    tries++;
                } catch (Exception e) {
                    System.err.println(e + "\ninput must be an integer.");
                }
                
            }
            
            if (guess < goal) {
                
                System.out.println("Try higher");
                
                try {
                    guess = in.nextInt();
                    tries++;
                } catch (Exception e) {
                    System.err.println(e + "\ninput must be an integer.");
                }
                
            }
            
        } while (guess != goal);
        
        System.out.println("You got it in " + tries + " tries!");
        
    }

}
