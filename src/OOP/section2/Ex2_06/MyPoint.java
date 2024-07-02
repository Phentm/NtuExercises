package OOP.section2.Ex2_06;

public class MyPoint {
    
    private int x, y;
    
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; } public void setX(int x) { this.x = x; }

    public int getY() { return y; } public void setY(int y) { this.y = y; }
    
    public int[] getXY() {
        int[] coord = {x, y};
        return coord;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
    
    public double distance(int x, int y) {
        int dx = x - this.x, dy = y - this.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }
    
    public double distance() {
        return distance(0, 0);
    }
    
}
