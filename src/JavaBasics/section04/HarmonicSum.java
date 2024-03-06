package JavaBasics.section04;

public class HarmonicSum {

    public static void main(String[] args) {
        
        final int MAX_DENOMINATOR = 50_000;
        double sumL2R = 0.0, sumR2L = 0.0, diff;
        
        for (int i = 1; i < MAX_DENOMINATOR + 1; i++) {
            sumL2R += (1.0/i);
        }
        
        for (int i = MAX_DENOMINATOR; i > 0; i--) {
            sumR2L += (1.0/i);
        }
        
        diff = sumL2R - sumR2L;
        
        System.out.println("Left-to-Right sum is equal to: " + sumL2R);
        System.out.println("Right-to-Left sum is equal to: " + sumR2L);
        
        System.out.println("Abs difference is equal to:     " + String.format("%.15f", Math.abs(diff)));
        
    }

}
