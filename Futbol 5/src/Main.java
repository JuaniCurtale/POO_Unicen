import java.time.LocalDate;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Socio> socios = new ArrayList<Socio>();
        List<Alquiler> alquileres = new ArrayList<Alquiler>();

        ClubDeFutbol5 River = new ClubDeFutbol5(socios,alquileres);

        Socio socio1 = new Socio("Juani","Curtale",15,false);
        Socio socio2 = new Socio("Santiago","Curtale",17,false);
        Socio socio3 = new Socio("Natalia","Benvenuto",40,false);
        Socio socio4 = new Socio("Felipe","Saide",21,false);
        Socio socio5 = new Socio("Agustin","Campo",22,false);

        River.addSocio(socio1);
        River.addSocio(socio2);
        River.addSocio(socio3);
        River.addSocio(socio4);
        River.addSocio(socio5);

        socio1.alquilarCancha(13, LocalDate.of(2023,9,23),600);
        socio1.alquilarCancha(12, LocalDate.of(2023,9,23),600);
        socio1.alquilarCancha(13, LocalDate.of(2023,9,23),600);
        socio2.alquilarCancha(5, LocalDate.of(2023,5,18),900);
        socio3.alquilarCancha(9, LocalDate.of(2023,3,13),200);
        socio4.alquilarCancha(12, LocalDate.of(2023,9,9),800);
        socio4.alquilarCancha(12, LocalDate.of(2023,9,9),800);
        socio5.alquilarCancha(13, LocalDate.of(2023,3,13),400);
        socio5.alquilarCancha(13, LocalDate.of(2023,3,13),400);
        socio5.alquilarCancha(13, LocalDate.of(2023,3,13),400);
        socio5.alquilarCancha(13, LocalDate.of(2023,3,13),400);


        System.out.println("Los socios morosos son: " + River.getSociosCuotaImpagaOrdenados().toString());
        System.out.println("Los socios menores son: " + River.getSociosMenoresOrdenados().toString());;
        System.out.println("Los socios que mas alquilaron la cancha n son: " + River.getAlquiloCanchaN(12));
        //System.out.println("Socio : " + River.getPagoMasDe500());
    }
}


