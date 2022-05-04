package aplicacion;
import dominio.CalculadoraDistancias;

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
        System.out.println("Distancia: " + CalculadoraDistancias.distanciaEdicicion("Patata", "Patete"));
    }
}
