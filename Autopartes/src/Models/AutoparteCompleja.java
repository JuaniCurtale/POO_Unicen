package Models;

import Filters.*;
import Models.*;
import Calculator.*;

import java.util.*;

public class AutoparteCompleja extends AutoparteSimple {
    private float peso;
    private float huella;
    private List<String> materiales= new ArrayList<>();

    public AutoparteCompleja(String marca, float huella, float peso,List<String> materiales){
        super(marca,peso,huella,materiales);
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public List<String> getMateriales() {
        return new ArrayList<>(materiales);
    }

    @Override
    public float getHuella() {
        return huella;
    }

    @Override
    public int cantSegunFiltro(Filtro f) {
        return super.cantSegunFiltro(f);
    }

    @Override
    public float calcularCosto(Calculador calc) {
        return super.calcularCosto(calc);
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }
}
