package Filtros;

import Filtros.Filtro;
import Models.*;
public class FiltroDeudaMayorAMitadPrecio implements Filtro {


    @Override
    public boolean cumple(Empresa empresa){
        return empresa.getDeuda() > empresa.getPrecio()/2;
    }
}
