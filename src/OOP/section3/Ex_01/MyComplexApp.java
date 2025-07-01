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
        
        System.out.println(complex1);
        System.out.println(complex2);
        
    }
    
    public static double[] getInput(Scanner scnr, String prompt) {
        String inputStr;
        String[] inputVal = new String[2];
        double[] outputVal = new double[2];
        
        System.out.print(prompt);
        inputStr = scnr.nextLine();
        
        while (true) {
            
            if (inputStr.contains(" "))
                inputVal = inputStr.split(" ");
            
            if (inputStr.contains(" ")
                    && isDouble(inputVal[0]) 
                    && isDouble(inputVal[1])
                    && (inputStr.indexOf(' ') == inputStr.lastIndexOf(' ')))
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
