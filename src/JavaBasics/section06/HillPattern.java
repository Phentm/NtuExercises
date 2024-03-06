package JavaBasics.section06;

import java.util.Scanner;

public class HillPattern {

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
                    for (int col = 1; col <= rowCount * 2 - 1; col++) {
                        if (col + row >= rowCount + 1 && col < rowCount + row)
                            System.out.print("#");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                
                break;
            case 'b':
                
                for (int row = 1; row <= rowCount; row++) {
                    for (int col = 1; col <= rowCount * 2 - 1; col++) {
                        if (col >= row && col + row <= rowCount * 2)
                            System.out.print("#");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                
                break;
            case 'c':
                
                for (int row = 1; row <= rowCount * 2 - 1; row++) {
                    for (int col = 1; col <= rowCount * 2 - 1; col++) {
                        System.out.printf("%4d",col + row);
                    }
                    System.out.println();
                }
                System.out.println();
                for (int row = 1; row <= rowCount * 2 - 1; row++) {
                    for (int col = 1; col <= rowCount * 2 - 1; col++) {
                        if (col + row >= rowCount + 1 && col + row < rowCount*3 && col < rowCount + row && col + rowCount - 1 >= row)
                            System.out.print("#");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                
                break;
            case 'd':
                
                //TODO
                
                break;
                
            default:
                throw new AssertionError();
        }
        
    }

}
