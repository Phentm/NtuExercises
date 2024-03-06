package JavaBasics.section04;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        
        int sum = 0;
        double avg = 0;
        
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        
        avg = (double)(sum / 100.0);
        
        System.out.println("The sum of 1 to 100 is: " + sum);
        System.out.println("The average is: " + avg);
        
    }
}
