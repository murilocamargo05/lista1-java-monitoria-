package com.lista;

import java.util.Random;


public class Adivinha6 {
    public Random random = new Random();
    private int sorteado;

    public void sortear(){
        this.sorteado = random.nextInt(100);
    }

    public String adivinhar(int guess){
        return guess == this.sorteado ? "voce acertou o numero" : "voce errou";
    }

}
