package Filtros;

import Filtros.Filtro;
import Models.*;
public class FiltroAnd implements Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Empresa empresa) {
        return f1.cumple(empresa) && f2.cumple(empresa);
    }
}
