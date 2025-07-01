package OOP.section3.Ex_01;

public class TestMain {

    public static void main(String[] args) {
        
        MyComplex complex1 = new MyComplex();
        
        MyComplex complex2 = new MyComplex(1, 2.255);
        
        System.out.println("---- Testing \"toString()\" method ----");
        System.out.println(complex1.toString());
        System.out.println(complex2.toString());
        System.out.println();
        
        System.out.println("---- Testing \"getReal() & setReal()\" method ----");
        complex2.setReal(0.51600001);
        System.out.println(complex2.getReal());
        complex2.setReal(1);
        System.out.println();
        
        System.out.println("---- Testing \"isReal() & isImaginary()\" method ----");
        MyComplex pureReal = new MyComplex(1, 0);
        MyComplex pureImag = new MyComplex(0, 1);
        System.out.println(pureReal.isReal() + " - " + pureImag.isImaginary());
        System.out.println();
        
        System.out.println("---- Testing \"equals() methods\" method ----");
        MyComplex complex3 = new MyComplex(1.3, -4.759);
        MyComplex complex4 = new MyComplex(1, 45);
        System.out.println(complex3.equals(1.3, -4.759));
        System.out.println(complex3.equals(complex4));
        complex4.setValue(1.3, -4.759);
        System.out.println(complex3.equals(complex4));
        System.out.println();
        
        System.out.println("---- Testing \"magnitude()\" method ----");
        System.out.println(complex3.magnitude());
        System.out.println();
        
        System.out.println("---- Testing \"addX()\" method ----");
        complex3.setValue(0, 0);
        complex4.setValue(1, 4.5);
        complex3.addInto(complex4);
        System.out.println(complex3);
        MyComplex complex5 = complex3.addNew(complex4);
        System.out.println(complex5);
        
    }

}
