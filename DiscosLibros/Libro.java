public class Libro extends Publicacion {
        private int numPaginas;
        private int añoPublicacion;

        public Libro (String titulo , float precio , int numPaginas , int añoPublicacion){
            super(titulo , precio);
            this.numPaginas = numPaginas;
            this.añoPublicacion = añoPublicacion;
        }

        public void mostrar(){
            System.out.println("Numero de paginas : " + numPaginas);
            System.out.println("Año de publicacion : " + añoPublicacion);
        }
}
