package JavaBasics.section14;

import java.util.Random;

public class LinearSearch {

    public static void main(String[] args) {
        
        Random rnd = new Random();
        
        int[] arr = new int[10];
        
        for (int i = 0; i < arr.length; i++)
            arr[i] = rnd.nextInt(arr.length);
        
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println("\n"+linearSearch(arr, 0)+" : "+linearSearchIndex(arr, 0));
        
    }
    
    public static boolean linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return true;
        
        return false;
    }
    
    public static int linearSearchIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) 
            if (arr[i] == key) return i;
        
        return -1;
    }
}
