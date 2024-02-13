import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Clase encargada de gestionar las operaciones con la lista de canciones, actuando como un DAO (Data Access Object).
 * Incluye métodos para insertar, borrar, listar, reproducir canciones, y generar listas de canciones más reproducidas o aleatorias.
 *
 * @author Yael Hernández
 * @date 12/02/2023
 */
public class SpotViganDAO {
    /**
     * Inserta una canción en la lista si no existe una con la misma clave.
     *
     * @param canciones Lista de canciones.
     * @param cancion La canción a insertar.
     */
    public void insertarCancion(ArrayList<Cancion> canciones, Cancion cancion) {
        if (canciones.stream().noneMatch(c -> c.getClave().equals(cancion.getClave()))) {
            canciones.add(cancion);
            System.out.println("Canción insertada con éxito.");
        } else {
            System.out.println("ERROR: La clave de la canción ya existe.");
        }
    }

    /**
     * Borra una canción de la lista basándose en su clave.
     *
     * @param canciones Lista de canciones.
     * @param clave Clave de la canción a borrar.
     */
    public void borrarCancion(ArrayList<Cancion> canciones, String clave) {
        boolean eliminado = canciones.removeIf(c -> c.getClave().equals(clave));
        if (eliminado) {
            System.out.println("Canción eliminada.");
        } else {
            System.out.println("Canción no encontrada.");
        }
    }

    /**
     * Lista todas las canciones existentes.
     *
     * @param canciones Lista de canciones.
     */
    public void listarCanciones(ArrayList<Cancion> canciones) {
        canciones.forEach(System.out::println);
    }

    /**
     * Incrementa el número de reproducciones de una canción y la muestra.
     *
     * @param canciones Lista de canciones.
     * @param clave Clave de la canción a reproducir.
     */
    public void escucharCancion(ArrayList<Cancion> canciones, String clave) {
        canciones.stream()
                .filter(c -> c.getClave().equals(clave))
                .findFirst()
                .ifPresent(cancion -> {
                    cancion.incrementarReproduccion();
                    System.out.println("Reproduciendo: " + cancion);
                });
    }

    /**
     * Genera y muestra una lista de las 5 canciones más reproducidas.
     *
     * @param canciones Lista de canciones.
     */
    public void generarListaMasReproducidas(ArrayList<Cancion> canciones) {
        canciones.stream()
                .sorted(Comparator.comparingInt(Cancion::getNumeroReproducciones).reversed())
                .limit(5)
                .forEach(System.out::println);
    }

    /**
     * Genera y muestra una lista aleatoria de 5 canciones.
     *
     * @param canciones Lista de canciones.
     * @return Una lista aleatoria de 5 canciones.
     */
    public ArrayList<Cancion> generarListaAleatoria(ArrayList<Cancion> canciones) {
        ArrayList<Cancion> listaAleatoria = new ArrayList<>(canciones);
        Collections.shuffle(listaAleatoria);
        return new ArrayList<>(listaAleatoria.subList(0, Math.min(5, listaAleatoria.size())));
    }
}
