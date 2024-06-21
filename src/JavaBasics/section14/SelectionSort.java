package JavaBasics.section14;

public class SelectionSort {

    public static void main(String[] args) {
        
        int[] arr = {9, 6, 4, 1, 5, 1, 5};
        
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        
        selectionSort(arr);
        
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    
    }
    
    public static void selectionSort(int[] arr) {
        
        int sortedLen = 0;
        
        while (sortedLen < arr.length) {
            swap(arr, findMin(arr, sortedLen), sortedLen);
            
            sortedLen++;
        }
        
    }
    
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static int findMin(int[] arr, int from) {
        int min = Integer.MAX_VALUE, index = 0;
        
        for (int i = from; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        
        return index;
    }

}
