import java.util.*;
import java.util.Collections;

public class ClubDeFutbol5 {
    private List<Socio> listaSocios = new ArrayList<>();
    private List<Alquiler> listaAlquileres = new ArrayList<>();

    public ClubDeFutbol5(List<Socio>listaSocios,List<Alquiler> listaAlquileres){
        this.listaSocios=listaSocios;
        this.listaAlquileres = listaAlquileres;
    }

    public void addSocio(Socio socio){
        listaSocios.add(socio);
    }

    public List<Socio> getSociosCuotaImpagaOrdenados(){
        List<Socio> sociosMorosos = new ArrayList<>();
        for(Socio socio: listaSocios) {
            if (!socio.isUltimaCuotaPaga()) {
                sociosMorosos.add(socio);
            }
        }

        //ordenamiento
        Comparator<Socio> comparadorApellido = new ComparadorAscApellido();
        Comparator<Socio> comparadorNombre = new ComparadorAscNombre();
        ComparadorCompuesto comparadorCompuesto = new ComparadorCompuesto();
        comparadorCompuesto.addComparador(comparadorApellido);
        comparadorCompuesto.addComparador(comparadorNombre);
        Collections.sort(sociosMorosos,comparadorCompuesto);

        return sociosMorosos;
    }

    public List<Socio> getAlquiloCanchaN(int canchaN){
        List<Socio> listaSociosCanchaN = new ArrayList<Socio>();
        for(Socio socio:listaSocios){
            int cantAlquileres = socio.contarAlquileresCancha(canchaN);
            if(cantAlquileres>0){
                listaSociosCanchaN.add(socio);
            }
            }
        Comparator<Socio> comparadorCantAlquileres = new ComparadorAscAlquilerCancha();

        Collections.sort(listaSociosCanchaN, comparadorCantAlquileres);
        return listaSociosCanchaN;
        };

    public List<Socio> getSociosMenoresOrdenados(){
        List<Socio> sociosMenores = new ArrayList<>();
        for (Socio socio: listaSocios){
           if (socio.getEdad()<18){
               sociosMenores.add(socio);
           }
        }

        Comparator<Socio> comparadorEdad = new ComparadorAscEdad();

        Collections.sort(sociosMenores,comparadorEdad);
        return sociosMenores;
    }

    /*
    public List<Socio> getPagoMasDe500(){
        List<Socio> masDe500NoDeudor = new ArrayList<>();
        List<Socio> masDe500Deudor = new ArrayList<>();
        for(Socio socio: listaSocios){

            if (socio.getAlquileresCancha().size() != 0){
                for(Alquiler alquiler: listaAlquileres){
                    if (alquiler.getPrecioAlquiler() > 500){
                        if(socio.isUltimaCuotaPaga())
                            masDe500NoDeudor.add(socio);
                        else
                            masDe500Deudor.add(socio);
                    }
                }
            }
        }
        Comparator<Socio> compadorAscNombre = new ComparadorAscNombre();
        Comparator<Socio> compadorAscApellido = new ComparadorAscApellido();
        ComparadorCompuesto comparadorCompuesto = new ComparadorCompuesto();
        comparadorCompuesto.addComparador(compadorAscApellido);
        comparadorCompuesto.addComparador(compadorAscNombre);

        Collections.sort(masDe500NoDeudor,comparadorCompuesto);
        Collections.sort(masDe500Deudor,comparadorCompuesto);
        masDe500NoDeudor.addAll(masDe500Deudor);

        return masDe500NoDeudor;
    }*/
}
