package JavaBasics.section05;

import java.util.Scanner;

public class CircleComputation {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double r;                   //Inputted term
        double dia, circ, area;     //Calculated terms
        
        System.out.print("Please enter circle radius: ");
        r = s.nextDouble();
        
        dia = 2.0 * r;
        area = Math.PI * Math.pow(r, 2);
        circ = 2.0 * Math.PI * r;
        
        System.out.printf("Diameter: %.2f%n", dia);
        System.out.printf("Circumference: %.2f%n", circ);
        System.out.printf("Area: %.2f%n", area);
        
        
    }

}
