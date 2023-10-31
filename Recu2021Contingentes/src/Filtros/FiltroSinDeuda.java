package Filtros;

import Filtros.Filtro;
import Models.*;

public class FiltroSinDeuda implements Filtro {

    @Override
    public boolean cumple(Empresa empresa){
        return empresa.getDeuda() == 0;
    }
}
