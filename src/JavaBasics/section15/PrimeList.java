package JavaBasics.section15;

import java.util.Scanner;

public class PrimeList {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        final int UPPER_BOUND;
        int counter = 0;
        
        System.out.print("Please enter an upper bound: ");
        UPPER_BOUND = in.nextInt(); in.nextLine();
        
        for (int i = 1; i < UPPER_BOUND; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                counter++;
            }
        }
        
        System.out.printf("[%d primes found (%.2f%%)]\n", counter, (double)counter/UPPER_BOUND*100);
        
    }
    
    public static boolean isPrime(int num) {
        
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        
        return true;
    }

}
