import java.util.List;

public class Seccion {
    private List<MiembroPagina> miembros;

    public float getPeso(){
        int total = 0;
        for(MiembroPagina miembroPagina: miembros){
            total = total + miembroPagina.getPeso();
        }
        return total;
    }
}////
