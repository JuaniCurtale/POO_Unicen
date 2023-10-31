package Models;

import Filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contingente extends Empresa {


    //EN LA LISTA DE CONDICIONES DEBEN CUMPLIR TODOS PARA QUE SEA VALIDO?
    private List<Filtro> condiciones;
    private List<Empresa> grupos;

    public Contingente(String nombre, String destino, LocalDate fechaIda, LocalDate fechaVuelta, List<Filtro> condiciones) {
        super(nombre, destino, fechaIda, fechaVuelta);
        this.condiciones = condiciones;
        this.grupos = new ArrayList<>();
    }

    public List<Filtro> getCondiciones(){
        return new ArrayList<>(condiciones);
    }

    public void limpiarLista (List<Filtro> condiciones){
        condiciones.clear();
    }

    public void limpiarUltimaCondicion(List<Filtro> condiciones){
        condiciones.remove(condiciones.size());
    }

    public void addCondiciones(Filtro condicion){
        condiciones.add(condicion);
    }

    public void addContingente(Empresa empresa){
        boolean acepta = true;
        for(Filtro filtro:getCondiciones()) { //recorro mi lista de condiciones
            if (!filtro.cumple(empresa)) { //si mi contingente no cumple no lo agrego
                acepta = false;
                break;
            }
        }
        if(acepta) //si cumple,si
            grupos.add(empresa);
    }


    @Override
    public int getPrecio(){
        int acu= 0;
        for(Empresa empresa: grupos){
            acu += empresa.getPrecio(); //recorro mi listaDeElementos y obtengo su precio(si es simple getprecio, si es compuesto, se mete recursivamente hasta la hoja)
        }
        return acu;
    }

    @Override
    public int getCantAlumnos(){
        int acu=0;
        for(Empresa empresa:grupos){
            acu+= empresa.getCantAlumnos(); //idem getPrecio
        }
        return acu;
    }

    @Override
    public int getDeuda(){
        int acu=0;
        for(Empresa empresa: grupos){
            acu+= empresa.getDeuda(); //idem getPrecio
        }
        return acu;
    }

    @Override
    public Empresa getAlumnoDeudaMayor() {
        int max = -1;
        Empresa alumno = null;//XD
        return alumno;
    }

    @Override
    public List<Empresa> filtrar(Filtro filtro) {
        List<Empresa> res = new ArrayList<>();
            for(Empresa empresa : grupos) { //recorro toda mi lista
                 res.addAll(empresa.filtrar(filtro)); //agrego todos con el addAll, con el empresa.fitrar(filtro) lo que hago es agregar solo mis contingentes/pasajeros que cumplen
            }
            return res;
    }



    @Override
    public Empresa copiar() {
    //primero me copio a mi como contingente
        Contingente copia = new Contingente(getNombre(),getDestino(),getFechaIda(),getFechaVuelta(),getCondiciones());
        //despues recorro mi lista y voy copiando a mi copia
        for(Empresa empresa:grupos){
            copia.addContingente(empresa.copiar());
    }
        //retorno copia
        return copia;
    }

}
