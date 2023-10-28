package Models;

import Calculadora.Calculadora;
import Filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public class SeguroSimple extends Seguro {
    private int nroPoliza;
    private String descripcion;
    private float montoAsegurado;
    private int dni;
    private Calculadora calculadora;

    public SeguroSimple(int nroPoliza,String descripcion,float montoAsegurado, int dni,Calculadora calculadora){
        this.nroPoliza = nroPoliza;
        this.descripcion = descripcion;
        this.montoAsegurado = montoAsegurado;
        this.dni = dni;
        this.calculadora = calculadora;
    }

    @Override
    public float getMonto(){
        return montoAsegurado;
    }


    @Override
    public int getNroPoliza(){
        return nroPoliza;
    }

    public void setCalculadora(Calculadora calculadorPoliza){
        this.calculadora = calculadorPoliza;
    }

    //entenderlo bien
    @Override
    public float calcularCosto(){
        return calculadora.calcularCosto(montoAsegurado);
    }



    @Override
    public int getDni(){
        return dni;
    }
    @Override
    public String getDescripcion(){
        return descripcion;
    }

    @Override
    public List<Seguro> filtrar(Filtro filtro){
        List<Seguro> solucion = new ArrayList<>();
        if(filtro.cumple(this))
            solucion.add(this);
        return solucion;
    }

}
