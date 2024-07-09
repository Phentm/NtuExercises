package OOP.section2.Ex_10;

public class MyRectangle {
    
    private MyPoint topL, botR;
    
    public MyRectangle(int x1, int y1, int x2, int y2) {
        topL = new MyPoint(x1, y1);
        botR = new MyPoint(x2, y2);
    }
    
    public MyRectangle(MyPoint topL, MyPoint botR) {
        this(topL.getX(), topL.getY(), botR.getX(), botR.getY());
    }
    
    @Override
    public String toString() {
        return String.format("MyRectangle[topLeft=%s,bottomRight=%s]", topL, botR);
    }
    
    public int getCircumference() {
        return (botR.getX() - topL.getX())*2 + (topL.getY() - botR.getY())*2;
    }
    
    public int getArea() {
        return (botR.getX()-topL.getX()) * (topL.getY()-botR.getY());
    }
    
    
}
