
package com.lista;


public class Lampada2 {
    Estado2 estado = Estado2.DESLIGADO;
    int totalAcendimentos =0 ;

    public void click(){
        estado = (estado == Estado2.DESLIGADO) ? Estado2.LIGADO : Estado2.DESLIGADO;
        qtdAcendimentos();

    }

    public int qtdAcendimentos(){
            if(estado == Estado2.LIGADO){
                totalAcendimentos++;
            }
            return totalAcendimentos;
    }

    public String checaEstado(){
        return(estado == Estado2.DESLIGADO ? "desligado" : "ligado");
    }


}
