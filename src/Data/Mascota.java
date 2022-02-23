package Data;

import javax.swing.*;
/**
 * La clase mascota recopila los datos de la mascota
 */

public class Mascota {
    /**
     * Los distintos atributos necesarios para la recopilación de información.
     */
    String nombre;
    String tipoAnimal;
    String edad;
    String raza;
    /**
     * Este método permite registrar los datos de la mascota
     */
    public void RegistroMascota()
    {
        setNombre(JOptionPane.showInputDialog("Ingrese el nombre de la mascota:"));
        setTipoAnimal(JOptionPane.showInputDialog("Ingrese el tipo de animal:"));
        setEdad(JOptionPane.showInputDialog("Ingrese la edad de la mascota:"));
        setRaza(JOptionPane.showInputDialog("Ingrese la raza de la mascota:"));
    }
    /**
     * Constructor de la clase
     * @param nombre
     * @param tipoAnimal
     * @param edad
     * @param raza
     */
    public Mascota(String nombre, String tipoAnimal, String edad, String raza) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.edad = edad;
        this.raza = raza;
    }
    /**
     * Recibe el nombre de la mascota.
     * @return Nos retorna la informaciòn.
     */
    public String getNombre() { return nombre; }
    /**
     * Modifica el nombre de la mascota mediante lo que  digita el usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Recibe el tipo de animal de la mascota.
     * @return Nos retorna la informaciòn.
     */
    public String getTipoAnimal() { return tipoAnimal; }
    /**
     * Modifica el tipo de animal mediante lo que  digita el usuario.
     */
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    /**
     * Recibe la edad de la mascota.
     * @return Nos retorna la informaciòn.
     */
    public String getEdad() {
        return edad;
    }
    /**
     * Modifica la edad de la mascota mediante lo que  digita el usuario.
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    /**
     * Recibe la raza de la mascota.
     * @return Nos retorna la informaciòn.
     */
    public String getRaza() {
        return raza;
    }
    /**
     * Modifica la raza de la mascota mediante lo que  digita el usuario.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
}
