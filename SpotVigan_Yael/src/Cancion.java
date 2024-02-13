/**
 * Representa una canción con detalles como clave, intérprete, autor, álbum, duración y número de reproducciones.
 * Implementa métodos para acceder y modificar estas propiedades.
 * Esta clase es parte de una aplicación de reproducción musical para gestionar canciones.
 *
 * @author Yael Hernández
 * @date 12/02/2023
 */
public class Cancion {
    private String clave;
    private String interprete;
    private String autor;
    private String album;
    private int duracion;
    private int numeroReproducciones;

    /**
     * Constructor que inicializa una nueva instancia de Cancion con los parámetros proporcionados.
     *
     * @param clave La clave única para identificar la canción.
     * @param interprete El nombre del intérprete de la canción.
     * @param autor El nombre del autor de la canción.
     * @param album El nombre del álbum al que pertenece la canción.
     * @param duracion La duración de la canción en segundos.
     */
    public Cancion(String clave, String interprete, String autor, String album, int duracion) {
        this.clave = clave;
        this.interprete = interprete;
        this.autor = autor;
        this.album = album;
        this.duracion = duracion;
        this.numeroReproducciones = 0; // Se inicializa en 0 ya que es nueva.
    }

    // Métodos de acceso (getters) y modificación (setters) para cada propiedad.
    public String getClave() { return clave; }
    public String getInterprete() { return interprete; }
    public String getAutor() { return autor; }
    public String getAlbum() { return album; }
    public int getDuracion() { return duracion; }
    public int getNumeroReproducciones() { return numeroReproducciones; }

    public void setNumeroReproducciones(int numeroReproducciones) {
        this.numeroReproducciones = numeroReproducciones;
    }

    /**
     * Incrementa en uno el número de reproducciones de la canción.
     */
    public void incrementarReproduccion() {
        numeroReproducciones++;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "clave='" + clave + '\'' +
                ", interprete='" + interprete + '\'' +
                ", autor='" + autor + '\'' +
                ", album='" + album + '\'' +
                ", duracion=" + duracion +
                ", numeroReproducciones=" + numeroReproducciones +
                '}';
    }
}
