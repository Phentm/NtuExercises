package OOP.section2.Ex_08;

public class TestMain {

    public static void main(String[] args) {
        
        // Testing all MyCircle public methods
        MyPoint p1 = new MyPoint(13, -18), p2 = new MyPoint(7, 3);
        MyCircle c1 = new MyCircle(), 
                c2 = new MyCircle(p1, 4), 
                c3 = new MyCircle(-9, 14, 6);
        
        // Testing toString()
        System.out.println(c1);
        System.out.println(c2);
        
        // Testing getters and setters
        System.out.println(c2.getRadius());
        c2.setRadius(7);
        System.out.println(c2.getRadius());
        
        System.out.println(c1.getCenter());
        c1.setCenter(p2);
        System.out.println(c1.getCenter());
        
        // Testing getArea() getCircumference() and distance()
        System.out.println(c3);
        System.out.println(c3.getArea());
        System.out.println(c3.getCircumference());
        System.out.println(c3.distance(c1));
        
    }

}
