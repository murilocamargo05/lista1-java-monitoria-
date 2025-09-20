
package com.lista;

import java.util.List;
import java.util.ArrayList;

public class Cliente12 {
    public String nome, cpf;
    Telefone12 telefone;
    public List<Telefone12> telefones = new ArrayList<>();


    public Cliente12(String nome, String cpf, Telefone12 telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        telefones.add(telefone);
    }


     public void mostrarDados(){
      System.out.println("nome: " + nome);
      System.out.println("cpf: " + cpf);
      System.out.println("telefones: ");
      for(Telefone12 t : telefones){
        System.out.println("("+ t.obterDDD()+")"+t.obterNumero());
      }
      
    }

    public void adicionarTel(Telefone12 telefone){
        telefones.add(telefone);
    }

}
