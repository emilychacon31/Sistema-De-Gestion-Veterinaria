package Data;

import javax.swing.*;
/**
 * La clase cliente recopila los datos personales del cliente
 */
public class Cliente {
    /**
     * Los distintos atributos necesarios para la recopilación de información.
     */
    String nombre;
    String apellido;
    String cedula;
    /**
     * Instancias de la clase Cita y Mascota
     */
    public Cita cita;
    public Mascota mascota;

    /**
     * Este método permite registrar los datos del cliente
     */
    public void RegistroCliente()
    {
        setNombre(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
        setApellido(JOptionPane.showInputDialog("Ingrese el apellido del cliente"));
        setCedula(JOptionPane.showInputDialog("Ingrese la cédula del cliente"));
    }

    /**
     * Constructor de la clase Cliente
     * @param nombre
     * @param apellido
     * @param cedula
     */
    public Cliente(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cita= new Cita("","","","");
        this.mascota= new Mascota("","","","");
    }
    /**
     * Recibe el nombre del cliente.
     * @return Nos retorna la informaciòn.
     */
    public String getNombre() { return nombre; }
    /**
     * Modifica el nombre del cliente mediante lo que digita el usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Recibe el apellido del cliente.
     * @return Nos retorna la informaciòn.
     */
    public String getApellido() { return apellido; }
    /**
     * Modifica el apellido del cliente mediante lo que digita el usuario.
     */
    public void setApellido(String apellido) { this.apellido = apellido; }
    /**
     * Recibe el número de cédula.
     * @return Nos retorna la informaciòn.
     */

    public String getCedula() {
        return cedula;
    }
    /**
     * Modifica el número de cédula mediante lo que digita el usuario.
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
