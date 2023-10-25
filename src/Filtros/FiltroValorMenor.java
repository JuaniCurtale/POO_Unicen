package Filtros;

import Filtros.Filtro;
import modelo.Producto;

public class FiltroValorMenor implements Filtro {

    private int valor;
    public FiltroValorMenor(int valor) {
        this.valor = valor;
    }

        @Override
        public boolean cumple(Producto producto){
            return producto.getValor() < valor;
        }

}
