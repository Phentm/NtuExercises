package JavaBasics.section04;

public class ComputePI {

    public static void main(String[] args) {
        
        final int MAX_DENOMINATOR = 1_000_000;
        int counter = 1;
        double pi = 0.0;
        
        for (int i = 1; i < MAX_DENOMINATOR + 1; i+=2) {
            if (counter % 2 != 0) {
                pi += (1.0/i);
            } else {
                pi -= (1.0/i);
            }
            counter++;
        }
        pi *= 4;
        System.out.println(pi);
    }

}
