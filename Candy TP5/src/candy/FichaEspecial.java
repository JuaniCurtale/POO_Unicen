package candy;

public class FichaEspecial extends Ficha{
    public FichaEspecial(String nombre, int fortaleza, int espacio, int destruccion){
        super(nombre, fortaleza, espacio, destruccion);
    }

    public int getDestruccion(){
        return getFortaleza()/getEspacio();
    }
}
