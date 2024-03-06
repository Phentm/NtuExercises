package JavaBasics.section10;

public class SearchDriver {

    public static void main(String[] args) {
        
        // TESTING METHOD
        
        int[] intArr = {-6969, 1337, 8888, 140, 10, 5367, -1111, 5, 73,
                        909193851, 0000};
        
        System.out.println(intArr[MethodLib.search(intArr, 1337)]);
        
    }

}
