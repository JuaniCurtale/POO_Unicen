public class FiltroContieneCaracteristica implements Filtro{
    private String caracteristica;

    public FiltroContieneCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getCaracteristicas().contains(caracteristica);
    }
}
