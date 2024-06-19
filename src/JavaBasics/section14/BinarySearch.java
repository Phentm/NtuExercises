package JavaBasics.section14;

public class BinarySearch {

    public static void main(String[] args) {
        
        int[] arr = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
        System.out.println(binarySearch(arr, 11));
        
    }
    
    public static boolean binarySearch(int[] arr, int key, int from, int to) {
        if (from == to)
            return key == arr[from];
        
        int middle = (from + to) / 2;
        
        if (key == arr[middle])
            return true;
        
        if (key > arr[middle])
            from = middle + 1;
        else
            to = middle;
        
        return binarySearch(arr, key, from, to);
    }
    
    public static boolean binarySearch(int[] arr, int key) {
        return binarySearch(arr, key, 0, arr.length-1);
    }

}
