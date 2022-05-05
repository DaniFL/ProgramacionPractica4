package aplicacion;

import dominio.CalculadoraDistancias;
import java.util.Scanner;

/**
 * Clase principal de la aplicación.
 *
 * @author Daniel Fernández López
 */
public class Principal {
    /**
     * Método principal del programa que llama al método distanciaEdicion con el que se calcula la distancia de edición entre dos palabras.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer los datos de entrada.
        System.out.println("Introduzca la primera palabra:"); // Se pide al usuario que introduzca la primera palabra.
        String palabra1 = scanner.nextLine(); // Se lee la primera palabra.
        System.out.println("Introduzca la segunda palabra:"); // Se pide al usuario que introduzca la segunda palabra.
        String palabra2 = scanner.nextLine(); // Se lee la segunda palabra.
        CalculadoraDistancias calculadora = new CalculadoraDistancias(); // Se crea un objeto CalculadoraDistancias.
        System.out.println("La distancia de edición entre las palabras es: " + CalculadoraDistancias.distanciaEdicicion(palabra1, palabra2));

    }
}
