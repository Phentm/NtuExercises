package JavaBasics.section14;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        
        int[] arr = {819, 332, 113, 137, 918, 19, 23, 583, 929, 939, 325, 708};
        System.out.println(Arrays.toString(arr));
        
        quickSort(arr);
        
        System.out.println(Arrays.toString(arr));
    }
    
    public static boolean quickSort(int[] arr) {
        return quickSort(arr, 0, arr.length);
    }
    
    public static boolean quickSort(int[] arr, int fromIdx, int toIdx) {
        
        if (toIdx - fromIdx <= 1)
            return true;
        
        int pivot = (toIdx + fromIdx) / 2;
        
        swap(arr, pivot, toIdx-1);
        
        pivot = lomutoPartition(arr, fromIdx, toIdx-1);
        
        swap(arr, pivot, toIdx-1);
        
        
        return quickSort(arr, fromIdx, pivot) && quickSort(arr, pivot + 1, toIdx);
    }
    
    public static int lomutoPartition(int[] arr, int swapPos, int pivot) {
        
        for (int i = swapPos; i < pivot; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, swapPos);
                swapPos++;
            }
        }
        
        return swapPos;
        
    }
    
    public static void swap(int[] arr, int idxA, int idxB) {
        int temp = arr[idxA];
        arr[idxA] = arr[idxB];
        arr[idxB] = temp;
    }

}
