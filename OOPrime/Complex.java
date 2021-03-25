package OOPrime;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

public class Complex {
    double real;
    double imag;

    
    Complex(){
        this.real = 0;
        this.imag = 0;
    }

    Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public String toString(){
        return "("+real+imag+"i)";
    }

    public boolean isReal(){
        if(real >0){
            return true;
        }else{
            return false;
        }
    }
    public boolean isImag(){
        if(imag >0){
            return true;
        }else{
            return false;
        }
    }
    public boolean equals(double real, double imag){
        if(this.real == real && this.imag == imag){
            return true;
        }else{
            return false;
        }
    }

    public boolean equals(Complex complex){
        if(complex.getReal() == this.real && complex.getImag()==this.imag){
            return true;
        }else{
            return false;
        }
    }
    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }
    public double argument(){
        return Math.atan2(real, imag);
    }
    public Complex add(Complex complex){
        this.real += complex.real;
        this.imag += complex.imag;

        return this;
    }
    public Complex substract(Complex complex){
        this.real -= complex.real;
        this.imag -= complex.imag;

        return this;
    }
    public Complex multiply(Complex complex){
        this.real = (this.real*complex.real ) - (this.imag*complex.imag);
        this.imag = (this.real*complex.imag) +(this.imag*complex.real);

        return this;
    }
    public Complex divide(Complex complex){
        Complex comp = multiply(complex);
        this.real = comp.real/((complex.real*complex.real)+(complex.imag*complex.imag));
        this.imag = comp.imag/((complex.real*complex.real)+(complex.imag*complex.imag));

        return this;
    }

    public Complex conjugate(){
        this.imag = -this.imag;

        return this;
    }

    public Complex addNew(Complex complex){
        double newReal = this.real+complex.real;
        double newImag= this.imag+complex.imag;

        return new Complex(newReal, newImag);

    }
    public Complex substractNew(Complex complex){
        double newReal = this.real-complex.real;
        double newImag= this.imag-complex.imag;

        return new Complex(newReal, newImag);

    }

}
