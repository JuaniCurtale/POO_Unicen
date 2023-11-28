public class EstrategiaAzar implements Estrategia{
    @Override
    public Cola elegirSubcola(ColaCompuesta cola) {
        int pos = (int) (Math.random()*cola.cantSubcolas());
        return cola.getSubcola(pos);
    }
}
