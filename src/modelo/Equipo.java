package modelo;

import java.util.List;

public class Equipo extends Producto {
    private String descrip;

    public Equipo(int id, int valor, int mesesAntiguedad, String descrip) {
        super(id, valor,mesesAntiguedad,descrip);
    }

    public int getMesesAntiguedad(){
        return mesesAntiguedad;
    }
    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "ID: " + id + "}" ;
    }
}