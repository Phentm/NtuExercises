package OOP.section2.Ex_09;

public class TestMain {

    public static void main(String[] args) {
        
        // Testing MyTriangle class
        MyPoint v1 = new MyPoint(0, 0);
        MyPoint v2 = new MyPoint(3, 0);
        MyPoint v3 = new MyPoint(1.5, 2.598);
        MyTriangle t1 = new MyTriangle(v1, v2, v3);
        
        
        // Testing toString
        System.out.println(t1);
        
        System.out.println(t1.getPerimiter());
        
        System.out.println(t1.getType());
    }

}
