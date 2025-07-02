package OOP.section3.Ex_01;

import java.util.Scanner;

public class MyComplexApp {

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        
        MyComplex complex1, complex2;
        
        double[] tempValues;
        
        tempValues = getInput(scnr, "Enter complex number 1 (real and imaginary part): ");
        complex1 = new MyComplex(tempValues[0], tempValues[1]);
        
        tempValues = getInput(scnr, "Enter complex number 2 (real and imaginary part): ");
        complex2 = new MyComplex(tempValues[0], tempValues[1]);
        
        showComplexInfo(complex1, 1);
        
        showComplexInfo(complex2, 2);
        
        System.out.println();
        
        if (complex1.equals(complex2))
            System.out.println("(" + complex1 + ") IS equal to ("
                    + complex2 + ")");
        else
            System.out.println("(" + complex1 + ") is NOT equal to ("
                    + complex2 + ")");
        
        System.out.println("(" + complex1 + ") + (" + complex2 + ") = ("
                + complex1.addNew(complex2) + ")");
    }
    
    public static void showComplexInfo(MyComplex cmplx, int index) {
        System.out.println("\nNumber " + index + " is: (" + cmplx + ")");
        
        if (cmplx.isReal())
            System.out.println("(" + cmplx + ") IS a pure real number");
        else if (cmplx.isImaginary())
            System.out.println("(" + cmplx + ") IS a pure imaginary number");
        else
            System.out.println("(" + cmplx + ") is NOT a pure real number\n"
                    + "(" + cmplx + ") is NOT a pure imaginary number");
        
    }
    
    public static double[] getInput(Scanner scnr, String prompt) {
        String inputStr;
        String[] inputVal;
        double[] outputVal = new double[2];
        
        System.out.print(prompt);
        inputStr = scnr.nextLine();
        
        while (true) {
            
            if (inputStr.contains(" "))
                inputVal = inputStr.split(" ");
            else
                inputVal = new String[0];
            
            if (inputVal.length == 2
                    && isDouble(inputVal[0]) 
                    && isDouble(inputVal[1]))
                break;
            
            System.err.println("Invalid input, please try again.");
            
            System.out.print(prompt);
            inputStr = scnr.nextLine();
           
        }
        
        outputVal[0] = Double.parseDouble(inputVal[0]);
        outputVal[1] = Double.parseDouble(inputVal[1]);
        
        return outputVal;
    }
    
    public static boolean isDouble(String str) {
        try {
            Double.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
