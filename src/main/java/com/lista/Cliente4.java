package com.lista;

public class Cliente4 {

    private String nome;
    private double saldo, limite;

    public Cliente4(String nome, double saldo, double limite){
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public double checarSaldo(){
        return this.saldo + this.limite;
    }

    public String getNome(){
        return this.nome;
    }

    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
        else if(this.limite + this.saldo >= valor){
            //usar limite
            double resto = valor - this.saldo;
            this.saldo = 0;
            this.limite -= resto;
       }
       else{
            System.out.println("saldo e limite menor que valor que deseja sacar.");
       }

    }

    public void depositar(double valor){

        if(valor > 0){
            this.saldo += valor;
        }else{
            System.out.println("o valor a ser depositado deve ser maior que zero");
        }
    }
    


}
