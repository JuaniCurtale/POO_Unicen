package Filters;

import Filters.*;
import Models.*;
import Calculator.*;

import java.util.*;
public class CalculadorFija implements Calculador {

    public CalculadorFija() {
    }

    @Override
    public float calcular(float valor) {
        return valor;
    }
}
