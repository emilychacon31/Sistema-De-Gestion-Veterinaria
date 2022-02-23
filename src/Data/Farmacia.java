package Data;
/**
 * La clase farmacia contiene los distintos medicamentos que ofrece la veterinaria
 */
public class Farmacia
{
    /**
     * Los distintos atributos necesarios para la recopilación de información.
     */
    String nombre;
    double precio;

    /**
     * Constructor de la Clase Farmacia
     * @param nombre
     * @param precio
     */
    public Farmacia(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    /**
     * Recibe el nombre del medicamento
     * @return Nos retorna la informaciòn.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica el nombre del medicamento mediante lo que  digita el usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Recibe el precio del medicamento
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
