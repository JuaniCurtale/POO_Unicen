import java.util.*;
public class Catalogo {
    private List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();


    public void addPelicula(Pelicula p) {
        listaPeliculas.add(p);
    }


    public List<Pelicula> getPeliculasConXNombre(String palabraClave) {
        List<Pelicula> peliculasConXNombre = new ArrayList<Pelicula>();
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getTitulo().toLowerCase().contains(palabraClave.toLowerCase())) {
                peliculasConXNombre.add(pelicula);
            }
        }
        return peliculasConXNombre;
    }

    public List<Pelicula> getPeliculasConXGenero(String genero) {
        List<Pelicula> peliculasConXGenero = new ArrayList<Pelicula>();
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getGeneros().contains(genero)) {
                peliculasConXGenero.add(pelicula);
            }
        }
        return peliculasConXGenero;
    }

    public List<Pelicula> getPeliculasConXActorYSinDirector(String actor, String director) {
        List<Pelicula> peliculasCumpleCondiciones = new ArrayList<Pelicula>();
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getActores().contains(actor) && !pelicula.getDirector().contains(director)) {
                peliculasCumpleCondiciones.add(pelicula);
            }

        }
        return peliculasCumpleCondiciones;
    }

    public List<Pelicula> getPeliculaAntesXAnioYConMenosDeXminutos(int anio, int minutos){
        List<Pelicula> cumpleCondiciones = new ArrayList<Pelicula>();
        for(Pelicula pelicula: listaPeliculas){
            if(pelicula.getAnioEstreno()< anio && pelicula.getDuracion() < minutos){
                cumpleCondiciones.add(pelicula);
            }
        }
        return cumpleCondiciones;
    }

    public boolean esRentable (Pelicula pelicula){
        if(pelicula.getAnioEstreno()>2017 && !(pelicula.getGeneros().contains("Infantil")||pelicula.getGeneros().contains("Documental"))){
            return true;
        }
        if(pelicula.getDuracion() < 120 && !pelicula.getGeneros().contains("Comedia")){
            return true;
        }
        return false;
    }
}