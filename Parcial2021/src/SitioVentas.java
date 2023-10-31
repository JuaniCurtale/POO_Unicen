import java.util.List;

public class SitioVentas {
    private List<Filtro> politicas;
    private List<Elemento> productosEnVenta;

    public SitioVentas(List<Filtro> politicas, List<Elemento> productosEnVenta) {
        this.politicas = politicas;
        this.productosEnVenta = productosEnVenta;
    }

    public void addPoliticas(Filtro filtro){
        politicas.add(filtro);
    }

    public void addProducto(Elemento elemento){
        productosEnVenta.add(elemento);
    }

    public boolean esEnvioGratis(Elemento elemento) {
    }

    public int getPrecio(Elemento elemento){
        return elemento.getPrecio();
    }

    public int getPeso(Elemento elemento){
        return elemento.getPeso();
    }

    public int getCantProductos(ProductoCompuesto combo){
        return combo.getCantProductos();
    }
    public int getCantCaracteristicasCombo(ProductoCompuesto combo){
        return combo.getCaracteristicas().size();
    }

    public List<String> getCaracteristicas(Elemento elemento){
       return elemento.getCaracteristicas();
    }

}
