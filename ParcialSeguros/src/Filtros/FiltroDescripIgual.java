package Filtros;

import Models.Seguro;

public class FiltroDescripIgual implements Filtro{
    private String palabra;

    public FiltroDescripIgual(String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Seguro seguro){
        return seguro.getDescripcion().equals(palabra);
    }
}
