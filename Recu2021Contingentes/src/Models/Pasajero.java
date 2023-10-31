package Models;

import Filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Empresa {
    private int precio;
    private int deuda;

    public Pasajero(String nombre, String destino, LocalDate fechaIda, LocalDate fechaVuelta) {
        super(nombre, destino, fechaIda, fechaVuelta);
    }

    @Override
    public int getPrecio(){
        return precio;
    }

    @Override
    public int getDeuda(){
        return deuda;
    }

    @Override
    public int getCantAlumnos(){
        return 1;
    }

    @Override
    public Empresa getAlumnoDeudaMayor(){
        return this;
    }

    @Override
    public List<Empresa> filtrar(Filtro filtro) {
        List<Empresa> res = new ArrayList<>();
        if(filtro.cumple(this)) //me devuelvo a mi mismo
            res.add(this);

        return res;
    }


    //Como es el mas simple me copia asi mismo con todos mis parametros
    @Override
    public Empresa copiar() {
        return new Pasajero(getNombre(),getDestino(),getFechaIda(),getFechaVuelta());
    }
}
