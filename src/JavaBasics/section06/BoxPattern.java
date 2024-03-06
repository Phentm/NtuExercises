package JavaBasics.section06;

import java.util.Scanner;

public class BoxPattern {

    public static void main(String[] args) {
        
        //decleration stage
        char type;
        int size;
        Scanner in = new Scanner(System.in);

        //prompting user for input
        System.out.print("Input pattern type (a, b, c, d, e): ");
        type = in.next().charAt(0);

        System.out.print("Input pattern size (positive integer): ");
        size = in.nextInt();
        
        //program logic
        while ((type < 'a' || type > 'e') || size < 0) {
            System.out.println("Error, invalid arguments...");

            System.out.print("Input pattern type (a, b, c, d, e): ");
            type = in.next().charAt(0);

            System.out.print("Input pattern size (positive integer): ");
            size = in.nextInt();
        }
        
        //printing stage
        switch (type) {
            case 'a':

                for (int row = 1; row <= size; row++) {
                    for (int col = 1; col <= size; col++) {
                        if (col == 1 || col == size || row == 1 || row == size)
                            System.out.print("# ");
                        else
                            System.out.print("  ");
                    }
                    System.out.println();
                }

                break;

            case 'b':

                for (int row = 1; row <= size; row++) {
                    for (int col = 1; col <= size; col++) {
                        
                        if (col == row || row == 1 || row == size)
                            System.out.print("# ");
                        else
                            System.out.print("  ");
                    }
                    System.out.println();
                }

                break;

            case 'c':

                for (int row = 1; row <= size; row++) {
                    for (int col = 1; col <= size; col++) {

                        if (col + row == size + 1 || row == 1 || row == size) {
                            System.out.print("# ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }

                break;

            case 'd':

                for (int row = 1; row <= size; row++) {
                    for (int col = 1; col <= size; col++) {

                        if (col + row == size + 1 || col == row || row == 1 || row == size) {
                            System.out.print("# ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }

                break;

            case 'e':
                
                for (int row = 1; row <= size; row++) {
                    for (int col = 1; col <= size; col++) {

                        if (col + row == size + 1 || col == row || row == 1 || row == size || col == 1 || col == size) {
                            System.out.print("# ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                
                break;

            default:
                throw new AssertionError();
        }
        
    }

}
