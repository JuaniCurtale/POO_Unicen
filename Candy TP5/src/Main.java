import candy.Ficha;
import candy.Tablero;
import candy.utils.ComparadorFortaleza;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Ficha chocolate = new Ficha("Chocolate", 1, 1, 0);
        Ficha piedra = new Ficha("Piedra", 6, 1, 0);
        Ficha carameloARayas = new Ficha("Caramelo a Rayas", 1, 1, 10);
        Ficha pastel = new Ficha("Pastel", 4, 4, 4);


        List<Ficha> fichas = new ArrayList<>();
        fichas.add(chocolate);
        fichas.add(piedra);
        fichas.add(carameloARayas);
        fichas.add(pastel);

        int puntajeMinimo = 100;

        Tablero tablero = new Tablero(puntajeMinimo,fichas);

        List<Ficha> cumplenFortaleza = new ArrayList<>();
        ComparadorFortaleza comparadorFortaleza = new ComparadorFortaleza(3);


        System.out.println("Dificultad: " + tablero.calcularDificultad());
        System.out.println("Pasa de nivel: " + tablero.pasaDeNivel(1000));

        }
}



