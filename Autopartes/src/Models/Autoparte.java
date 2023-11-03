package Models;

import Filters.*;
import Models.*;
import Calculator.*;

import java.util.*;

public abstract class Autoparte {
    private String marca;
    public Autoparte(String marca){
        this.marca = marca;
    }

    public String getMarca(){return marca;}

    public abstract float getPeso();
    public abstract List<String> getMateriales();
    public abstract float getHuella();
    public abstract int cantSegunFiltro(Filtro f);
    public abstract float calcularCosto(Calculador calc);
}
