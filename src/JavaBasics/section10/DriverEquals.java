package JavaBasics.section10;

public class DriverEquals {

    public static void main(String[] args) {
        
        // TESTING METHOD
        
        int[] emptyArr1 = {};
        int[] emptyArr2 = {};
        int[] oneElementArr = {420};
        int[] intArr1 = {-6969, 1337, 8888, 140, 10, 5367, -1111, 5, 73,
                        909193851, 0000};
        int[] intArr2 = {-6969, 1337, 8888, 140, 10, 5367, -1111, 5, 73,
                        909193851, 0000};
        int[] intArr3 = {65, 25, -31337, 901};
        int[] intArr4 = {2631, 423123, -1233, -1239871235};
        
        System.out.println(MethodLib.equals(emptyArr1, emptyArr2));
        
    }

}
