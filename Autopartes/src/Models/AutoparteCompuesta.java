package Models;

import Filters.*;
import Models.*;
import Calculator.*;

import java.util.*;


public class AutoparteCompuesta extends Autoparte {
    private List<Autoparte> listaAutopartes = new ArrayList<>();
    private float peso;
    private float huella;

    public AutoparteCompuesta(String marca, List<Autoparte> listaAutopartes,float peso,float huella){
        super(marca);
        this.listaAutopartes = listaAutopartes;
        this.peso = peso;
        this.huella = huella;
    }

    public void addAutoparte(Autoparte autoparte, Filtro filtro){
        if (filtro.cumple(autoparte)) {
            listaAutopartes.add(autoparte);
        }
    }



    @Override
    public float getPeso() {
        float acu = 0;
        for(Autoparte autoparte: listaAutopartes)
            acu =+ autoparte.getPeso();
        return acu;
    }

    @Override
    public List<String> getMateriales() {
        Set<String> materiales = new HashSet<>();
        for(Autoparte autoparte:listaAutopartes)
            for(String material: autoparte.getMateriales())
                materiales.add(material);
        List<String>res = new ArrayList<>(materiales);
        return res;
    }

    @Override
    public float getHuella() {
        float max1=-1;
        float max2 = -1;
        for(Autoparte autoparte:listaAutopartes){
            if((autoparte.getHuella() > max1) || (autoparte.getHuella() > max1)){
                if(autoparte.getHuella()> max1)
                    max1 = autoparte.getHuella();
                else
                    max2 = autoparte.getHuella();
            }
        }
        return max1 + max2;
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public int cantSegunFiltro(Filtro f) {
        int cant = 0;
        if(f.cumple(this))
            return 1;

        for(Autoparte autoparte:listaAutopartes) {
            if(f.cumple(autoparte))
                cant++;
        }
        return cant;
    }

    @Override
    public float calcularCosto(Calculador calc) {
        float costo = 0;
        for(Autoparte autoparte:listaAutopartes){
            costo += calc.calcular(autoparte.getPeso());
        }
        return costo;
    }
}
