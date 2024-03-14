package JavaBasics.section12;

public class FactorialLong {

    public static void main(String[] args) {
        
        long f = 1;
        
        for (int i = 1; i < 22; i++) {
            
            if (mulLongOverflow(f, i)) {
                System.out.println(i + " factorial is out of range.");
            } else {
                f *= i;
                System.out.println(i + " factorial is " + f);
            }
            
        }
        
    }
    
    public static boolean addLongOverflow(long a, long b) {
        return (b > 0 && a > Long.MAX_VALUE - b) || (b < 0 && a < Long.MIN_VALUE - b);
    }
    
    public static boolean subLongOverflow(long a, long b) {
        return (b > 0 && a < Long.MIN_VALUE + b) || (b < 0 && a > Long.MAX_VALUE + b);
    }
    
    public static boolean mulLongOverflow(long a, long b) {
        return (b > 0 && a > Long.MAX_VALUE / b) || (b < 0 && a < Long.MIN_VALUE / b);
    }
    
}
