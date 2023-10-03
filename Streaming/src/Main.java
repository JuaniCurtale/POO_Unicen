import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> generoPelicula1 = new ArrayList<String>();
        generoPelicula1.add("Guerra");
        generoPelicula1.add("Ciencia Ficcion");

        List<String> generoPelicula2 = new ArrayList<String>();
        generoPelicula2.add("Documental");
        generoPelicula2.add("Terror");

        List<String> generoPelicula3 = new ArrayList<String>();
        generoPelicula3.add("Documental");
        generoPelicula3.add("Drama");

        List<String> generoPelicula4 = new ArrayList<String>();
        generoPelicula4.add("Infantil");
        generoPelicula4.add("Historia");

        List<String> actoresPelicula1 = new ArrayList<String>();
        actoresPelicula1.add("Will Smith");
        actoresPelicula1.add("Ricardo Darin");

        List<String> actoresPelicula2 = new ArrayList<String>();
        actoresPelicula2.add("Marc Hami");
        actoresPelicula2.add("Brad Pitt");
        actoresPelicula2.add("Will Smith");

        List<String> actoresPelicula3 = new ArrayList<String>();
        actoresPelicula3.add("Nicolas Rosani");
        actoresPelicula3.add("Will Smith");

        List<String> actoresPelicula4 = new ArrayList<String>();
        actoresPelicula4.add("Geronimo P");
        actoresPelicula4.add("Agustin Campo");



        Pelicula pelicula1 = new Pelicula("StarWars","Pelea en el espacio", generoPelicula1,"Darin",actoresPelicula1,2022,119,15);
        Pelicula pelicula2 = new Pelicula("Luna llena","no c", generoPelicula2,"Facu",actoresPelicula2,1989,65,13);
        Pelicula pelicula3 = new Pelicula("bajo mil lunas","no c33", generoPelicula3,"Tiki",actoresPelicula3,1998,99,13);
        Pelicula pelicula4 = new Pelicula("Nada","no c", generoPelicula4,"Facu",actoresPelicula4,2020,88,13);

        pelicula1.addGenero("Comedia");
        pelicula1.addGenero("Documental");

        Catalogo catalogo = new Catalogo();
        catalogo.addPelicula(pelicula1);
        catalogo.addPelicula(pelicula2);
        catalogo.addPelicula(pelicula3);
        catalogo.addPelicula(pelicula4);


        System.out.println(catalogo.getPeliculasConXNombre("luna").toString());
        System.out.println(catalogo.getPeliculasConXGenero("Guerra").toString());
        System.out.println(catalogo.getPeliculasConXActorYSinDirector("Will Smith","TuVieja"));

        System.out.println(catalogo.getPeliculaAntesXAnioYConMenosDeXminutos(2015,90));

        System.out.println("La pelicula dada sera o no rentable " + catalogo.esRentable(pelicula1));
        System.out.println("La pelicula dada sera o no rentable " + catalogo.esRentable(pelicula2));
        System.out.println("La pelicula dada sera o no rentable " + catalogo.esRentable(pelicula3));
        System.out.println("La pelicula dada sera o no rentable " + catalogo.esRentable(pelicula4));

    }
    }
