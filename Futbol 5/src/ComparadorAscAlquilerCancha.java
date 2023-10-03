import java.util.Comparator;
public class ComparadorAscAlquilerCancha implements Comparator <Socio>{
    @Override
    public int compare (Socio o1,Socio o2){
        return o1.getAlquileresCancha().size() - o2.getAlquileresCancha().size();
    }

}
