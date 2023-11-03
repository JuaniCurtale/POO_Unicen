package Filters;

import Filters.*;
import Models.*;
import Calculator.*;

import java.util.*;

public class FiltroHuellaMayor implements Filtro {
    private float huella;

    public FiltroHuellaMayor(float huella) {
        this.huella = huella;
    }

    @Override
    public boolean cumple(Autoparte autoparte) {
        return autoparte.getHuella() > huella;
    }
}
