package JavaBasics.section10;

import java.util.Arrays;

public class CopyOfDriver {

    public static void main(String[] args) {
        
        // TESTING METHOD
        
        int[] intArr1 = {-6969, 1337, 8888, 140, 10, 5367, -1111, 5, 73,
                        909193851, 0000};
        
        int[] intArr2 = MethodLib.copyOf(intArr1);
        
        int[] intArr3 = MethodLib.copyOf(intArr1, 20);
        
        System.out.println(intArr1 == intArr2); // should be false
        
        System.out.println(MethodLib.equals(intArr1, intArr2)); // should be true
        
        MethodLib.print(intArr1);
        MethodLib.print(intArr3);
        
    }

}
