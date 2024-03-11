package JavaBasics.section12;

public class DriverMatrix {

    public static void main(String[] args) {
        
        double[][] m1 = {{1, 2, 3}};
        double[][] m2 = {{(1/3.0)}, {50}, {6}};
        double[][] m3 = Matrix.multiply(m1, m2);
        
        
        Matrix.print(m1);
        System.out.println();
        Matrix.print(m2);
        System.out.println();
        Matrix.print(m3);

    }

}
