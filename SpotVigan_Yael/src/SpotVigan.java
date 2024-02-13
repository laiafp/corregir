import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal que ejecuta la interfaz de usuario para la gestión de un reproductor musical.
 * Permite realizar operaciones como insertar, borrar, listar, y reproducir canciones, entre otras.
 *
 * @author Yael Hernández
 * @date 12/02/2023
 */
public class SpotVigan {
    public static void main(String[] args) {
        ArrayList<Cancion> canciones = new ArrayList<>();
        SpotViganDAO utils = new SpotViganDAO();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\n--- SpotVigan Menú ---");
                System.out.println("1. Insertar Canción");
                System.out.println("2. Borrar Canción");
                System.out.println("3. Listar Canciones");
                System.out.println("4. Escuchar Canción");
                System.out.println("5. Listar canciones más reproducidas");
                System.out.println("6. Generar Lista de canciones aleatorias para reproducir");
                System.out.println("7. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (opcion) {
                    case 1:
                        // Lógica para insertar canción
                        break;
                    case 2:
                        // Lógica para borrar canción
                        break;
                    case 3:
                        // Lógica para listar canciones
                        break;
                    case 4:
                        // Lógica para escuchar canción
                        break;
                    case 5:
                        // Lógica para listar canciones más reproducidas
                        break;
                    case 6:
                        // Lógica para generar lista aleatoria
                        break;
                    case 7:
                        System.out.println("Saliendo...");
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        break;
                }
            }
        } catch (InputMismatchException ime) {
            System.out.println("Entrada no válida. Por favor, introduzca un número.");
        } finally {
            scanner.close();
        }
    }
}
