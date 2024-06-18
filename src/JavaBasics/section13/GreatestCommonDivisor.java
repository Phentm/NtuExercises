package JavaBasics.section13;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        
        System.out.println(gdc(0, 36));
        
    }
    
    public static int gdc(int a, int b) {
        
        if (a < 0 || b < 0) {
            a = Math.abs(a);
            b = Math.abs(b);
        }
        
        if (b > a)
            return gdc(b,a);
        
        if (b == 0)
            return a;
        
        return gdc(b, a%b);
    }
}
