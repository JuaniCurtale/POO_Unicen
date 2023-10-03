import java.time.LocalDate;
import java.util.*;
import java.util.Comparator;

public class Socio{

    private String nombre;
    private String apellido;
    private int edad;
    private boolean ultimaCuotaPaga;
    private List<Alquiler> alquileresCancha = new ArrayList<Alquiler>();

    public Socio(String nombre,String apellido,int edad, boolean ultimaCuotaPaga){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.ultimaCuotaPaga=ultimaCuotaPaga;
        this.alquileresCancha= new ArrayList<Alquiler>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isUltimaCuotaPaga() {
        return ultimaCuotaPaga;
    }

    public List<Alquiler> getAlquileresCancha(){
        return alquileresCancha;
    }
    public void alquilarCancha(int idCancha, LocalDate fecha, int precioAlquiler){
        Alquiler alquiler = new Alquiler(idCancha,fecha,precioAlquiler);
        alquileresCancha.add(alquiler);
    }


    public static Comparator<Socio> comparadorEdad = new Comparator<Socio>(){
     @Override
        public int compare(Socio socio1,Socio socio2){
         return socio1.edad - socio2.edad;
     }
    };

    public static Comparator<Socio> comparatorNombreApellido = new Comparator<Socio>() {
        @Override
        public int compare(Socio o1, Socio o2) {
            int compararPorNombre = o1.nombre.compareTo(o2.nombre);
            if(compararPorNombre ==0){
                return o1.apellido.compareTo(o2.apellido);
            }
                return compararPorNombre;
        }
    };

    public int contarAlquileresCancha(int canchaN){
        int cantVecesAlquilada=0;
        for(Alquiler alquiler: alquileresCancha){
            if (alquiler.getIdCancha() == canchaN){
                cantVecesAlquilada++;
            }
        }
        return cantVecesAlquilada;
    }

    public static Comparator<Socio> comparadorVecesQueAlquiloCancha = new Comparator<Socio>() {
        @Override
        public int compare(Socio o1, Socio o2) {
            return o2.contarAlquileresCancha(13)-  o1.contarAlquileresCancha(13);
        }
    };

    @Override
    public String toString() {
        return  nombre + " "+ apellido + " " +
                edad + " ";
    }
}
