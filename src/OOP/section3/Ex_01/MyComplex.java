package OOP.section3.Ex_01;

import java.text.DecimalFormat;

public class MyComplex {
    
    private double real, imag;
    
    public MyComplex() { this.real = 0.0; this.imag = 0.0; }
    
    public MyComplex(double real, double imag) {
        this.real = real; this.imag = imag;
    }
    
    public void setReal(double real) { this.real = real; }
    public void setImag(double imag) { this.imag = imag; }
    
    public double getReal() { return this.real; }
    public double getImag() { return this.imag; }
    
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    @Override
    public String toString() {
        DecimalFormat dfReal = new DecimalFormat("#.#");
        dfReal.setDecimalSeparatorAlwaysShown(true);
        dfReal.setMinimumFractionDigits(1);
        dfReal.setMaximumFractionDigits(340);
        DecimalFormat dfImag = (DecimalFormat)dfReal.clone();
        dfImag.setPositivePrefix("+");
        
        return String.format("%s%si", 
                dfReal.format(this.real), 
                dfImag.format(this.imag));
    }
    
    public boolean isReal() { return imag == 0; }
    public boolean isImaginary() { return real == 0; }
    
    public boolean equals(double real, double imag) {
        return (this.real == real) && (this.imag == imag);
    }
    
    public boolean equals(MyComplex another) {
        return equals(another.real, another.imag);
    }
    
    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }
    
    public MyComplex addInto(MyComplex right) {
        this.setValue(this.real + right.real, this.imag + right.imag);
        
        return this;
    }
    
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
}
