package Filters;
import Filters.*;
import Models.*;
import Calculator.*;

import java.util.*;

public class FiltroOR implements Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroOR(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Autoparte autoparte) {
        return f1.cumple(autoparte) || f2.cumple(autoparte);
    }
}
