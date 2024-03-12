package JavaBasics.section12;

public class PrintPatterns {

    public static void main(String[] args) {
        
        printPatternL(8);
        
    }
    
    public static void printPatternA(int size) {
        for (int i = 0; i < size/2+1; i++) {
            
            for (int j = 0; j < i; j++)
                System.out.print("  ");
            
            for (int j = size; j > i*2; j--)
                System.out.print("# ");
            
            System.out.println();
        }
    }
    
    public static void printPatternB(int size) {
        for (int i = 0; i < size/2+1; i++) {
            
            for (int j = size/2; j > i; j--)
                System.out.print("  ");
            
            for (int j = 0; j < i*2 + 1; j++)
                System.out.print("# ");
            
            System.out.println();
        }
    }
    
    public static void printPatternC(int size) {
        for (int i = 0; i < size/2+1; i++) {
            
            for (int j = size/2; j > i; j--)
                System.out.print("  ");
            
            for (int j = 0; j < i*2 + 1; j++)
                System.out.print("# ");
            
            System.out.println();
        }
        
        for (int i = 1; i < size/2+1; i++) {
            
            for (int j = 0; j < i; j++)
                System.out.print("  ");
            
            for (int j = size; j > i*2; j--)
                System.out.print("# ");
            
            System.out.println();
        }
    }
    
    public static void printPatternD(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
    }
    
    public static void printPatternE(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < size - row; col++) {
                System.out.print(col + 1);
            }
            System.out.println();
        }
    }
    
    public static void printPatternF(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row + 1; col++) {
                System.out.print(row - col + 1);
            }
            System.out.println();
        }
    }
    
    public static void printPatternG(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size - row; col++) {
                System.out.print((size-row) - col);
            }
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void printPatternH(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 1 + row * 2; col++) {
                System.out.print(Math.min(col + 1, 1 + (2*row) - col));
            }
            System.out.println();
        }
    }
    
    public static void printPatternI(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < size*2 - row*2 - 1; col++) {
                // starting value of (size*2-1)-(row*2)
                //  (distance from other edge)
                // getting reduced by col every iteration 
                //  (getting closer to other edge)
                System.out.print(Math.min( col+1 , (size*2-1) - row*2 - col) );
            }
            System.out.println();
        }
    }
    
    public static void printPatternJ(int size) {
        for (int row = 0; row < size; row++) {
            
            for (int col = 0; col < Math.min(row + 1, size-1); col++) {
                System.out.print(col + 1);
            }
            
            for (int col = 0; col < (size*2-1)-(1+row)*2; col++) {
                System.out.print(" ");
            }
            
            for (int col = 0; col < row + 1; col++) {
                System.out.print(row - col + 1);
            }
            
            System.out.println();
        }
    }
    
    public static void printPatternK(int size) {
        for (int row = 0; row < size; row++) {
            
            for (int col = 0; col < Math.min(size-1, size-row); col++) {
                System.out.print(col + 1);
            }
            
            for (int col = 0; col < row * 2 - 1; col++) {
                System.out.print(" ");
            }
            
            for (int col = 0; col < size - row; col++) {
                System.out.print(size - row - col);
            }
            
            System.out.println();
        }
    }
    
    public static void printPatternL(int size) {
        for (int row = 0; row < size; row++) {
            
            for (int col = 0; col < size - 1 - row; col++) {
                System.out.print(" ");
            }
            
            for (int col = 0; col < 1 + row*2; col++) {
                if (col < row + 1)
                    System.out.print((row + 1 + col) % 10);
                else
                    System.out.print( ((1 + row + row*2) - col) % 10 );
            }
            
            System.out.println();
        }
    }

}
