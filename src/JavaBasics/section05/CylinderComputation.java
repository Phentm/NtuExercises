package JavaBasics.section05;

import java.util.Scanner;

public class CylinderComputation {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double r, h;                        //Inputted terms
        double baseArea, surArea, vol;     //Calculated terms
        
        System.out.print("Please enter cylinder radius: ");
        r = s.nextDouble();
        System.out.print("Please enter cylinder height: ");
        h = s.nextDouble();
        
        baseArea = Math.PI * Math.pow(r, 2);
        vol = baseArea * h;
        surArea = 2.0 * Math.PI * r * h + 2.0 * baseArea;
        
        System.out.printf("Base Area: %.2f%n", baseArea);
        System.out.printf("Surface Area: %.2f%n", surArea);
        System.out.printf("Volume: %.2f%n", vol);
        
    }

}
