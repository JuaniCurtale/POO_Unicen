package modelo;

import modelo.Combo;
import modelo.Equipo;
import modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class Datos {

    public static Producto getRaiz() {
        // creo los datos

        Equipo compuJoaco = new Equipo(203,2,1,"No c");
        Equipo compuTiki = new Equipo(394,2,2,"Core i3");
        Equipo compuPajaro = new Equipo(405,7,3,"Rizen");
        Equipo compuSantos = new Equipo(111,5,6,"Core i3");
        Equipo compuNico = new Equipo(222,7,5,"Core i5");

        List<Producto> combo12 = new ArrayList<>();

        Combo combitoCaro = new Combo(22,0,12,"Core i3", combo12);
        combitoCaro.addEquipoAlCombo(compuSantos);
        combitoCaro.addEquipoAlCombo(compuNico);
        combitoCaro.addEquipoAlCombo(compuTiki);



        Combo raiz = new Combo(912,0,1,"",combo12);
        raiz.addEquipoAlCombo(compuPajaro);
        raiz.addEquipoAlCombo(compuJoaco);

        System.out.println("Combo size: " + combo12.size());


        // retorno los datos
        return raiz;
    }

}