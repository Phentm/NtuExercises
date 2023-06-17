package JavaBasics.section6;

import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {
        
        //decleration stage
        char type;
        int rowCount;
        Scanner in = new Scanner(System.in);

        //prompting user for input
        System.out.print("Enter pattern type (a, b, c, d): ");
        type = in.next().charAt(0);

        System.out.print("Enter row count (positive integer): ");
        rowCount = in.nextInt();

        //program logic
        while ((type < 'a' || type > 'd') || rowCount < 0) {
            System.out.println("Error: invalid inputs...");

            System.out.print("Enter pattern type (a, b, c, d): ");
            type = in.next().charAt(0);

            System.out.print("Enter row count (positive integer): ");
            rowCount = in.nextInt();
        }

        //printing stage
        switch (type) {
            case 'a':
                
                for (int row = 1; row <= rowCount; row++) {
                    for (int col = 1; col <= row; col++) {
                        
                        System.out.print(col + " ");
                        
                    }
                    System.out.println();
                }
                
                break;
            case 'b':
                
                for (int row = 0; row < rowCount; row++) {
                    for (int col = 0; col < row; col++) {
                        System.out.print("  ");
                    }
                    
                    for (int col = 0; col < rowCount - row; col++) {
                        System.out.print(col + 1 + " ");
                    }
                    System.out.println();
                }
                
                break;
            case 'c':
                
                for (int row = 0; row < rowCount; row++) {
                    for (int col = 0; col < rowCount - row - 1; col++) {
                        System.out.print("  ");
                    }
                    for (int col = 0; col <= row; col++) {
                        System.out.print((row + 1) - col + " ");
                    }
                    System.out.println();
                }
                
                break;
            case 'd':
                
                for (int row = 0; row < rowCount; row++) {
                    int colFin = 0;
                    for (int col = 0; col < rowCount - row - 1; col++) {
                        colFin = col + 1;
                        System.out.print(rowCount - col - row + " ");
                    }
                    System.out.print(rowCount - colFin - row);
                    System.out.println();
                }
                
                break;

            default:
                throw new AssertionError();
        }
        
    }

}
