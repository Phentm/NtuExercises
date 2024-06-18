package JavaBasics.section13;

public class SqeuenceLength {

    public static void main(String[] args) {
        
        for (int i = 9; i < 13; i++) {
            System.out.println(len(i));
        }
        
        for (int i = 9; i < 13; i++) {
            System.out.println(lenIterative(i));
        }
    }
    
    public static int len(int n) {
        if (n == 1)
            return 1;
        
        return len(n-1) + numOfDigits(n);
    }
    
    public static int lenIterative(int n) {
        int counter = 0;
        
        for (int i = 1; i < n + 1; i++) {
            counter += numOfDigits(i);
            
        }
        
        return counter;
    }
    
    public static int numOfDigits(int n) {
        if (n == 0)
            return 1;
        
        int counter = 0;
        
        while (n != 0) {
            n = n / 10;
            counter++;
        }
        return counter;
    }
    
}
