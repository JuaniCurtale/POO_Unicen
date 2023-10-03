import java.util.Comparator;

public class ComparadorAscEdad implements Comparator<Socio> {
    public int compare(Socio o1, Socio o2){
        return o1.getEdad() - o2.getEdad();
    }
}
