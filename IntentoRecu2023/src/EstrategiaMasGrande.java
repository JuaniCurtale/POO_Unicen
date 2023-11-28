public class EstrategiaMasGrande implements Estrategia{
    @Override
    public Cola elegirSubcola(ColaCompuesta cola) {
        return cola.subcolaConMasElementos();
    }
}
