package JavaBasics.section10;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    
    public static int[] grades;

    public static void main(String[] args) {
        
        readGrades();
        
        System.out.println();
        
        print(grades);
        System.out.printf("The average is: %.2f%n", average(grades));
        System.out.printf("The median is: %.2f%n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.println("The standard deviation is: " + stdDev(grades));
        
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
                    System.out.print("Enter the grade for student "+(i+1)+": ");
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
    
    public static void print(int[] arr) {
        
        System.out.print("The grades are: [");
        
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        
        System.out.println("]");
        
    }
    
    public static double average(int[] arr) {
        
        double avg, sum = 0;
        
        for (int i : arr) {
            sum += i;
        }
        
        avg = sum / arr.length;
        
        return avg;
    }
    
    public static double median(int [] arr) {
        
        int[] tempArr = arr.clone();
        int len = arr.length;
        
        Arrays.sort(tempArr);
        
        if (len % 2 == 0)
            return ( tempArr[len/2 - 1] + tempArr[len/2] ) / 2.0;
        else
            return tempArr[len/2];
        
    }
    
    public static int min(int[] arr) {
        
        int min = Integer.MAX_VALUE;
        
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        
        return min;
    }
    
    public static int max(int[] arr) {
        
        int max = Integer.MIN_VALUE;
        
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        
        return max;
    }
    
    public static double stdDev(int[] arr) {
        
        double mean = average(arr), sum = 0;
        double stdDev;
        
        for (int i : arr)
            sum += Math.pow(i - mean, 2.0);
        
        stdDev = Math.sqrt(sum/arr.length);
        
        return stdDev;
    }

}
