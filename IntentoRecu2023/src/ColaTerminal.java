import java.util.*;

public class ColaTerminal extends Cola{
    private List<Object> elementos;


    @Override
    public void add(Object o) {
        elementos.add(o);
    }

    @Override
    public Object get() {
        return elementos.remove(0);
    }

    @Override
    public ColaTerminal colaTerminalConMasElem() {
        return this; //yo al ser hoja soy la colaTerminal con mas elementos actual
    }

    @Override
    public int cantColasTerminales() {
        return 1;
    }

    @Override
    public int cantTotalElementos() {
        return elementos.size();
    }
}
