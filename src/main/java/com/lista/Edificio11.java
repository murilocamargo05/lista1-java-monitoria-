package com.lista;
import java.util.List;
import java.util.ArrayList;

public class Edificio11 {
    public List<Apartamento11> apartamentos = new ArrayList<>();
    
    public void adicionarAp(Apartamento11 ap){
        if(apartamentos.size() >= 3){
            System.out.println("edificio cheio");
        }else{
            apartamentos.add(ap);
        }
    }

    public void listarAps(){
        for (Apartamento11 ap : apartamentos){
            System.out.println("apartamento " + ap.getId());
        }
    }

    public void buscarAps(int busca){
        boolean encontrado = false;
        for(Apartamento11  ap: apartamentos){
            if(ap.getId() == busca){
                System.out.println("a busca retornou o ap de id:" + ap.getId());
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("a busca nao retornou nenhum ap");
    }
}
