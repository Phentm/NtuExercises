package JavaBasics.section12;

public class TrigonometricSeries {

    public static void main(String[] args) {
        
        System.out.println(Math.cos(Math.PI/6));
        
        System.out.println(cos(Math.PI/6, 17));
        
    }
    
    public static double sin(double x, int numTerms) {
        double sin = 0;
        
        for (int term = 0; term < numTerms; term++) {
            
            if (term % 2 == 0)
                sin += Math.pow(x, term * 2 + 1) / factorial(term * 2 + 1);
            else
                sin -= Math.pow(x, term * 2 + 1) / factorial(term * 2 + 1);
        }
        
        return sin;
    }
    
    public static double cos(double x, int numTerms) {
        double cos = 0;
        
        for (int term = 0; term < numTerms; term++) {
            
            if (term % 2 == 0)
                cos += Math.pow(x, term * 2) / factorial(term * 2);
            else
                cos -= Math.pow(x, term * 2) / factorial(term * 2);
        }
        
        return cos;
    }
    
    public static double factorial(int i) {
        
        if (i <= 0)
            return 1;
        
        return i * factorial(i-1);
    }

}
