package candy.utils;

import candy.Ficha;

public abstract class ComparadorFicha {
    private int valorAComparar;
    public ComparadorFicha(int valorAComparar){
        this.valorAComparar=valorAComparar;
    }

    public int getValorAComparar() {
        return valorAComparar;
    }

    public abstract int filtro(Ficha ficha);
}
