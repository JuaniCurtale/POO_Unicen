package Filtros;

import Filtros.Filtro;
import Models.*;
public class FiltroDeudaMayorAValor implements Filtro {
    private int valor;

    public FiltroDeudaMayorAValor(int valor){
        this.valor = valor;
    }

    @Override
    public boolean cumple(Empresa empresa){
        return empresa.getDeuda() > valor;
    }
}
