package OOP.section1;

public class Ball {
    
    private float x, y, xDelta, yDelta;
    private int radius;
    
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
        this.radius = radius;
    }
    
    public float getX() { return x; } public void setX(float x) { this.x = x; }
    
    public float getY() { return y; } public void setY(float y) { this.y = y; }
    
    public int getRadius() { return radius; }
    
    public void setRadius(int radius) { this.radius = radius; }
    
    public float getXDelta() { return xDelta; } 
    
    public void setXDelta(float xDelta) { this.xDelta = xDelta; }
    
    public float getYDelta() { return yDelta; } 
    
    public void setYDelta(float yDelta) { this.yDelta = yDelta; }
    
    public void move() { x += xDelta; y += yDelta; }
    
    public void reflectHorizontal() { xDelta *= -1; }
    
    public void reflectVertical() { yDelta *= -1; }
    
    @Override
    public String toString() {
        return String.format("Ball[(%.1f,%.1f),speed=(%.1f,%.1f)]",
                x, y, xDelta, yDelta);
    }
    
}
