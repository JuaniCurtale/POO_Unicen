package Calculator;

import Filters.*;
import Models.*;
import Calculator.*;

import java.util.*;

public class CalculadoraPorcentaje implements Calculador {
    private float porcentaje;

    public CalculadoraPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public float calcular(float valor) {
        return valor + valor * porcentaje;
    }
}
