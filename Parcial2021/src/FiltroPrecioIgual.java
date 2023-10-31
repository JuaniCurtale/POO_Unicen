public class FiltroPrecioIgual implements Filtro{
    private int precio;

    public FiltroPrecioIgual(int precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getPrecio() == precio;
    }
}
