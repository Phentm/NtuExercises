package JavaBasics.section04;

public class Tribonacci {

    public static void main(String[] args) {
        
        int nMax = 20;                                  //The max index to be calculated
        int fn;                                         //Current fucntion value to be calculated
        int f1 = 2, f2 = 1, f3 = 1;                     //F(n-1) and F(n-2) respectively, initialized to be 1, 1
        int sum = f1 + f2 + f3;                         //Sum to be averaged later
        double avg;
        
        System.out.print(f3 + " " + f2 + " " + f1);     //Print initial values
        
        for (int n = 4; n <= nMax; n++) {
            fn = f1 + f2 + f3;                          //Calculate the current function value
            f3 = f2;                                    //Swap previous function values
            f2 = f1;
            f1 = fn;
            
            sum += fn;                                  //Add to the sum of computed values
            
            System.out.print(" " + fn);                 //Print results
        }
        
        avg = (double)sum / nMax;                       //Calculate and print average
        System.out.println("The average of the computed values is: " + avg);
        
    }

}
