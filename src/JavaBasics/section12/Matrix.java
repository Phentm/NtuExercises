package JavaBasics.section12;

public class Matrix {
    
    public static boolean valid(int[][] m) {
        
        if (m.length == 0 || m[0].length == 0)
            return false;
        
        // checking for variable row length
        int col = m[0].length;
        for (int[] row : m) {
            if (col != row.length)
                return false;
        }
        
        return true;
        
    }
    
    public static boolean valid(double[][] m) {
        
        if (m.length == 0 || m[0].length == 0)
            return false;
        
        // checking for variable row length
        int col = m[0].length;
        for (double[] row : m) {
            if (col != row.length)
                return false;
        }
        
        return true;
        
    }
    
    public static void print(int[][] m) {
        
        if (!valid(m)) {
            System.err.println("Invalid matrix.");
            return;
        }
        
        int rows = m.length, cols = m[0].length;
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++)
                System.out.printf("[%4d ]", m[row][col]);
            System.out.println();
        }
        
    }
    
    public static void print(double[][] m ) {
        
        if (!valid(m)) {
            System.err.println("Invalid matrix.");
            return;
        }
        
        int rows = m.length, cols = m[0].length;
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++)
                System.out.printf("[%8.2f ]", m[row][col]);
            System.out.println();
        }
        
    }
    
    public static boolean haveSameDimension(int[][] m1, int[][] m2) {
        
        if (!valid(m1) || !valid(m2)) {
            System.err.println("Invalid matrix.");
            return false;
        }
        
        return m1.length == m2.length && m1[0].length == m2[0].length;
        
    }
    
    public static boolean haveSameDimension(double[][] m1, double[][] m2) {
        
        if (!valid(m1) || !valid(m2)) {
            System.err.println("Invalid matrix.");
            return false;
        }
        
        return m1.length == m2.length && m1[0].length == m2[0].length;
        
    }
    
    public static int[][] add(int[][] m1, int[][] m2) {
        
        try {
            if (!valid(m1) || !valid(m2) || haveSameDimension(m1, m2))
                throw new Exception("Invalid matrix input. Input matricies"
                        + " cant have length 0 and must match dimensions.");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        int m3[][] = new int[m1.length][m1[0].length];
        
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[0].length; col++)
                m3[row][col] = m1[row][col] + m2[row][col];
        }
        
        return m3;        
    }
    
    public static double[][] add(double[][] m1, double[][] m2) {
        
        try {
            if (!valid(m1) || !valid(m2) || haveSameDimension(m1, m2))
                throw new Exception("Invalid matrix input. Input matricies"
                        + " cant have length 0 and must match dimensions.");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        double m3[][] = new double[m1.length][m1[0].length];
        
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[0].length; col++)
                m3[row][col] = m1[row][col] + m2[row][col];
        }
        
        return m3;  
        
    }
    
    public static int[][] subtract(int[][] m1, int[][] m2) {
        
        try {
            if (!valid(m1) || !valid(m2) || haveSameDimension(m1, m2))
                throw new Exception("Invalid matrix input. Input matricies"
                        + " cant have length 0 and must match dimensions.");
        } catch (Exception e) {
            System.out.println(e);
        }
        int m3[][] = new int[m1.length][m1[0].length];
        
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[0].length; col++)
                m3[row][col] = m1[row][col] - m2[row][col];
        }
        
        return m3;
    }
    
    public static double[][] subtract(double[][] m1, double[][] m2) {

        try {
            if (!valid(m1) || !valid(m2) || haveSameDimension(m1, m2)) {
                throw new Exception("Invalid matrix input. Input matricies"
                        + " cant have length 0 and must match dimensions.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        double m3[][] = new double[m1.length][m1[0].length];

        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[0].length; col++) {
                m3[row][col] = m1[row][col] - m2[row][col];
            }
        }

        return m3;

    }
    
    public static int dotProd(int[] a, int[] b) {
        
        if (a.length != b.length) {
            System.err.println("Can't calculate dot product for different"
                    + " sized datasets. Returning 0.");
            return 0;
        }
        
        int sum = 0;
        
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        
        return sum;
    }
    
    public static double dotProd(double[] a, double[] b) {
        
        if (a.length != b.length) {
            System.err.println("Can't calculate dot product for different"
                    + " sized datasets. Returning 0.");
            return 0;
        }
        
        double sum = 0;
        
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        
        return sum;
    }
    
    public static int[][] multiply(int[][] m1, int[][] m2) {
        
        if (!valid(m1) || !valid(m2)) {
            System.err.println("Invalid input. Returning empty matrix.");
            return new int[0][0];
        }
        
        if (m1[0].length != m2.length) {
            System.err.println("Invalid input, cannot multiply matricies. "
                    + "Returning empty matrix.");
            return new int[0][0];
        }
        
        int m1Height = m1.length, m1Width = m1[0].length;
        int m2Height = m2.length, m2Width = m2[0].length;
        
        int[][] resultMat = new int[m1Height][m2[0].length];
        
        for (int m1row = 0; m1row < m1Height; m1row++) {
            
            int[] m1RowValues = new int[m1Width];
            
            for (int m1col = 0; m1col < m1Width; m1col++)
                m1RowValues[m1col] = m1[m1row][m1col];
            
            for (int m2col = 0; m2col < m2Width; m2col++) {
                
                int[] m2ColValues = new int[m1Width];
                
                for (int m2Row = 0; m2Row < m2Height; m2Row++)
                    m2ColValues[m2Row] = m2[m2Row][m2col];
                
                resultMat[m1row][m2col] = dotProd(m1RowValues, m2ColValues);
                
            }
            
        }
        
        return resultMat;
        
    }
    
    public static double[][] multiply(double[][] m1, double[][] m2) {
        
        if (!valid(m1) || !valid(m2)) {
            System.err.println("Invalid input. Returning empty matrix.");
            return new double[0][0];
        }
        
        if (m1[0].length != m2.length) {
            System.err.println("Invalid input, cannot multiply matricies. "
                    + "Returning empty matrix.");
            return new double[0][0];
        }
        
        int m1Height = m1.length, m1Width = m1[0].length;
        int m2Height = m2.length, m2Width = m2[0].length;
        
        int dotLength = m1Width;
        
        double[][] resultMat = new double[m1Height][m2[0].length];
        
        for (int m1row = 0; m1row < m1Height; m1row++) {
            
            double[] m1RowValues = new double[dotLength];
            
            for (int m1col = 0; m1col < m1Width; m1col++)
                m1RowValues[m1col] = m1[m1row][m1col];
            
            for (int m2col = 0; m2col < m2Width; m2col++) {
                
                double[] m2ColValues = new double[dotLength];
                
                for (int m2Row = 0; m2Row < m2Height; m2Row++)
                    m2ColValues[m2Row] = m2[m2Row][m2col];
                
                resultMat[m1row][m2col] = dotProd(m1RowValues, m2ColValues);
                
            }
            
        }
        
        return resultMat;
        
    }
}
