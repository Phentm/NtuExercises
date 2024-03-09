package JavaBasics.section10;

public class DriverPrint {

    public static void main(String[] args) {
        
        // TESTING METHOD
        
        int[] emptyArr = {};
        int[] oneElementArr = {420};
        int[] intArr = {-6969, 1337, 8888, 140, 10, 5367, -1111, 5, 73,
                        909193851, 0000};
        float[] floatArr = {65f, 2.5f, -3.1337f, 901f};
        double[] doubleArr = {2.631, 423.123, -1233, -123987.123574};
        
        MethodLib.print(intArr);
        MethodLib.print(floatArr);
        MethodLib.print(doubleArr);
        
        System.out.println();
        
        MethodLib.print(emptyArr);
        MethodLib.print(oneElementArr);
        
        
    }

}
