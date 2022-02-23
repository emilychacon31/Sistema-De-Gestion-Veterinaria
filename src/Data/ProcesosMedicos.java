package Data;
/**
 * La clase procesos medicos contiene los distintos procesos que ofrece la veterinaria
 */
public class ProcesosMedicos {
    /**
     * Los distintos atributos necesarios para la recopilación de información.
     */
    String nombre;
    double precio;

    /**
     * Costructor de la clase ProcesosMedicos
     * @param nombre
     * @param precio
     */
    public ProcesosMedicos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    /**
     * Recibe el nombre del proceso medico
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
     * Modifica el precio del medicamento mediante lo que  digita el usuario.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
