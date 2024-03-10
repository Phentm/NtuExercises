package JavaBasics.section12;

import java.util.Random;

public class DriverMatrix {

    public static void main(String[] args) {

        Random rnd = new Random();

//        int[][] m1 = new int[rnd.nextInt(1, 11)][rnd.nextInt(1, 11)];
//        int[][] m2 = new int[rnd.nextInt(1, 11)][rnd.nextInt(1, 11)];
        
        int[][] m1 = new int[0][rnd.nextInt(1, 11)];
        int[][] m2 = new int[0][rnd.nextInt(1, 11)];
        
        while (!Matrix.haveSameDimension(m1, m2)) {            
            m1 = new int[rnd.nextInt(1, 11)][rnd.nextInt(1, 11)];
            m2 = new int[rnd.nextInt(1, 11)][rnd.nextInt(1, 11)];
            
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    m1[i][j] = rnd.nextInt(-10, 11);
                }
            }
            
            for (int i = 0; i < m2.length; i++) {
                for (int j = 0; j < m2[0].length; j++) {
                    m2[i][j] = rnd.nextInt(-10, 11);
                }
            }
        }

        Matrix.print(m1);
        System.out.println();
        Matrix.print(m2);
        System.out.println();
        System.out.println(Matrix.haveSameDimension(m1, m2));

    }

}
