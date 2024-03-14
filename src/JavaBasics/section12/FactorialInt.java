package JavaBasics.section12;

public class FactorialInt {

    public static void main(String[] args) {
        
        int f = 1;
        
        for (int i = 1; i < 15; i++) {
            
            if (mulIntOverflow(f, i)) {
                System.out.println(i + " factorial is out of range.");
            } else {
                f *= i;
                System.out.println(i + " factorial is " + f);
            }
            
        }
        
    }
    
    public static boolean addIntOverflow(int a, int b) {
        return (b > 0 && a > Integer.MAX_VALUE - b) || (b < 0 && a < Integer.MIN_VALUE - b);
    }
    
    public static boolean subIntOverflow(int a, int b) {
        return (b > 0 && a < Integer.MIN_VALUE + b) || (b < 0 && a > Integer.MAX_VALUE + b);
    }
    
    public static boolean mulIntOverflow(int a, int b) {
        return (b > 0 && a > Integer.MAX_VALUE / b) || (b < 0 && a < Integer.MIN_VALUE / b);
    }

}
