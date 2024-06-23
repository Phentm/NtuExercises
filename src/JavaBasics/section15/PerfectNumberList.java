package JavaBasics.section15;

import java.util.Scanner;

public class PerfectNumberList {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        final int UPPER_BOUND;
        int[] regList, perList;
        int regCount = 0, perCount = 0;
        
        System.out.print("Please enter an upper bound: ");
        UPPER_BOUND = in.nextInt(); in.nextLine();
        
        regList = new int[UPPER_BOUND];
        perList = new int[UPPER_BOUND];
        
        for (int i = 1; i <= UPPER_BOUND; i++) {
            if (isPerfect(i)) {
                perList[perCount] = i;
                perCount++;
                continue;
            }
            if (!isDeficient(i)) {
                regList[regCount] = i;
                regCount++;
            }
        }
        
        System.out.println("These numbers are perfect: ");
        for (int i = 0; i < perCount; i++) {
            System.out.print(perList[i] + " ");
        }
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]\n\n", perCount, (double)perCount/UPPER_BOUND*100);
        
        System.out.println("These numbers are neither perfect nor defficient: ");
        for (int i = 0; i < regCount; i++) {
            System.out.print(regList[i] + " ");
            if (i == 16) {
                System.out.print("......");
                break;
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%%)]\n", regCount, (double)regCount/UPPER_BOUND*100);
        
        
    }
    
    public static boolean isPerfect(int num) {
        
        return sumFactors(num)-num == num;
    }
    
    public static boolean isDeficient(int num) {
        return sumFactors(num)-num < num;
    }
    
    public static int sumFactors(int num) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {//is a factor of the input number
                if (i == num/i)
                    sum += i;
                else
                    sum += i + num/i;
            }
            
        }
        return sum;
    }
}
