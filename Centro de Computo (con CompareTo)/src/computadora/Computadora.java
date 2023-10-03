package computadora;

//Implemente la interfaz Comparable
public class Computadora implements Comparable<Computadora>{
    private String nombre;
    private int velocidad;

    public Computadora(String nombre, int velocidad){
        this.nombre=nombre;
        this.velocidad=velocidad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    public String getNombre(){
        return nombre;
    }

    public int getVelocidad(){
        return velocidad;
    }

    //Sobreescribo con el Override
    //hago el ordenamiento de mayor a menor
    @Override
    public int compareTo(Computadora otraComputadora){
        return otraComputadora.velocidad - this.velocidad;
    }

}
