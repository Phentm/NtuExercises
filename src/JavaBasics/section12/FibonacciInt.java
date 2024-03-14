package JavaBasics.section12;

public class FibonacciInt {

    public static void main(String[] args) {
        
        int a = 0, b = 1, next = 0;
        
        for (int i = 0; i < 50; i++) {
            
            if (addIntOverflow(a, b)) {
                
                System.out.println("F("+i+") is out of the range of int");
                
            } else {
                
                System.out.println("F("+i+") =  " + next);
                
                a = b;
                b = next;
                next = a + b;
            }
            
        }
        
        int x = 701408733;
        int y = 1134903170;
        
        System.out.println(addIntOverflow(x, y));
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
