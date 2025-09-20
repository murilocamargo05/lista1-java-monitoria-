

package com.lista;


public class Telefone12 {

    public String ddd, numero;

    public Telefone12(String ddd, String numero){
        this.ddd = ddd;
        this.numero = numero;
    }


    public String obterNumero(){
        return this.numero;
    }

    public String obterDDD(){
        return this.ddd;
    }
}
