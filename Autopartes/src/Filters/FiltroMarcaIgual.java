package Filters;

import Filters.*;
import Models.*;
import Calculator.*;

import java.util.*;

public class FiltroMarcaIgual implements Filtro {
    private String marca;

    public FiltroMarcaIgual(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean cumple(Autoparte autoparte) {
        return autoparte.getMarca().equals(marca);
    }
}
