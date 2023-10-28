package Filtros;

import Filtros.Filtro;
import Models.Seguro;

public class FiltroDNI implements Filtro {
    private int dni;
    public FiltroDNI(int dni){
        this.dni = dni;
    }

    @Override
    public boolean cumple(Seguro seguro){
        return dni == seguro.getDni();
    }
}
