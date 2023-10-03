package candy;

public class Ficha {
    private String nombre;
    private int fortaleza;
    private int espacio;
    private int destruccion;

    public Ficha(String nombre,int fortaleza, int espacio, int destruccion){
        this.nombre=nombre;
        this.fortaleza=fortaleza;
        this.espacio=espacio;
        this.destruccion=destruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public int getEspacio() {
        return espacio;
    }

    public int getDestruccion() {
        return destruccion;
    }
}
