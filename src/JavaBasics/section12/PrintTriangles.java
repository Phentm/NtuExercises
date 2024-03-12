package JavaBasics.section12;

public class PrintTriangles {

    public static void main(String[] args) {
        
        printPascalTriangle(8);
        
    }
    
    public static void printPowerOf2Triangle(int numRows) {
        
        for (int row = 0; row < numRows; row++) {
            
            for (int col = 0; col < numRows - row - 1; col++) {
                System.out.print("    ");
            }
            
            for (int col = 0; col < 1 + row * 2; col++) {
                System.out.printf("%4d", (int)Math.min( Math.pow(2, col), Math.pow(2, row * 2- col) ) );
            }
            
            System.out.println();
            
        }
        
    }
    
    public static void printPascalTriangle(int numRows) {
        
        int biCoe, colIndex = 0;
        
        for (int row = 0; row < numRows; row++) {
            
            for (int col = 0; col < row + 1; col++) {
                
                biCoe = factorial(row) / (factorial(col) * factorial(row - col));
                colIndex++;
                System.out.printf(" %2d", biCoe);
                
            }
            
            colIndex = 0;
            
            System.out.println();
            
        }
        
    }
    
    public static void printPascalTriangle2(int numRows) {
        
        int biCoe, colIndex = 0;
        
        for (int row = 0; row < numRows; row++) {
            
            for (int col = 0; col < numRows + row; col++) {
                
                if (col < numRows - row - 1 || (col - numRows - 1 - row) % 2 != 0 ) {
                    System.out.print("  ");
                } else {
                    biCoe = factorial(row) / (factorial(colIndex) * factorial(row - colIndex));
                    colIndex++;
                    System.out.printf("%2d", biCoe);
                }
                
            }
            
            colIndex = 0;
            
            System.out.println();
            
        }
        
    }
    
    public static int factorial(int i) {
        
        if (i <= 0)
            return 1;
        
        return i * factorial(i-1);
    }

}
