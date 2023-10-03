import computadora.Computadora;

import java.util.*;
public class CentroDeComputo {
    private List<Computadora> computadorasDisponibles = new ArrayList<>();

    //Creo una cola de prioridad para los procesos
    private Queue<Proceso> colaProcesos = new PriorityQueue<>();

    public void agregarProceso(Proceso proceso){
        colaProcesos.add(proceso);
    }

    public void agregarComputadora(Computadora computadora){
        computadorasDisponibles.add(computadora);
        Collections.sort(computadorasDisponibles);
    }


    public void ejecutarProcesos(){
        while (!computadorasDisponibles.isEmpty() && !colaProcesos.isEmpty()){
            //Saca el proceso de la cola de procesos (el que tiene el mayor requerimiento de memoria).
            Proceso proceso = colaProcesos.poll();
            //Saca la computadora más rápida de la lista de computadoras disponibles.
            Computadora computadora = computadorasDisponibles.remove(0);

            System.out.println("Ejecutando proceso " + proceso.getNombreProceso());
        }
    }

}