public class ColaDoble extends Cola{
    private Cola colaModificada;

    public ColaDoble(Cola colaModificada) {
        this.colaModificada = colaModificada;
    }

    @Override
    public void add(Object o) {
        colaModificada.add(o);
        colaModificada.add(o);
    }

    @Override
    public Object get() {
        return colaModificada.get();
    }

    @Override
    public int cantTotalElementos() {
        return colaModificada.cantTotalElementos();
    }

    @Override
    public ColaTerminal colaTerminalConMasElem() {
        return colaModificada.colaTerminalConMasElem();
    }

    @Override
    public int cantColasTerminales() {
        return colaModificada.cantColasTerminales();
    }
}
