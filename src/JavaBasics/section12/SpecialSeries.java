package JavaBasics.section12;

public class SpecialSeries {

    public static void main(String[] args) {
        
        System.out.println(specialSeries(1, 5));
        
        
    }
    
    public static double specialSeries(double x, int numTerms) {
        
        if (x < -1 || x > 1)
            return 0;
        
        double sum = x;
        
        for (int term = 1; term < numTerms; term++) {
            
            if (term % 2 == 0)
                sum *= Math.pow(x, term + 1) / (term + 1);
            else
                sum += ((double)oddEvenFactorial(term)/oddEvenFactorial(term + 1));
            
        }
        
        return sum;
        
    }
    
    public static long oddEvenFactorial(long i) {
        if (i <= 0)
            return 1;
        
        return i * oddEvenFactorial(i-2);
    }

}
