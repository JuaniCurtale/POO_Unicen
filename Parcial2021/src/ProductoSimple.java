import java.util.*;

public class ProductoSimple extends Elemento{
    private String marca;
    private int precio;
    private int peso;
    private int volumen;
    private List<String> caracteristicas;

    public ProductoSimple(String nombre,String marca,int precio,int peso,int volumen){
        super(nombre);
        this.marca = marca;
        this.precio = precio;
        this.peso = peso;
        this.volumen = volumen;
        List<String> caracteristicas = new ArrayList<>();
    }

    public String getNombre(){
        return super.getNombre();
    }

    @Override
    public int getPrecio(){
        return precio;
    }

    @Override
    public int getPeso(){
        return peso;
    }

    public void addCaracteristica(String caracteristica){
        caracteristicas.add(caracteristica);
    }
    @Override
    public List<String> getCaracteristicas(){
        return new ArrayList<>(caracteristicas);
    }

    @Override
    public String getMarca(){
        return marca;
    }

    @Override
    public int getVolumen(){
        return volumen;
    }

    @Override
    public int getCantProductos() {
        return 1;
    }

    @Override
    public List<Elemento> buscar(Filtro filtro){
        List<Elemento> res = new ArrayList<>();
        if(filtro.cumple(this))
            res.add(this);
        return res;
    }

    @Override
    public Elemento copiaRestringida(Filtro filtro){
        if(filtro.cumple(this))
            return new ProductoSimple(getNombre(),getMarca(),getPrecio(),getPeso(),getVolumen());
        return null;
    }

}
