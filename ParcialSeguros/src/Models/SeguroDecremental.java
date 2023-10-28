package Models;

import Calculadora.Calculadora;

import java.time.LocalDate;
import java.util.*;

public class SeguroDecremental extends SeguroSimple {

    private LocalDate fechainicio;
    public SeguroDecremental(int nroPoliza, String descripcion, float montoAsegurado, int dni, LocalDate fechainicio, Calculadora calculadora){
        super(nroPoliza,descripcion,montoAsegurado,dni,calculadora);
        this.fechainicio = fechainicio;
    }

    @Override
    public float getMonto(){
        int diferenciaAnios = LocalDate.now().getYear() - fechainicio.getYear();
        if(diferenciaAnios == 0)
            return super.getMonto();
        return super.getMonto()/diferenciaAnios; //revisar desp
    }

    @Override
    public String getDescripcion(){
        return super.getDescripcion();
    }


}
