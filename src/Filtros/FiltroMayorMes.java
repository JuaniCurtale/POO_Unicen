package Filtros;

import Filtros.Filtro;
import modelo.Producto;

public class FiltroMayorMes implements Filtro {

    private int valor;
    public FiltroMayorMes(int valor){
        this.valor = valor;
    }
    @Override
    public boolean cumple(Producto producto){
        return producto.getMesesAntiguedad() > valor;
    }


}
