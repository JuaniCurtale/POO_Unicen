import computadora.Computadora;

public class Main {
    public static void main(String[] args) {
        CentroDeComputo centro = new CentroDeComputo();

        centro.agregarProceso(new Proceso("Proceso1", 4));
        centro.agregarProceso(new Proceso("Proceso2", 2));
        centro.agregarProceso(new Proceso("Proceso3", 3));

        centro.agregarComputadora(new Computadora( "Compu1",2));
        centro.agregarComputadora(new Computadora("Compu2", 4));

        centro.ejecutarProcesos();
    }
}