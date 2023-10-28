package Calculadora;

import Calculadora.Calculadora;

public class CalculadoraPorcentual implements Calculadora {
    private float porcentaje;
    public CalculadoraPorcentual(float porcentaje){
        this.porcentaje = porcentaje;
    }

    @Override
    public float calcularCosto(float montoAsegurado){
        return montoAsegurado*porcentaje;
    }
}
