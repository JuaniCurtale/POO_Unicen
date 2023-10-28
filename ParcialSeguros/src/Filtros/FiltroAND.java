package Filtros;

import Models.Seguro;

public class FiltroAND implements Filtro {
    Filtro f1;
    Filtro f2;
    public FiltroAND(Filtro f1, Filtro f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Seguro seguro){
        return f1.cumple(seguro) && f2.cumple(seguro);
    }
}
