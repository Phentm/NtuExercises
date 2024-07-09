package OOP.section2.Ex_09;

public class MyTriangle {
    
    private MyPoint v1, v2, v3;
    
    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this(v1.getX(), v1.getY(),
                v2.getX(), v2.getY(),
                v3.getX(), v3.getY());
    }
    
    @Override
    public String toString() {
        return String.format("MyTriangle[v1=%s,v2=%s,v3=%s]", v1, v2, v3);
    }
    
    public double getPerimiter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }
    
    public String getType() {
        double side1 = Math.round(v1.distance(v2)),
                side2 = Math.round(v2.distance(v3)),
                side3 = Math.round(v3.distance(v1));
        
        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
