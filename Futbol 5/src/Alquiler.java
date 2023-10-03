import java.time.LocalDate;

public class Alquiler {
    private LocalDate fecha;
    private int idCancha;
    private int precioAlquiler;

    public Alquiler(int idCancha, LocalDate fecha, int precioAlquiler){
        this.idCancha=idCancha;
        this.fecha=fecha;
        this.precioAlquiler=precioAlquiler;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }
}
