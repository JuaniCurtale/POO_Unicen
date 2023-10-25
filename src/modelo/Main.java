package modelo;

import Filtros.*;

public class Main {
    public static void main(String[] args) {

        Producto raiz = Datos.getRaiz();


        Filtro f1 = new FiltroContieneDescrip("Core i5");

        System.out.println(raiz.buscar(f1));

        Filtro f2 = new FiltroMayorMes(5);
        Filtro f3 = new FiltroValorMenor(50000);

        Filtro f4 = new FiltroAnd(f2,f3);
        System.out.println(raiz.buscar(f4));

        Filtro f5 = new FiltroIgualCodigoVerificacion(203);
        System.out.println(raiz.buscar(f5));


    }
}