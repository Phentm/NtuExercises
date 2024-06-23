package JavaBasics.section15;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        
        System.out.println(gcdRecursive(21, 49));
        
    }
    
    public static int gcd(int aNum, int bNum) {
        
        int temp, a = aNum, b = bNum;
        
        if (bNum > aNum) {
            a = bNum;
            b = aNum;
        }
        
        while (b != 0) {
            
            temp = a;
            a = b;
            b = temp%a;
            
        }
        return a;
    }
    
    public static int gcdRecursive(int a, int b) {
        
        if (b > a)
            return gcdRecursive(b, a);
        
        if (b == 0)
            return a;
        
        return gcdRecursive(b, a%b);
        
    }

}
