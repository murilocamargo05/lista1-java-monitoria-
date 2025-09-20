package com.lista;


public class Eq2Grau7 {
    public double a, b, c;

    public Eq2Grau7(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta(){
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double raiz1(){
        double d = delta();
        if(d >= 0){
            return (-this.b + Math.sqrt(d)) / (2 * this.a);
        }
        else{
            return Double.NaN;
        }
    }

    public double raiz2(){
        double d = delta();
        if(d >= 0){
            return (-this.b - Math.sqrt(d)) / (2 * this.a);
        }
        else{
            return Double.NaN;
        }
    }
}
