package JavaBasics.section12;

public class Matrix {
    
    public static void print(int[][] m ) {
        
        int rows = m.length, cols;
        
        if (rows == 0)
            return;
        else
            cols = m[0].length;
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("[%4d ]", m[row][col]);
            }
            System.out.println();
        }
        
        
    }
    
//    public static void print(double[][] m ) {} TODO
    
    public static boolean haveSameDimension(int[][] m1, int[][] m2) {
        
        if (m1.length == 0 || m2.length == 0)
            return false;
        
        return !(m1.length != m2.length || m1[0].length != m2[0].length);
        
    }
    
//    public static boolean haveSameDimension(double[][] m1, double[][] m2) {return true;} TODO
    
    public static int[][] add(int[][] m1, int[][] m2) {return m1;} // TODO
    
//    public static double[][] add(double[][] m1, double[][] m2) {return m1;} TODO
    
    public static int[][] subtract(int[][] m1, int[][] m2) {return m1;} // TODO
    
//    public static double[][] subtract(double[][] m1, double[][] m2) {return m1;} TODO
    
    public static int[][] multiply(int[][] m1, int[][] m2) {return m1;} // TODO
    
//    public static double[][] multiply(double[][] m1, double[][] m2) {return m1;} TODO
}
