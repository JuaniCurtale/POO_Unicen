package candy.utils;
import candy.Ficha;

public class ComparadorDestruccion extends ComparadorFicha{
    public ComparadorDestruccion(int valorAEvaluar){
        super(valorAEvaluar);
    }
    @Override
    public int filtro(Ficha ficha) {
        return (ficha.getDestruccion() - getValorAComparar());
    }
}
