import java.util.List;

public class Pagina extends MiembroPagina{
        private Seccion parrafos;
        private Seccion imaganes;
        private List<Pagina> vinculos;
        private List<MiembroPagina> miembros;
        private float tamanio;

        public Pagina(List<String> parrafos, List<Imagen> imaganes, List<Vinculo> vinculos, float tamanio) {
                this.parrafos = parrafos;
                this.imaganes = imaganes;
                this.vinculos = vinculos;
                this.tamanio = tamanio;
        }
//

        public int getpeso(){
                int cant = 0;
                for(MiembroPagina miembroPagina: miembros){
                        cant = cant + miembroPagina.getPeso();
               }
                for(Pagina pagina: vinculos){
                        cant = cant + pagina.getpeso();
                }
        }


        public void addPieDePagina(List<String> parrafos,String pie){
                parrafos.add(0,pie);
        }

        public Pagina copia(){
                return this;
        }

}
