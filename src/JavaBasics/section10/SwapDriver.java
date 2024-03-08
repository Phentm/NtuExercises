package JavaBasics.section10;

public class SwapDriver {

    public static void main(String[] args) {
        
        // TESTING METHOD
        
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        int[] arr3 = {};
        
        int[] arr4 = {1, 2, 3, 4, 5};
        
        int[] arr5 = arr1;
        
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        MethodLib.print(arr1);
        MethodLib.print(arr2);
        MethodLib.print(arr3);
        MethodLib.print(arr4);
        MethodLib.print(arr5);
        MethodLib.print(arr6);
        System.out.println("\n-----------------------------------------------\n");
        
        System.out.println(MethodLib.swap(arr1, arr6));
        
        System.out.println("\n-----------------------------------------------\n");
        MethodLib.print(arr1);
        MethodLib.print(arr2);
        MethodLib.print(arr3);
        MethodLib.print(arr4);
        MethodLib.print(arr5);
        MethodLib.print(arr6);
        
    }

}
