package JavaBasics.section6;

import java.util.Scanner;

public class TimeTable {

    public static void main(String[] args) {
        
        //decleration stage
        int width;
        Scanner in = new Scanner(System.in);

        //prompting user for input
        System.out.print("Enter Timetable size: ");
        width = in.nextInt();

        //program logic
        while (width < 0) {
            System.out.println("Error, cannot process negative values...");
            System.out.print("Enter Timetable size: ");
            width = in.nextInt();
        }
        
        //printing stage
        
        //printing top bar
        System.out.print(" * |");
        for (int col = 0; col < width; col++)
            System.out.printf("%4d", col + 1);
        System.out.println();
        
        //printing divider
        for (int col = 0; col < width + 1; col++)
            System.out.print("----");
        
        System.out.println();
        
        //printing timetable body
        for (int row = 0; row < width; row++) {
            System.out.printf("%2d |", row + 1);
            for (int col = 0; col < width; col++) {
                System.out.printf("%4d", (col+1)*(row+1));
            }
            System.out.println();
        }
        
        
    }

}
