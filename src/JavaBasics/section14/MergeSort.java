package JavaBasics.section14;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        
        
        int[] arr = {38, 27, 43, 10, 57, 12, 23, 31};
        
        System.out.println(Arrays.toString(arr));
        
        mergeSort(arr);
        
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length);
    }
    
    public static void mergeSort(int[] arr, int start, int end) {
        
        if (end - start <= 1)
            return;
        
        int mid = (start + end) / 2;
        
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        
        merge(arr, start, mid, end);
        
    }
    
    public static void merge(int[] arr, int start, int mid, int end) {
        
        int[] temp = new int[end-start];
        int l = start, r = mid;
        
        for (int i = 0; i < temp.length; i++) {
            if (l < mid && (r >= end || arr[l] < arr[r])) {
                temp[i] = arr[l];
                l++;
            } else {
                temp[i] = arr[r];
                r++;
            }
            
        }
        
        for (int i = start; i < end; i++) {
            arr[i] = temp[i-start];
        }
    }

}
