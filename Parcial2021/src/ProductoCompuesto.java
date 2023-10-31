import java.util.*;
public class ProductoCompuesto extends Elemento{

    private List<Elemento> productosContenidos;

    public ProductoCompuesto(String nombre,List<Elemento> productosContenidos){
        super(nombre);
        this.productosContenidos = productosContenidos;
    }

    @Override
    public int getPeso(){
        int acu =0;
        for(Elemento elemento:productosContenidos){
            acu += elemento.getPeso();
        }
        return acu;
    }

    @Override
    public int getPrecio(){
        int acu =0;
        for(Elemento elemento:productosContenidos){
            acu += elemento.getPrecio();
        }
        return acu;
    }

    public int getCantProductos(){
        int acu =0;
        for(Elemento elemento:productosContenidos)
            acu+=elemento.getCantProductos();
    return acu;
    }

    @Override
    public int getVolumen(){
        int max=-1;
        for(Elemento elemento:productosContenidos) {
            if (elemento.getVolumen() > max)
                max = elemento.getVolumen();
        }
        return max;
    }

    @Override
    public String getMarca(){
        return productosContenidos.get(0).getMarca();
    }

    @Override
    public List<String> getCaracteristicas(){
        Set<String> caracteristicas = new HashSet<>();
        for(Elemento elemento:productosContenidos){
            caracteristicas.addAll(elemento.getCaracteristicas());
        }
        return new ArrayList<>(caracteristicas);
    }

    @Override
    public List<Elemento> buscar(Filtro filtro){
        List<Elemento> res = new ArrayList<>();
        for(Elemento elemento:productosContenidos)
            res.addAll(elemento.buscar(filtro));

        return res;
    }

    public void addElemento(Elemento elemento){
        productosContenidos.add(elemento);
    }

    @Override
    public Elemento copiaRestringida(Filtro filtro){

        ProductoCompuesto produC = new ProductoCompuesto(getNombre(),getPeso(),getPrecio(),getVolumen(),getMarca());
        if(filtro.cumple(this))
            return new ProductoSimple(getNombre(),getMarca(),getPrecio(),getPeso(),getVolumen());
    }

}
