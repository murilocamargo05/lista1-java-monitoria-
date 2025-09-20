package com.lista;


public class Casa10 {
    public String cor;
    public Porta8 portaEntrada;
    public Porta8 porta1;
    public Porta8 porta2;

    public Casa10(String cor){
        this.cor = cor;
        this.portaEntrada = new Porta8();
        this.porta1 = new Porta8();
        this.porta2 = new Porta8();
    }

    public void abrirPortaEntrada(){
        portaEntrada.abrir();
    }

    public void abrirPorta1(){
        porta1.abrir();
    }

    public void abrirPorta2(){
        porta2.abrir();
    }

   
    public void fecharPortaEntrada(){
        portaEntrada.fechar();
    }

    public void fecharPorta1(){
        porta1.fechar();
    }

    public void fecharPorta2(){
        porta2.fechar();
    }

    public int abertas(){
        int abertas = 0;
        if (portaEntrada.isOpen()) abertas++;
        if(porta1.isOpen()) abertas++;
        if(porta2.isOpen()) abertas++;
        return abertas;
    }
        
}
