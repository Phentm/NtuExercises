package JavaBasics.section14;

public class HeapSortNoRecursion {

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 15, 17, 9, 21};
        int[] arr2 = {36, 29, 47, 76, 21, 51, 31, 9, 67, 42, 75, 32, 19, 10, 74, 40, 26, 77, 99, 95};
        
        sort(arr2);
        System.out.println(java.util.Arrays.toString(arr2));
        
    }
    
    public static void heapify(int[] arr, int n) {
        
        for (int i = 1; i < n; i++) {
            
            int parentNode = (i-1)/2;
            
            if (arr[i] > arr[parentNode]) {
                
                int j = i;
                do {
                    swap(arr, j, (j-1)/2);
                    j = (j-1)/2;
                } while (arr[j] > arr[(j-1)/2]);   
            }
        }
    }
    
    public static void sort(int[] arr) {
        
        heapify(arr, arr.length);
        
        for (int i = arr.length-1; i >= 0; i--) {
            swap(arr, 0, i);
            
            heapify(arr, i);
        }
        
    }
    
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
