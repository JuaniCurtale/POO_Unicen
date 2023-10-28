package Calculadora;

import Calculadora.Calculadora;

public class CalculadoraFija implements Calculadora {
    private float montoFijo;
    public CalculadoraFija(float montoFijo){
        this.montoFijo = montoFijo;
    }

    @Override
    public float calcularCosto(float montoFijo){
        return montoFijo;
    }
}
