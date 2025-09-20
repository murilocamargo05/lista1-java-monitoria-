
package com.lista;

public class Transferencia9 {
    public void transferir(Cliente4 c1, Cliente4 c2, double quantia){
        if(c2.checarSaldo() < quantia){
            System.out.println("saldo insuficiente para transação");
        }else{
            //transferir de c2 para c1
            c2.sacar(quantia);
            c1.depositar(quantia);
            System.out.println("transferencia realizada com sucesso da conta de " + c2.getNome() + " para " + c1.getNome() + " na quantia de " + quantia);
        }
    }
}
