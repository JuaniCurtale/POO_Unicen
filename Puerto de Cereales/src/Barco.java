public class Barco implements Comparable<Barco>{
    private String nombre;
    private int capacidad;

    Barco(String nombre, int capacidad){
        this.nombre=nombre;
        this.capacidad=capacidad;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCapacidad(){
        return capacidad;
    }

    //ordenamiento de mayor a menor
    public int compareTo(Barco otroBarco){
        return otroBarco.capacidad - this.capacidad;
    }
}
