package OOP.section2.Ex_07;

public class TestMain {

    public static void main(String[] args) {
        
        // Testing all MyLine public methods
        MyPoint beg1 = new MyPoint(), end1 = new MyPoint(10, 15);
        MyLine l1 = new MyLine(beg1, end1);
        MyLine l2 = new MyLine(-5, -15, 25, 17);
        
        //Testing toString()
        System.out.println(l1);
        System.out.println(l2);
        
        // Test getters and setters
        System.out.printf("Line 1: %s - %s\n",l1.getBegin(), l1.getEnd());
        System.out.printf("Line 2: %s - %s\n",l2.getBegin(), l2.getEnd());
        System.out.printf("Line 1 start: %d, %d\n", l1.getBeginX(), l1.getBeginY());
        System.out.printf("Line 2 end: %d, %d\n", l2.getEndX(), l2.getEndY());
        
        l1.setBeginXY(-1, -1);
        l2.setEndXY(35, 27);
        System.out.printf("Line 1: %s - %s\n",l1.getBegin(), l1.getEnd());
        System.out.printf("Line 2: %s - %s\n",l2.getBegin(), l2.getEnd());
        
        // Testing length function
        System.out.printf("Line 1 length is: %.2f\n", l1.getLength());
        System.out.printf("Line 2 length is: %.2f\n", l2.getLength());
        
        // Testing line gradient function
        System.out.printf("Line 1 gradient is: %f\n", l1.getGradient());
    }

}
