package JavaBasics.section14;

public class InsertionSort {

    public static void main(String[] args) {
        
        int[] arr = {9, 6, 4, 1, 5, 2, 7};
        
        insertionSort(arr);
        
        
        
    }
    
    public static void insertionSort(int[] arr) {
        
        int sortedLen = 1, temp;
        
        while (sortedLen != arr.length) {
            
            for (int i = 0; i < sortedLen; i++) {
                if (arr[i] > arr[sortedLen]) {
                    temp = arr[sortedLen];
                    moveRight(arr, i, sortedLen);
                    arr[i] = temp;
                    break;
                }
            }
            printArr(arr);
            sortedLen++;
        }
    }
    
    public static void moveRight(int[] arr, int index, int valIndex) {
        if (index == valIndex)
            return;
        
        moveRight(arr, index + 1, valIndex);
        arr[index + 1] = arr[index];
    }
    
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
