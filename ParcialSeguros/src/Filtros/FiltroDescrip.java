package Filtros;

import Models.Seguro;

public class FiltroDescrip implements Filtro{
    private String palabra;

    public FiltroDescrip (String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Seguro seguro){
        return seguro.getDescripcion().contains(palabra);
    }
}
