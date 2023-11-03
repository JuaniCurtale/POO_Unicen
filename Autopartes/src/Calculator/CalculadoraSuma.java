package Calculator;
import Filters.*;
import Models.*;
import Calculator.*;

import java.util.*;

public class CalculadoraSuma implements Calculador {
    private Calculador c1;
    private Calculador c2;

    public CalculadoraSuma(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public float calcular(float valor) {
        return c1.calcular(valor) + c2.calcular(valor);
    }
}
