package Filters;

import Filters.*;
import Models.*;
import Calculator.*;

import java.util.*;

public class FiltroPesoMenor implements Filtro {
    private float peso;

    public FiltroPesoMenor(float peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(Autoparte autoparte) {
        return autoparte.getPeso() < peso;
    }
}
