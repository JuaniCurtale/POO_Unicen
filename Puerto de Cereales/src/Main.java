import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Camion> colaCamiones = new PriorityQueue<Camion>();
        Queue<Barco> colaBarcos = new PriorityQueue<Barco>();

        colaBarcos.add(new Barco("Titanic",1000));
        colaBarcos.add(new Barco("Atlantis",689));
        colaBarcos.add(new Barco("Emperator",912));

        LocalDate fechaPetrobras = LocalDate.of(2002,7,23);
        LocalDate fechaYPF = LocalDate.of(1947,9,23);
        LocalDate fechaShell = LocalDate.of(1982,12,21);
        colaCamiones.add(new Camion("Petrobras",fechaPetrobras));
        colaCamiones.add(new Camion("YPF", fechaYPF));
        colaCamiones.add(new Camion("Shell",fechaShell));

        //Hasta que termine de vaciar los camiones y el barco
        while (!colaBarcos.isEmpty() && !colaCamiones.isEmpty()){
            //guardo el primer barco en barco y quito el barco de mayor capacidad en mi colaBarcos
            Barco barco = colaBarcos.poll();
            //idem con camiones
            Camion camion = colaCamiones.poll();

            System.out.println("Cargando " + barco.getNombre() + " con " + camion.getNombre());
        }


        }
    }
