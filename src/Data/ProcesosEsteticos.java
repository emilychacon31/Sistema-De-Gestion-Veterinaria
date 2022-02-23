package Data;
/**
 * La clase procesos esteticos contiene las dististintas opciones para procesos eseticos.
 */
public class ProcesosEsteticos {
    /**
     * Los distintos atributos necesarios para la recopilación de información.
     */
    String nombre;
    double precio;

    public ProcesosEsteticos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    /**
     * Recibe el nombre del proceso estético
     * @return Nos retorna la informaciòn.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica el nombre del proceso mediante lo que  digita el usuario.
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Recibe el precio del proceso
     * @return Nos retorna la informaciòn.
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Modifica el el precio del proceso mediante lo que  digita el usuario.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
