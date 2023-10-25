package Filtros;

import Filtros.Filtro;
import modelo.Producto;

public class FiltroIgualCodigoVerificacion implements Filtro {

    private int valor;
    public FiltroIgualCodigoVerificacion(int valor){
        this.valor = valor;
    }

    public boolean cumple(Producto producto){
        return producto.getId() == valor;
    }
}
