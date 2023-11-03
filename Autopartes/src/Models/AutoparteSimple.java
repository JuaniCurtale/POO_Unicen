package Models;

import Filters.*;
import Models.*;
import Calculator.*;

import java.util.*;

public class AutoparteSimple extends Autoparte {
    private float peso;
    private float huella;
    private List<String> materiales= new ArrayList<>();

    public AutoparteSimple(String marca, float peso,float huella,  List<String> materiales){
        super(marca);
        this.peso = peso;
        this.huella = huella;
        this.materiales = materiales;
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
        int cant = 0;
        if(f.cumple(this))
            cant++;
        return cant;
    }


    @Override
    public float calcularCosto(Calculador calc) {
        float res = calc.calcular(peso);
        return res;
    }
}
