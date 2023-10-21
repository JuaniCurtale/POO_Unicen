public class Imagen extends MiembroPagina{
    private float alto;
    private float ancho;


    public Imagen(float tamanio, float alto, float ancho){
        super(tamanio);
        this.alto = tamanio;
        this.ancho = tamanio;
    }

    @Override
    public float getPesoEnBytes(){
        return alto*ancho;
    }

    @Override
    public void modificarTamanio(float escala){
        super.modificarTamanio(escala)////;
    }
}