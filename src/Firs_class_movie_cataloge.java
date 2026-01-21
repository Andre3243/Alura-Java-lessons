public class Firs_class_movie_cataloge {

    public static void main(String[] args) {

       String nombre  = "burrito";
        System.out.println(String.format("Bienvenido %s a Screen Match, tu cine de confianza",nombre));
// mensaje de bienvenida, usamos el metodo .format para poder agregar el string con el nombre.
        System.out.println("Pelicula: Matrix ");


        int fechaDelanzamiento = 1999;
        boolean incluideInPlan = true;
        double  notaDelaPelicula = 8.2;

        double media =  (8.2 + 6.0 + 9.0) / 3;
        System.out.println( media);

        String sinopsis = """
                Matrix es una paradoja 
                La mejor pelicula del fin del milenio 
                Fue lanzada en el año %s,teniendo una nota de %.1f
                """         .formatted(fechaDelanzamiento,notaDelaPelicula);
        System.out.println(sinopsis);

        int clasificacion = (int) (media  / 2);
        System.out.println(clasificacion);

    }
}


