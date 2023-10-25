package modelo;

import modelo.Equipo;

public class EquiposConObsolecencia extends Equipo {
    private int cantidadMesesRestantes;

    public EquiposConObsolecencia(int valor, int mesesAntiguedad, int ID, String descrip, int cantidadMesesRestantes) {
        super(ID,valor,mesesAntiguedad,descrip);
        this.cantidadMesesRestantes = cantidadMesesRestantes;
    }

    @Override
    public float getValor(){
        if(getMesesAntiguedad()<cantidadMesesRestantes)
            return super.getValor();
        else
            return super.getValor() * 0.02f;
    }

    public int getCantidadMesesRestantes(){
        return cantidadMesesRestantes;
    }

}