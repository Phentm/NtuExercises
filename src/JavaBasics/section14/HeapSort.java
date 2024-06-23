package JavaBasics.section14;

public class HeapSort {

    public static void main(String[] args) {
        
        int[] arr = {4, 10, 3, 5, 1};
        
        sort(arr);
        
        
    }
    
    // arr = working array
    // n = size of the heap
    // i = index of root
    public static void heapify(int[] arr, int n, int i) {
        int max = i; //assume the root is the largest node
        int l = i*2+1;
        int r = i*2+2;
        
        if (l < n && arr[l] > arr[max])
            max = l;
        
        if (r < n && arr[r] > arr[max])
            max = r;
        
        if (max != i) {
            swap(arr, i, max);
            heapify(arr, n, max);
        }   
    }
    
    public static void sort(int[] arr) {
        
        int n = arr.length;
        
        //build max-heap from array
        for (int i = (n-1)/2; i >= 0; i--) {
            heapify(arr, n, i);
        }
        
        for (int i = n-1; i >= 0; i--) {
            swap(arr, 0, i);
            
            heapify(arr, i, 0);
        }
        
    }
    
    public static void printHeap(int[] arr) {
        int row = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == Math.pow(2, row) - 1) {
                System.out.println();
                row++;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
