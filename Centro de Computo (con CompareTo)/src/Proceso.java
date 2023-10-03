public class Proceso implements Comparable<Proceso>{
    private String nombreProceso;
    private int requerimientoMemoria;

    public Proceso(String nombreProceso,int requerimientoMemoria){
        this.nombreProceso=nombreProceso;
        this.requerimientoMemoria=requerimientoMemoria;
    }

    public String getNombreProceso() {
        return nombreProceso;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    public int getRequerimientoMemoria() {
        return requerimientoMemoria;
    }

    public void setRequerimientoMemoria(int requerimientoMemoria) {
        this.requerimientoMemoria = requerimientoMemoria;
    }

    @Override
    public int compareTo(Proceso otroProceso){
        return otroProceso.requerimientoMemoria - this.requerimientoMemoria;
    }
}
