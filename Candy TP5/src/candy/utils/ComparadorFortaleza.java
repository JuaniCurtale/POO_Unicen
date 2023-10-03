package candy.utils;
import candy.Ficha;

public class ComparadorFortaleza extends ComparadorFicha{
    public ComparadorFortaleza(int valorAEvaluar){
        super(valorAEvaluar);
    }
    @Override
    public int filtro(Ficha ficha) {
        return (ficha.getFortaleza() - getValorAComparar());
    }
}

