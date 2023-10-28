package Models;

import Filtros.Filtro;
import Models.Seguro;

import java.util.*;

public class SeguroIntegrador extends Seguro {
    private List<Seguro> listaSeguros = new ArrayList<>();
    private int dni;

    public SeguroIntegrador(int dni,List<Seguro> listaSeguros){
        this.listaSeguros = listaSeguros;
        this.dni = dni;
    }

    @Override
    public float getMonto(){
        float acu = 0;
        for(Seguro seguro: listaSeguros){
            acu = acu + seguro.getMonto();
        }
        return acu;
    }

    @Override
    public int getNroPoliza(){
        int max = -1;
        for(Seguro seguro: listaSeguros){
            int segActual = seguro.getNroPoliza();
            if(segActual > max)
                max = segActual;
        }
        return max;
    }

    @Override
    public int getDni(){
        return dni;
    }


    @Override
    public float calcularCosto(){
        float acu = 0;
        for(Seguro seguro: listaSeguros){
            acu = acu + seguro.calcularCosto();
        }
        return acu;
    }

    @Override
    public String getDescripcion() {
        String res = "";
        for(Seguro seguro:listaSeguros){
            res = res.concat(seguro.getDescripcion());
        }
        return res;
    }

    @Override
    public List<Seguro> filtrar(Filtro filtro){
        List<Seguro> solucion = new ArrayList<>();
        for(Seguro seguro:listaSeguros)
            solucion.addAll(seguro.filtrar(filtro));
        return solucion;
    }
}
