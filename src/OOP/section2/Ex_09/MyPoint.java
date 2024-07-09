package OOP.section2.Ex_09;

public class MyPoint {
    
    private double x, y;
    
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; } public void setX(double x) { this.x = x; }

    public double getY() { return y; } public void setY(double y) { this.y = y; }
    
    public double[] getXY() {
        double[] coord = {x, y};
        return coord;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return String.format("(%f,%f)", x, y);
    }
    
    public double distance(double x, double y) {
        double dx = x - this.x, dy = y - this.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }
    
    public double distance() {
        return distance(0, 0);
    }
    
}
