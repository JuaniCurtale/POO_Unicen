import java.io.File;
import java.util.List;

public abstract class Elemento {
    private String nombre;
    public Elemento (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public abstract int getPeso();
    public abstract int getPrecio();
    public abstract int getCantProductos();
    public abstract String getMarca();
    public abstract int getVolumen();
    public abstract List<String> getCaracteristicas();
    public abstract boolean envioGratis();
    public abstract List<Elemento> buscar(Filtro filtro);
    public abstract Elemento copiaRestringida(Filtro filtro);


}
