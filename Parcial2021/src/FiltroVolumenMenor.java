public class FiltroVolumenMenor implements Filtro {
    private int vol;

    public FiltroVolumenMenor(int vol) {
        this.vol = vol;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getVolumen() < vol;
    }
}
