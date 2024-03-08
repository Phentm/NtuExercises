package JavaBasics.section10;

public class MethodLib {
    
    // EXERCISE 10.1
    public static int exponent(int base, int exp) {
        
        int prod = 1;
        
        // DEFAULT RETURN STATEMENTS
        
        if (exp == 0)
            return 1;
        else if (exp == 1)
            return base;
        
        
        // PROGRAM LOGIC
        
        for (int i = 0; i < exp; i++) {
            prod *= base;
        }
        
        return prod;
    }
    
    // EXERCISE 10.2
    public static boolean isOdd(int num) {
        
        return num % 2 != 0;
    }
    
    // EXERCISE 10.3 (MagicSum.java)
    public static boolean hasEight(int num) {
        
        if (num < 0)
            num *= -1;
        
        if (num % 10 == 8)
            return true;
        else if (num >= 10)
            return hasEight(num/10);
        
        return false;
    }
    
    // EXERCISE 10.4
    public static void print(int[] arr) {
        
        System.out.print("["); // start with a braket
        
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        
        System.out.println("]"); // end with a braket
    }
    
    public static void print(double[] arr ) {
        
        System.out.print("["); // start with a braket
        
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        
        System.out.println("]"); // end with a braket
    }
    
    public static void print(float[] arr ) {
        
        System.out.print("["); // start with a braket
        
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        
        System.out.println("]"); // end with a braket
    }
    
    // EXERCISE 10.5
    public static String arrayToString(int[] arr) {
        
        String arrStr = "[";
        
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                arrStr += arr[i];
            else
                arrStr += arr[i] + ", ";
        }
        
        arrStr += "]";
        
        return arrStr;
    }
    
    // EXERCISE 10.6
    public static boolean contains(int[] arr, int num) {
        
        if (arr.length == 0)
            return false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return true;
        }
        
        return false;
    }
    
    // EXERCISE 10.7
    public static int search(int[] arr, int num) {
        
        if (arr.length == -1)
            return -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return i;
        }
        
        return -1;
    }
    
    // EXERCISE 10.8
    public static boolean equals(int[] arr1, int[] arr2) {
        
        if (arr1 == arr2)
            return true;
        else if (arr1.length != arr2.length)
            return false;
        else if (arr1.length == 0)  // assuming the lengths are the same 
            return true;
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        
        return true;
    }
    
    // EXERCISE 10.9
    public static int[] copyOf(int[] arr) {
        
        int[] newArr = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        
        return newArr;
    }
    
    public static int[] copyOf(int[] arr, int newLength) {
        
        int[] newArr = new int[newLength];
        
        for (int i = 0; i < newLength; i++) {
            if (i < arr.length)
                newArr[i] = arr[i];                
            else
                newArr[i] = 0;  // padding with zeroes after all original 
                                // array values
       }
        
        return newArr;
    }
    
    // EXERCISE 10.10
    public static boolean swap(int[] arr1, int[] arr2) {
        
        if (arr1 == arr2)
            return true;
        else if (arr1.length != arr2.length)
            return false;
        else if (arr1.length == 0)  // assuming the lengths are the same
            return true;
        
        int temp;
        
        for (int i = 0; i < arr1.length; i++) {
            temp = arr1[i];
            
            arr1[i] = arr2[i];
            
            arr2[i] = temp;
        }
        
        return true;
    }
    
    // EXERCISE 10.11
    public static void reverse(int[] arr) {
        
        int temp;
        
        for (int i = 0; i < arr.length/2; i++) {
            
            temp = arr[i];
            
            arr[i] = arr[arr.length - 1 - i];
            
            arr[arr.length - 1 - i] = temp;
            
        }
        
    }
}
    