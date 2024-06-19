package JavaBasics.section14;

public class BubbleSort {

    public static void main(String[] args) {
        
        int[] arr = {9, 5, 4, 2, 1};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        bubbleSort(arr);
        System.out.println();
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void bubbleSort(int[] arr) {
        int unsortedLen = arr.length;
        
        do {
            for (int i = 0; i < unsortedLen - 1; i++)
                if (arr[i] > arr[i+1])
                    swap(arr, i, i+1);
            
            unsortedLen--;
        } while (unsortedLen > 1);
    }
    
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    

}
