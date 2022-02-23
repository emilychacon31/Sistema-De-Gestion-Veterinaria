package Data;


import javax.swing.*;
import java.util.Calendar;
/**
 * Esta clase se encarga de la crear y agendar las citas programadas por le cliente.
 */
public class Cita {
    /**
     * Los distintos atributos necesarios para la creacion de la cita.
     */
    String fecha;
    String hora;
    String sucursal;
    String doctor;

    /**
     * Este método permite agendar la cita del usuario
     */
    public void AgendarCita(){
        Agendarfecha();
        AgendarHora();
        ElegirSucursal();
        Elegirdoctor();
    }
    /**
     * Este método permite elegir las fechas dispoibles.
     */
    public void Agendarfecha()
    {

        Calendar calendario= Calendar.getInstance();
        int anio=calendario.get(Calendar.YEAR);
        int dia= calendario.get(Calendar.DAY_OF_MONTH);
        int mes= calendario.get(Calendar.MONTH);
        String fechaC="";
        /**
         *Se muestran las fechas disponibles a la semana.
         */
        int fechasdisponibles= Integer.parseInt(JOptionPane.showInputDialog("Fechas Disponibles:"
        +"\n1) "+dia+"/"+mes+"/"+anio
        +"\n2) "+(dia+1)+"/"+mes+"/"+anio
        +"\n3) "+(dia+2)+"/"+mes+"/"+anio
        +"\n4) "+(dia+3)+"/"+mes+"/"+anio));
        /**
         *Este switch contiene las fecha que el usuario selecciona.
         */
        switch (fechasdisponibles)
        {
            case 1:  fechaC=(dia+"/"+mes+"/"+anio); break;
            case 2:  fechaC=((dia+1)+"/"+mes+"/"+anio); break;
            case 3:  fechaC=((dia+2)+"/"+mes+"/"+anio); break;
            case 4:  fechaC=((dia+3)+"/"+mes+"/"+anio); break;
        }
        setFecha(fechaC);
    }
    /**
     * Este método permite elegir las horas disponibles.
     */
    public void AgendarHora()
    {   String horaC="";
        /**
         *Se muestran las horas disponibles a la semana.
         */
        int horasdisponibles= Integer.parseInt(JOptionPane.showInputDialog("Horas Disponibles:"
                +"\n1) 9:00 a.m "
                +"\n2) 10:35 a.m "
                +"\n3) 12:00 p.m "
                +"\n4) 2:20 p.m "
                +"\n5) 4:30 p.m "));
        /**
         *Mediante este switch se conoce el horario que el usuario seleccionò.
         */
        switch (horasdisponibles)
        {
            case 1:  horaC=("9:00 a.m"); break;
            case 2:  horaC=("10:35 a.m"); break;
            case 3:  horaC=("12:00 p.m"); break;
            case 4:  horaC=("2:20 p.m"); break;
            case 5:  horaC=("4:30 p.m"); break;
        }
        setHora(horaC);
    }
    /**
     * Mètodo para que el usuario elija las sucursal a la cual desea ir.
     */
    public void ElegirSucursal() {
        String sucursalC = "";
        int sucursaldisponibles = Integer.parseInt(JOptionPane.showInputDialog("Sucursales:"
                + "\n1) San José Morazán"
                + "\n2) Multiplaza Escazú"
                + "\n3) Multiplaza Curridabat"
                + "\n4) City Mall "
                + "\n5) Cartago"));
        /**
         * Este switch muestra la opcion seleccionada por el usuario.
         */
        switch (sucursaldisponibles) {
            case 1:
                sucursalC = ("San José Morazán");
                break;
            case 2:
                sucursalC = ("Multiplaza Escazú");
                break;
            case 3:
                sucursalC = ("Multiplaza Curridabat");
                break;
            case 4:
                sucursalC = ("City Mall");
                break;
            case 5:
                sucursalC = ("Cartago");
                break;
        }
        setSucursal(sucursalC);
    }
    /**
     * Este método permite elegir el doctor veterinario.
     */
    public void Elegirdoctor(){

        String nombreDoc = "";
        int doctores = Integer.parseInt(JOptionPane.showInputDialog("Doctores:"
                + "\n1) Dra.Andrea Zalazar"
                + "\n2) Dr.Eliver Perez"
                + "\n3) Dr.Juan Chinchilla"
                + "\n4) Dra.Julia Mendoza "
                + "\n5) Dr.Victor Chaves"));
        /**
         * Este switch muestra la opcion seleccionada por el usuario.
         */
        switch (doctores) {
            case 1:
                nombreDoc = ("Dra.Andrea Zalazar");
                break;
            case 2:
                nombreDoc = ("Dr.Eliver Perez");
                break;
            case 3:
                nombreDoc = ("Dr.Juan Chinchilla");
                break;
            case 4:
                nombreDoc = ("Dra.Julia Mendoza");
                break;
            case 5:
                nombreDoc = ("Dr.Victor Chaves");
                break;

        }
        setDoctor(nombreDoc);
    }

    /**
     * Constructor de la clase cita
     * @param fecha
     * @param hora
     * @param sucursal
     */
    public Cita(String fecha, String hora, String sucursal,String doctor) {
        this.fecha = fecha;
        this.hora = hora;
        this.sucursal = sucursal;
        this.doctor=doctor;
    }
    /**
     *Recibe la fecha de la cita.
     * @return Nos retorna la fecha.
     */
    public String getFecha() {
        return fecha;
    }
    /**
     *Modifica la fecha mediante lo que digita el usuario.
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     *Recibe la hora de la cita.
     * @return Nos retorna la hora de la cita.
     */
    public String getHora() {
        return hora;
    }
    /**
     *Modifica la hora mediante lo que digita el usuario.
     * @param hora
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    /**
     *Recibe el nombre de la sucursal.
     * @return Nos retorna el nombre.
     */
    public String getSucursal() {
        return sucursal;
    }
    /**
     *Modifica el nombre de la sucursal mediante lo que digita el usuario.
     * @param sucursal
     */
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    /**
     *Recibe el nombre del doctor.
     * @return Nos retorna el nombre.
     */
    public String getDoctor() { return doctor; }
    /**
     *Modifica el nombre del doctor mediante lo que digita el usuario.
     * @param doctor
     */
    public void setDoctor(String doctor) { this.doctor = doctor;}
}
