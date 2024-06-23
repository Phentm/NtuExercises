package JavaBasics.section15;

import java.util.Scanner;

public class PerfectPrimeFactorList {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        final int UPPER_BOUND;
        int counter = 0;
        
        System.out.print("Please enter an upper bound: ");
        UPPER_BOUND = in.nextInt(); in.nextLine();
        
        for (int i = 1; i < UPPER_BOUND; i++) {
            if (isProdOfPrimeFactors(i)) {
                System.out.print(i + " ");
                counter++;
                if (counter%16 == 0) System.out.println();
            }
            
        }
        
        System.out.printf("\n[%d numbers found (%.2f%%)]\n", counter, (double)counter/UPPER_BOUND*100);
    }
    
    public static boolean isProdOfPrimeFactors(int num) {
        int prod = 1;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i == 0) {
                if (i == num/i && PrimeList.isPrime(i))
                    prod *= i;
                if (PrimeList.isPrime(i))
                    prod *= i;
                if (PrimeList.isPrime(num/i))
                    prod *= num/i;
            }
        }
        
        return prod == num;
    }

}
