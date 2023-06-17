package JavaBasics.section5;

import java.util.Scanner;

public class SphereComputation {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double r;                   //Inputted term
        double vol, surArea;        //Calculated terms
        
        System.out.print("Please enter sphere radius: ");
        r = s.nextDouble();
        
        vol = 4.0/3 * Math.PI * Math.pow(r, 3);
        surArea = 4 * Math.PI * Math.pow(r, 2);
        
        System.out.printf("Volume: %.2f%n", vol);
        System.out.printf("Surface Area: %.2f%n", surArea);
        
    }

}
