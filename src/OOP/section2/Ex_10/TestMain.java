package OOP.section2.Ex_10;

public class TestMain {

    public static void main(String[] args) {
        
        // Testing MyRectangle class
        MyPoint topL = new MyPoint(0, 5), botR = new MyPoint(5, 0);
        MyRectangle rect = new MyRectangle(topL, botR);
        
        System.out.println(rect);
        
        System.out.println(rect.getArea());
        
        System.out.println(rect.getCircumference());
        
    }

}
