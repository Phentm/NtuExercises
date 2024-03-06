package JavaBasics.section10;

import java.util.Scanner;

public class Exponent {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int base, exp;
        
        // TESTING METHOD
        
        System.out.print("Enter base value: ");
        base = in.nextInt();
        
        System.out.print("Enter exponent value: ");
        exp = in.nextInt();
        
        System.out.println(base + " to the power of " + exp + " is: " 
                            + MethodLib.exponent(base, exp));
        
    }
    
    

}
