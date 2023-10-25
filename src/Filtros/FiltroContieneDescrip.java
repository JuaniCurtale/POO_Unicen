package Filtros;

import Filtros.Filtro;
import modelo.Producto;

public class FiltroContieneDescrip implements Filtro {
    private String valor;

    public FiltroContieneDescrip(String valor){
        this.valor = valor;
    }

    @Override
    public boolean cumple(Producto producto){
        return producto.getDescrip().contains(valor);
    }

}
