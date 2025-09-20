package com.lista;


public class Porta8 {
    private boolean isOpen;
    static int numAberturas = 0;

    public void abrir(){
        this.isOpen = true;
        numAberturas++;
    }

    public void fechar(){
        this.isOpen = false;
    }

    public static int getnumAberturas(){
        return numAberturas;
    }

    public boolean isOpen(){
        return isOpen;
    }

}
