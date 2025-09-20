package com.lista;


public class Churrasco1 {
    double qtdCarne;

    public double verificarConsumo(Pessoa1 pessoa){
        if((pessoa.vegetariana) || pessoa.idade >= 0 && pessoa.idade <=3){
            qtdCarne = 0;
        }
        else if(pessoa.idade <=12){
            qtdCarne = 1;
        }else{
            qtdCarne = 2;
        }
        return qtdCarne;
    }

}
