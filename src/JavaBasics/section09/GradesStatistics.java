package JavaBasics.section09;

import java.util.Scanner;

public class GradesStatistics {

    public static void main(String[] args) {
        
        // DECLERATION STAGE
        
        int numStudents;
        int[] grades;
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        double avg = 0.0;
        
        Scanner in = new Scanner(System.in);
        
        
        // INPUT PROMPT
        
        System.out.print("Enter the number of students: ");
        numStudents = in.nextInt();
        
        while (numStudents < 0) {
            System.out.println("Number of students cannot be a negative number.");
            System.out.print("Enter the number of students: ");
            numStudents = in.nextInt();
        }
        
        grades = new int[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i+1) + ": ");
            grades[i] = in.nextInt();
            
            while (grades[i] < 0 || grades[i] > 100) {
                System.out.println("Grade value has to be between 0 and 100.");
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                grades[i] = in.nextInt();
            }
        }
        
        
        // PROGRAM LOGIC
        
        //looping over the grades array while calculating average and min, max
        for (int i = 0; i < grades.length; i++) {
            
            sum += grades[i];
            
            if (grades[i] < min)
                min = grades[i];
            else if (grades[i] > max)
                max = grades[i];
            
        }
        
        //calculating final grade average
        if (numStudents > 0) {
            avg = (double) sum / numStudents;
        }
        
        
        // OUTPUT STAGE
        
        if (numStudents > 0) {
            System.out.printf("The average is: %.2f\n", avg);
            System.out.println("The minimum is: " + min);
            System.out.println("The maximum is: " + max);
        }
        
    }

}
