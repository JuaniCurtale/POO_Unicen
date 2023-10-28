package Filtros;

import Filtros.Filtro;
import Models.Seguro;

public class FiltroMontoAseguradoMayor implements Filtro {
    private float monto;
    public FiltroMontoAseguradoMayor(float monto){
        this.monto = monto;
    }

    @Override
    public boolean cumple(Seguro seguro){
        return seguro.getMonto() < monto;
    }
}
