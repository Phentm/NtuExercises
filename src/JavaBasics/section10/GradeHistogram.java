package JavaBasics.section10;

import java.util.Scanner;

public class GradeHistogram {

    public static int[] grades;

    public static void main(String[] args) {

        
        readGrades();
        
        System.out.println();
        
        printVerDiagram(grades);
        
        System.out.println();
        
        printHorDiagram(grades);
        
    }

    public static void readGrades() {

        int gradeAmount;

        Scanner in = new Scanner(System.in);

        while (true) {

            try {
                System.out.print("Enter the number of students: ");
                gradeAmount = in.nextInt();

                if (gradeAmount >= 0) {
                    grades = new int[gradeAmount];
                    break;
                }

                throw new Exception("Number of grades cannot be negative.");

            } catch (Exception e) {
                System.out.println("Error: " + e);
                in.nextLine();
            }

        }

        for (int i = 0; i < gradeAmount; i++) {

            while (true) {

                try {
                    System.out.print("Enter the grade for student " + (i + 1) + ": ");
                    grades[i] = in.nextInt();

                    if (grades[i] >= 0 && grades[i] <= 100)
                        break;

                    throw new Exception("Invalid input.");

                } catch (Exception e) {
                    System.out.println("Error: " + e);
                    in.nextLine();
                }

            }

        }

        in.close();
    }
    
    public static void printVerDiagram(int[] arr) {
        
        int[] counts = new int[10];
        
        for (int i : arr) {
            
            if (i == 100)
                counts[9]++;
            else
                counts[i/10]++;
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            String stars = "*".repeat(counts[i]);
            
            if (i == 9)
                System.out.println(" 90 - 100: " + stars);
            else
                System.out.printf("%1$3d - %2$3d: " + stars + "%n", i*10, (i*10)+9);
            
        }
    }
    
    public static void printHorDiagram(int[] arr) {
        
        int[] counts = new int[10];
        
        for (int i : arr) {
            
            if (i == 100)
                counts[9]++;
            else
                counts[i/10]++;
            
        }
        
        int maxCol = maxIndex(counts);
        int numRows = counts[maxCol];
        
        String rowStr = "";
        
        for (int row = numRows; row > 0; row--) {
            
            for (int col = 0; col < 10; col++) {
                
                if (counts[col] < row)
                    rowStr += "       ";
                else
                    rowStr += "   *   ";
                
                
                
            }
            
            System.out.println(rowStr);
            rowStr = "";
            
        }
        
        for (int i = 0; i < 10; i++) {
            if (i == 9)
                System.out.println(" 90-100");
            else
                System.out.printf("%1$3d-%2$-3d", i*10, (i*10)+9);
        }
        
        
    }
    
    public static int maxIndex(int[] arr) {
        
        if (arr.length == 0)
            return -1;
        
        int max = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[max])
                max = i;
        }
        
        return max;
        
    }

}
