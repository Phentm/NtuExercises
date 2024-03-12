package JavaBasics.section12;

public class ExponentialSeries {

    public static void main(String[] args) {
        
        System.out.println(Math.E);
        
        System.out.println(exp(20));
        
        System.out.println(Math.exp(1));
        System.out.println(exp(1, 20));
        
    }
    
    public static double exp(int numTerms) {
        double e = 0;
        
        for (int i = 0; i < numTerms; i++) {
            e += 1.0/factorial(i);
        }
        
        return e;
    }
    
    public static double exp(double x, int numTerms) {
        double exp = 0;
        
        for (int i = 0; i < numTerms; i++) {
            exp += Math.pow(x, i) / factorial(i);
        }
        
        return exp;
    }
    
    public static double factorial(int i) {
        
        if (i <= 0)
            return 1;
        
        return i * factorial(i-1);
    }

}
