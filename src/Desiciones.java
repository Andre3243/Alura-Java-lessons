public class Desiciones {

     public static void main(String[] args) {
        int fechaDelanzamiento = 1999;
        boolean incluideInPlan = true;
        double  notaDelaPelicula = 8.2;
        String plan = "plus";

        if (fechaDelanzamiento >= 2022 ){
            System.out.println("Peliculas mas populares ");

        }else {
            System.out.println("Peliculas antiguas que te pueden gustar ");
        }
// un simple ejercicio de if
        if (incluideInPlan || plan.equals("plus")){
// metodo equals
            System.out.println("La pelicula esta incluida en el plan");
        }else {
            System.out.println("Mejorar el plan para poder acceder a este contenido");
        }

    }
}
