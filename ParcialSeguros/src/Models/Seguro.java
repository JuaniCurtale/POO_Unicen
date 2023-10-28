package Models;

import Filtros.Filtro;

import java.util.List;

public abstract class Seguro {

    public Seguro(){}
    public abstract float calcularCosto();
    public abstract int getDni();
    public abstract float getMonto();
    public abstract int getNroPoliza();
    public abstract String getDescripcion();

    public abstract List<Seguro> filtrar(Filtro filtro);
}
