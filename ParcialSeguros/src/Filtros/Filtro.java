package Filtros;

import Models.Seguro;

public interface Filtro {
    public boolean cumple(Seguro seguro);
}
