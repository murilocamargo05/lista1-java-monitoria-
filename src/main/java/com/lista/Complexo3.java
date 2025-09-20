
package com.lista;


public class Complexo3 {

    double real, img;

    public Complexo3(double real, double img){
        this.real = real;
        this.img = img;
    }

    public Complexo3 soma(Complexo3 other){
        double somaReal  = real + other.real;
        double somaImg = img + other.img;
        return new Complexo3(somaReal, somaImg);
    }

    public Complexo3 mult(Complexo3 other){
        //parte real = (a * c − b * d) parte imaginária = (a * d + b * c)
        double multReal = ((real * other.real) - (img * other.img));
        double multImg = ((real * other.img) + (img * other.real));
        return new Complexo3(multReal, multImg);
    }

    @Override
    public String toString(){
        return real + (img >= 0 ? " + " : " - ") + Math.abs(img) + "i";
    }

    public double modulo(){
        return Math.sqrt((this.real*this.real) + (this.img*this.img));
    }

    public double argumentoPrincipal(){
        //atan2(double y, double x)	Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).
        return Math.atan2(this.img, this.real);
    }

    
}
