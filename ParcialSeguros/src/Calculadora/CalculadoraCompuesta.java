package Calculadora;

import Calculadora.Calculadora;

import java.util.*;

public class CalculadoraCompuesta implements Calculadora {
    private List<Calculadora> calculadores = new ArrayList<>();

    public CalculadoraCompuesta(List<Calculadora> calculadores){
        this.calculadores = calculadores;
    }

    @Override
    public float calcularCosto(float montoAsegurado){
        float res = 0f;
        for(Calculadora calculador: calculadores){ //recorro cada calculador y le voy calculando el costo
            res += calculador.calcularCosto(montoAsegurado);
        }
        return res;
    }

    public void addCalculador(Calculadora calculadora){
        calculadores.add(calculadora);
    }
}
