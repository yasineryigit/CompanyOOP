public class Complex {

    private double real;
    private double imaginary;

    //Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //SETTERS
    public void setReal (double real){
        this.real = real;
    }
    public void setImaginary(double imaginary){
        this.imaginary=imaginary;
    }

    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }

    public Complex plus(Complex other){
        double sumReal=this.real+other.real;
        double sumImaginary=this.imaginary+other.imaginary;
        return new Complex(sumReal,sumImaginary);
    }

    public static void main(String[] args) {
        Complex a = new Complex(1.0,2.0);
        Complex b = new Complex(2.0,-1.0);
        Complex c = a.plus(b);
    }


}
