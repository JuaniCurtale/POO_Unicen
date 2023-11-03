package Filters;

import Filters.*;
import Models.*;
import Calculator.*;

import java.util.*;

public class FiltroContieneMaterial implements Filtro {
    private String material;

    public FiltroContieneMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean cumple(Autoparte autoparte) {
        return autoparte.getMateriales().contains(material);
    }
}
