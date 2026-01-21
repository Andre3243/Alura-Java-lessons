import java.util.Scanner;

public class lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // creamos un escanner que apunte a la lectura de los datos proporcionados desde el teclado
        System.out.println("Escribe el nombre de tu pelicula favorita");
        // mandammos a imprimir este mensaje pidiendo el nombre de su pelicula favorita
        String pelicula = teclado.nextLine();
        // ahora creamos un string que tambien obtenga los datos del teclado
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDelanzamiento = teclado.nextInt();
        //Creacion de variable entera que recibe los datos del teclado
        System.out.println("Por ultimo dinos que nota le das a esta pelicula ");
        double nota = teclado.nextDouble();
        System.out.println(pelicula);
        System.out.println(fechaDelanzamiento);
        System.out.println(nota);
    }
}