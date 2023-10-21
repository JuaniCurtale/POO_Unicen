public abstract class MiembroPagina {

    private float tamanio;

    public MiembroPagina (float tamanio){
        this.tamanio = tamanio;
    }

    public abstract int getPeso();
    public float getTamanio(){
        return  tamanio;
    };////
    public  void modificarTamanio(float escala){
        this.tamanio = tamanio * escala;
    }



}
