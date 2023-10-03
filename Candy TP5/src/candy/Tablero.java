package candy;

import candy.utils.ComparadorFortaleza;
import candy.Ficha;

import java.util.*;
public class Tablero{
    private int puntajeMinimo;
    private List<Ficha> listaFichas;

    public Tablero(int puntajeMinimo, List<Ficha> listaFichas) {
        this.puntajeMinimo = puntajeMinimo;
        this.listaFichas = listaFichas;
    }

    public double calcularDificultad(){
        int sumatoriaFortaleza = 0;
        int sumatoriaDestruccion = 0;

        for(Ficha ficha: listaFichas){
            sumatoriaFortaleza += ficha.getFortaleza();
            sumatoriaDestruccion += ficha.getDestruccion();
        }

        return (double) sumatoriaFortaleza/sumatoriaDestruccion;
    }
    public boolean pasaDeNivel(int puntajeActual){
        return puntajeActual>=puntajeMinimo;
    }

    public List<Ficha> devolverCumpleFortaleza(int N){
        List<Ficha> cumpleFortaleza = new ArrayList<>();
        for(Ficha ficha: listaFichas){
            if(ficha.getFortaleza()>= N)
                cumpleFortaleza.add(ficha);
        }
        Comparator<Ficha> comparadorFortaleza = new ComparadorFortaleza(N);
        Collections.sort(cumpleFortaleza,comparadorFortaleza);

        return cumpleFortaleza;
    }

}
