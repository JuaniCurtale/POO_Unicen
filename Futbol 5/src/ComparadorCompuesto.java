import java.util.Comparator;
import java.util.Vector;

public class ComparadorCompuesto implements Comparator<Socio> {
    private Vector<Comparator<Socio>>  comparadores = new Vector<>();
    @Override
    public int compare (Socio o1, Socio o2){
        for(Comparator<Socio> comp: comparadores){
            int res = comp.compare(o1,o2);
            if(res != 0)
                return res;
        }
        return 0;
    }

    public void addComparador(Comparator<Socio> comparador){
        comparadores.add(comparador);
    }
}