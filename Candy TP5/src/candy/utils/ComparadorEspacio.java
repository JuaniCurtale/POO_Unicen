package candy.utils;
import candy.Ficha;

public class ComparadorEspacio extends ComparadorFicha{
    public ComparadorEspacio(int valorAEvaluar){
        super(valorAEvaluar);
    }
    @Override
    public int filtro(Ficha ficha) {
        return (ficha.getEspacio() - getValorAComparar());
    }
}

