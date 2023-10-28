package Models;

import Filtros.Filtro;
import Models.Seguro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SeguroTransitorio extends Seguro {
    private int fechaInicio;
    private int fechaFin;
    private Seguro seguro; //esta informacion me la da lo siguiente:
    //puede ser de cualquier tipo de seguro existente.

    public SeguroTransitorio(int fechaInicio, int fechaFin,Seguro seguro){
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.seguro = seguro;
    }

    @Override
    public int getNroPoliza(){
        return seguro.getNroPoliza();
    }

    @Override
    public int getDni(){
        return seguro.getDni();
    }

    public boolean enFecha(){
        int anioActual = LocalDate.now().getYear();
        if(anioActual>= fechaInicio && anioActual<= fechaFin)
            return true;
        return false;
    }
    @Override
    public float getMonto(){
        if(enFecha())
            return seguro.getMonto();
        else
            return 0;
    }

    @Override
    public float calcularCosto(){
        if(enFecha()){
            return seguro.calcularCosto();
        }
        return 0;
    }

    @Override
    public String getDescripcion() {
        return seguro.getDescripcion();
    }

    @Override
    public List<Seguro> filtrar(Filtro filtro){
        List<Seguro> res = new ArrayList<>();
        if(enFecha())
            res.addAll(seguro.filtrar(filtro));
        return res;
    }

}
