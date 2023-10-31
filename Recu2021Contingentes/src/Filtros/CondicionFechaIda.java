package Filtros;

import Filtros.Filtro;
import Models.*;
import java.time.LocalDate;

public class CondicionFechaIda implements Filtro {
    private LocalDate fechaIda;

    public CondicionFechaIda(LocalDate fechaIda) {
        this.fechaIda = fechaIda;
    }

    @Override
    public boolean cumple(Empresa empresa){
        return empresa.getFechaIda() == fechaIda;
    }
}