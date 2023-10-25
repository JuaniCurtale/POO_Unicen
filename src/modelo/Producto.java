package modelo;

import Filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public abstract class Producto{
    protected int id;
    protected float valor;

    protected int mesesAntiguedad;

    protected String descrip;
    public Producto(int id,float valor, int mesesAntiguedad, String descrip) {
        this.id = id;
        this.valor = valor;
        this.mesesAntiguedad = mesesAntiguedad;
        this.descrip = descrip;
    }

    public String getDescrip(){
        return descrip;
    }
    public int getId(){
        return id;
    }

    public abstract int getMesesAntiguedad();
    public abstract float getValor();

    public List<Producto> buscar(Filtro f) {
        List<Producto> res = new ArrayList<>();
        if (f.cumple(this)) {
            res.add(this);
        }
        return res;
    }

}