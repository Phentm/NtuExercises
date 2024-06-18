package JavaBasics.section13;

public class Factorial {

    public static void main(String[] args) {
        
        for (int i = 0; i < 11; i++) {
            System.out.println(i + ": " + factorial(i));
        }
        
    }
    
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        
        return n * factorial(n - 1);
    }

}
