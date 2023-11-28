import java.util.*;

public class ColaCompuesta extends Cola{
    private List<Cola> subcolas;
    private Estrategia estratAzar;
    private Estrategia estrarIntercalado;

    public ColaCompuesta(Estrategia estratAzar, Estrategia estrarIntercalado) {
        this.estratAzar = estratAzar;
        this.estrarIntercalado = estrarIntercalado;
        subcolas = new ArrayList<>();
    }

    public void addSubcola(Cola cola){
        subcolas.add(cola);
    }

    public int cantSubcolas(){
        return subcolas.size();
    }

    public Cola getSubcola(int pos){
        return subcolas.get(pos);
    }

    @Override
    public void add(Object o) {
        estratAzar.elegirSubcola(this).add(o);
    }

    @Override
    public Object get() {
        return estratAzar.elegirSubcola(this).get();
    }

    @Override
    public int cantTotalElementos() {
        int acu = 0;
        for(Cola subcola:subcolas){
            acu += subcola.cantTotalElementos();
        }
        return acu;
    }

    @Override
    public ColaTerminal colaTerminalConMasElem() {
    ColaTerminal masActual = subcolas.get(0).colaTerminalConMasElem(); //arranco desde la primera rama de mis subcolas
    int cant = masActual.cantTotalElementos(); //guardo en variable la cantidad de elementos
    for(Cola subcola:subcolas){ //recorro todas mis subcolas
        ColaTerminal otra = subcola.colaTerminalConMasElem(); //obtengo el dato de otra subcola
        int cant2 = otra.cantTotalElementos(); //guardo ese valor en una variable
        if(cant2>cant){ //comparo y reemplazo
            masActual = otra;
            cant = cant2;
        }
    }
        return masActual; //devuelvo el mayor
    }

    @Override
    public int cantColasTerminales() {
        int acu = 0;
        for (Cola subcola : subcolas) { //Recorro mis subcolas
            acu += subcola.cantColasTerminales();
        }
        return acu;
    }

    public Cola subcolaConMasElementos() {
        Cola mayor = subcolas.get(0);
        int cantElementos = mayor.cantTotalElementos();
        for (Cola subcola : subcolas) {
            int cant = subcola.cantTotalElementos();
            if (cant > cantElementos) {
                mayor = subcola;
                cantElementos = cant;
            }
        }
        return mayor;
    }


}
