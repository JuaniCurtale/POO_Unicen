package modelo;

import Filtros.Filtro;

import java.util.List;

public class Combo extends Producto {

    private List<Producto> combo;

    public Combo(int id, float valor, int mesesAntiguedad ,String descrip,List<Producto> combo) {
        super(id,valor, mesesAntiguedad, descrip);
        this.combo = combo;
    }

    @Override
    public float getValor(){
        float valorAcu = 0;
        for(Producto equipo: combo){
            valorAcu += equipo.getValor();
        }
        return valorAcu;
    }

    @Override
    public int getMesesAntiguedad(){
        int antMax = 0;
        for(Producto equipo: combo){
            if(equipo.getMesesAntiguedad()> antMax)
                antMax = equipo.getMesesAntiguedad();
        }
        return antMax;
    }

    public void addEquipoAlCombo(Producto producto){
        combo.add(producto);
    }

    @Override
    public List<Producto> buscar(Filtro f) {
        List<Producto> res = super.buscar(f);
        for (Producto producto : combo) {
            res.addAll(producto.buscar(f));
        }
        return res;
    }

    @Override
    public String toString() {
        return "CombOOo{" + "ID: " + getId() + "}" + combo +
                ']' ;
    }
}