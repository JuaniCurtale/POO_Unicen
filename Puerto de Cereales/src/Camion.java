import java.time.LocalDate;

public class Camion implements Comparable<Camion>{
    private String nombre;
    private LocalDate fechaDeCarga;

    public Camion(String nombre, LocalDate fechaDeCarga){
        this.nombre=nombre;
        this.fechaDeCarga=fechaDeCarga;
    }

    public String getNombre(){
        return nombre;
    }

    public LocalDate getFechaDeCarga(){
        return fechaDeCarga;
    }

    //Ordeno ascentemente las fechas de la mas vieja a la actual
    @Override
    public int compareTo(Camion otroCamion){
        return this.fechaDeCarga.compareTo(otroCamion.fechaDeCarga);
    }
}
