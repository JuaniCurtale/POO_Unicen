public class EstrategiaIntercalado implements Estrategia{
    private int ultimoIndice;
    public EstrategiaIntercalado(int ultimoIndice){
        ultimoIndice = this.ultimoIndice;
    }

    @Override
    public Cola elegirSubcola(ColaCompuesta cola) {
        Cola retorno=null;
        if (ultimoIndice>=cola.cantSubcolas())
            ultimoIndice = 0;
        if (cola.cantSubcolas()>0)
            retorno = cola.getSubcola(ultimoIndice);
        ultimoIndice++;
        return retorno;
    }
}
