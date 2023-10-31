public class FiltroPrecioMayor implements Filtro{
    private int precio;

    public FiltroPrecioMayor(int precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getPrecio() > precio;
    }
}
