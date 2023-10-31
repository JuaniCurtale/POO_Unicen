package Models;

import Filtros.Filtro;

import java.time.LocalDate;
import java.util.*;
public abstract class Empresa {
    private String nombre;
    private String destino;
    private LocalDate fechaIda;
    private LocalDate fechaVuelta;

    public Empresa(String nombre, String destino, LocalDate fechaIda, LocalDate fechaVuelta) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getFechaIda() {
        return fechaIda;
    }

    public LocalDate getFechaVuelta() {
        return fechaVuelta;
    }

    public abstract int getPrecio();
    public abstract int getDeuda();
    public abstract int getCantAlumnos();
    public abstract Empresa getAlumnoDeudaMayor();
    public abstract Empresa copiar();
    public abstract List<Empresa> filtrar(Filtro filtro);

}
