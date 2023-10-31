package Filtros;
import Models.*;
import Filtros.Filtro;
public class CondicionDestino implements Filtro {
private String destino;

    public CondicionDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public boolean cumple(Empresa empresa){
        return empresa.getDestino().equals(destino);
    }
}
