
package com.lista;


public class Triangulo5 {

    private double lado, perimetro, area;

    public Triangulo5(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return this.lado;
    }

    public double getPerimetro(){
        return this.perimetro;
    }

    public double getArea(){
        return this.area;
    }

    public double calcArea(){
        this.area = (this.lado * Math.sqrt(3))/2;
        return this.area;
    }

    public double calcPerimetro(){
        this.perimetro = 3 * this.lado;
        return this.perimetro;
    }



}
