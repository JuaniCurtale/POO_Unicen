public class Parrafo extends MiembroPagina{
    private String contenido;
    public Parrafo(float tamanio,String contenido) {
        super(tamanio);
        this.contenido = contenido;
    }
    ////
    public int getPeso(){
        return contenido.length();
    }
}
