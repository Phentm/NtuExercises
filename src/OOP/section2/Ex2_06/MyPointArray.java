package OOP.section2.Ex2_06;

public class MyPointArray {

    public static void main(String[] args) {
        
        MyPoint[] pts = new MyPoint[10];
        for (int i = 0; i < pts.length; i++) {
            pts[i] = new MyPoint(i+1, i+1);
        }
        
        for (MyPoint pt : pts)
            System.out.println(pt);
        
    }

}
