package OOP.section1;

public class Rectangle {
    
    private float length, width;
    
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    
    public float getLength() {
        return length;
    }
    
    public void setLength(float length) {
        this.length = length;
    }
    
    public float getWidth() {
        return width;
    }
    
    public void setWidth(float width) {
        this.width = width;
    }
    
    public double getArea() {
        return width * length;
    }
    
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }
    
    @Override
    public String toString() {
        return "Rectangle[length=" + getLength() + ",width=" + getWidth() + "]";
    }
    
}
