import java.util.*;
public class Pelicula{

    private String titulo;
    private String sinopsis;
    private List<String> generos = new ArrayList<String>();
    private String director;
    private List<String> actores = new ArrayList<String>();
    private int anioEstreno;
    private int duracion;
    private int edadMinima;

    public String getTitulo(){
        return titulo;
    }

    public String getSinopsis(){
        return sinopsis;
    }

    public List<String> getGeneros(){
        return generos;
    }
    public String getDirector(){
        return director;
    }
    public List<String> getActores(){
        return actores;
    }
    public int getAnioEstreno(){
        return anioEstreno;
    }
    public int getDuracion(){
        return duracion;
    }
    public int getEdadMinima(){
        return edadMinima;
    }

    public Pelicula(String titulo, String sinopsis, List<String> generos, String director, List<String> actores, int anioEstreno, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.generos = generos;
        this.director = director;
        this.actores = actores;
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }
    public void addGenero(String genero){
        generos.add(genero);
    }



    @Override
    public String toString() {
        return titulo;
    }
}
