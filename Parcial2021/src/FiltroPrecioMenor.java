public class FiltroPrecioMenor implements Filtro{

        private int precio;

        public FiltroPrecioMenor(int precio) {
            this.precio = precio;
        }

        @Override
        public boolean cumple(Elemento elemento) {
            return elemento.getPrecio() < precio;
        }
}

