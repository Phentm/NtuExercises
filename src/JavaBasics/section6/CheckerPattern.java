package JavaBasics.section6;

import java.util.Scanner;

public class CheckerPattern {

    public static void main(String[] args) {
        
        //decleration stage
        int size;
        Scanner in = new Scanner(System.in);
        
        //prompting user for input
        System.out.print("Enter checkerboard size: ");
        size = in.nextInt();
        
        //program logic
        while (size < 0) {
            System.out.println("Error, cannot process negative values...");
            System.out.print("Enter checkerboard size: ");
            size = in.nextInt();
        }
        
        //printing stage
        for (int row = 0; row < size; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < size-1; col++)
                    System.out.print("# ");
                System.out.print("#");
            } else {
                for (int col = 0; col < size-1; col++)
                    System.out.print(" #");
                System.out.print(" #");
            }
            System.out.println();
        }
        
    }

}
