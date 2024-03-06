package JavaBasics.section06;

import java.util.Scanner;

public class TriangularPattern {

    public static void main(String[] args) {
        
        //decleration stage
        char type;
        int size;
        Scanner in = new Scanner(System.in);
        
        //prompting user for input
        System.out.print("Input pattern type (a, b, c, d): ");
        type = in.next().charAt(0);

        System.out.print("Input pattern size (positive integer): ");
        size = in.nextInt();
        
        while ((type < 'a' || type > 'd') || size < 0) {
            System.out.println("Error, invalid arguments, try again with correct values...");
            
            System.out.print("Input pattern type (a, b, c, d): ");
            type = in.next().charAt(0);
            
            System.out.print("Input pattern size (positive integer): ");
            size = in.nextInt();
        }
        
        switch (type) {
            case 'a':
                
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col <= row - 1; col++) {
                        System.out.print("# ");
                    }
                    System.out.println("#");
                }
                
                break;
                
            case 'b':
                
                for (int row = size; row > 0; row--) {
                    for (int col = 0; col < row - 1; col++) {
                        System.out.print("# ");
                    }
                    System.out.println("#");
                }
                
                break;
                
            case 'c':
                
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < row; col++) {
                        System.out.print("  ");
                    }
                    for (int col = size; col > row + 1; col--) {
                        System.out.print("# ");
                    }
                    System.out.println("#");
                }
                
                break;
                
            case 'd':
                
                for (int row = 0; row < size; row++) {
                    for (int col = size; col > row + 1; col--) {
                        System.out.print("  ");
                    }
                    for (int col = 0; col < row; col++) {
                        System.out.print("# ");
                    }
                    System.out.println("#");
                }
                
                break;
                
            default:
                throw new AssertionError();
        }
        
        
    }

}
