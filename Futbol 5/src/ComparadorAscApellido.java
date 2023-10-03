import java.util.Comparator;

public class ComparadorAscApellido implements Comparator<Socio> {
    @Override
    public int compare (Socio o1,Socio o2){
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
