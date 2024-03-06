package JavaBasics.section06;

import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {
        
        //decleration stage
        int squareSize;
        Scanner in = new Scanner(System.in);
        
        //prompting user for input
        System.out.print("Please enter square size to draw: ");
        squareSize = in.nextInt();
        
        //program logic
        while (squareSize < 0) {
            System.out.println("Error, cannot receive negative input...");
            System.out.print("Please enter square size to draw: ");
            squareSize = in.nextInt();
        }
        
        //printing stage
        for (int row = 0; row < squareSize; row++) {
            for (int col = 0; col < squareSize - 1; col++)
                System.out.print("# ");
            System.out.println("#");
        }
        
        
    }

}
