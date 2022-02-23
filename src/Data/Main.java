package Data;

import javax.swing.*;
/**
 * En el Main se presentaran todas las opciones, se aplica el encapsulamiento de toda las clases.
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Creamos nuevos objetos
         */
	Cliente cliente= new Cliente("","","");
    Facturacion facturacion= new Facturacion("",0,0,0);

    int opcion;
    String descripcionF="";
    double SumaFactura=0;
        do
        {
            /**
             * Se presentan las distintas opciones del ménu
             */
            opcion  = Integer.parseInt(JOptionPane.showInputDialog("\n  Sistema de Gestión Veterinaria"+"\n           Veterinaria San Martín"+"\n*******************************************" +
                    "\n Elige una opción:"+
                    "\n1. Agendar Cita"+
                    "\n2. Registrar Cliente"+
                    "\n3. Registrar Mascota"+
                    "\n4. Procesos Médicos"+
                    "\n5. Procesos Estéticos"+
                    "\n6. Farmacia"+
                    "\n7. Facturación"));
            switch(opcion)
            {
                case 1:
                    /**
                     * Método para agendar la fecha y hora, además elegir la sucursal y el doctor
                     */
                    cliente.cita.AgendarCita(); break;
                case 2:
                    /**
                     * Registrar los datos el cliente
                     */
                    cliente.RegistroCliente();break;
                case 3:
                    /**
                     * Registar los datos de la mascota
                     */
                    cliente.mascota.RegistroMascota(); break;
                case 4:
                    int opc; int Op;
                    do
                    {
                        /**
                         * Menú para elegir los distintos procesos médicos
                         */
                        opc = Integer.parseInt(JOptionPane.showInputDialog("\n Procesos médicos:"
                                + "\n*******************************************"
                                + "\n1. Cirugía ₡100,000"
                                + "\n2. Vacunación ₡12,000 "
                                + "\n3. Rayos X ₡30,000"
                                + "\n4. Examenes de Sangre ₡52,000"
                                + "\n5. Consulta ₡15,000"
                                + "\n6. Hospitalización ₡50,000"));
                        switch (opc)
                        {
                            /**
                             * Suma de factura / detalle de la factura
                             */
                            case 1: SumaFactura=SumaFactura+facturacion.procesosMedicos[0].getPrecio();
                                    facturacion.procesosMedicos[0].setNombre("Cirugía ₡100,000");
                                    descripcionF= descripcionF+"\n"+facturacion.procesosMedicos[0].getNombre();break;

                            case 2: SumaFactura=SumaFactura+facturacion.procesosMedicos[1].getPrecio();
                                    facturacion.procesosMedicos[1].setNombre("Vacunación ₡12,000");
                                    descripcionF= descripcionF+"\n"+facturacion.procesosMedicos[1].getNombre();break;

                            case 3: SumaFactura=SumaFactura+facturacion.procesosMedicos[2].getPrecio();
                                    facturacion.procesosMedicos[2].setNombre("Rayos X ₡30,000");
                                    descripcionF= descripcionF+"\n"+facturacion.procesosMedicos[2].getNombre();break;

                            case 4: SumaFactura=SumaFactura+facturacion.procesosMedicos[3].getPrecio();
                                    facturacion.procesosMedicos[3].setNombre("Examenes de Sangre ₡52,000");
                                    descripcionF= descripcionF+"\n"+facturacion.procesosMedicos[3].getNombre();break;

                            case 5: SumaFactura=SumaFactura+facturacion.procesosMedicos[4].getPrecio();
                                    facturacion.procesosMedicos[4].setNombre("Consulta ₡15,000");
                                    descripcionF= descripcionF+"\n"+facturacion.procesosMedicos[4].getNombre();break;

                            case 6: SumaFactura=SumaFactura+facturacion.procesosMedicos[5].getPrecio();
                                    facturacion.procesosMedicos[5].setNombre("Hospitalización ₡50,000");
                                    descripcionF= descripcionF+"\n"+facturacion.procesosMedicos[5].getNombre();break;
                        }
                        Op=JOptionPane.showConfirmDialog(null,"Desea agregar otro proceso?",
                                "Procesos Médicos",JOptionPane.YES_NO_OPTION);
                    } while(Op!=0); break;
                case 5:
                    int Opc; int op;
                    do
                    {
                        /**
                         * Menú para elegir los distintos procesos estéticos
                         */
                        Opc = Integer.parseInt(JOptionPane.showInputDialog("\n Procesos estéticos:"
                                + "\n*******************************************"
                                + "\n1. Corte de Uñas ₡7,000"
                                + "\n2. Grooming ₡10,000"
                                + "\n3. Corte de Pelo ₡8,500"
                                + "\n4. Lavado de oídos ₡8,500"));
                        switch (Opc)
                        {
                            /**
                             * Suma de factura / detalle de la factura
                             */
                            case 1: SumaFactura=SumaFactura+facturacion.procesosEsteticos[0].getPrecio();
                                    facturacion.procesosEsteticos[0].setNombre("Corte de Uñas ₡7,000 ");
                                    descripcionF= descripcionF+"\n"+facturacion.procesosEsteticos[0].getNombre();break;
                            case 2: SumaFactura=SumaFactura+facturacion.procesosEsteticos[1].getPrecio();
                                    facturacion.procesosEsteticos[1].setNombre("Grooming ₡10,000");
                                    descripcionF= descripcionF+"\n"+facturacion.procesosEsteticos[1].getNombre();break;
                            case 3: SumaFactura=SumaFactura+facturacion.procesosEsteticos[2].getPrecio();
                                    facturacion.procesosEsteticos[2].setNombre("Corte de Pelo ₡8,500");
                                    descripcionF= descripcionF+"\n"+facturacion.procesosEsteticos[2].getNombre();break;
                            case 4: SumaFactura=SumaFactura+facturacion.procesosEsteticos[3].getPrecio();
                                    facturacion.procesosEsteticos[3].setNombre("Lavado de oídos ₡8,500");
                                    descripcionF= descripcionF+"\n"+facturacion.procesosEsteticos[3].getNombre();break;
                        }
                        op=JOptionPane.showConfirmDialog(null,"Desea agregar otro proceso?",
                                "Procesos Estéticos",JOptionPane.YES_NO_OPTION);
                    } while(op!=0); break;
                case 6:
                    int option; int opt;
                    do
                    {
                        /**
                         * Menú para elegir los distintos medicamentos
                         */
                        option = Integer.parseInt(JOptionPane.showInputDialog("\n Medicamentos:"
                                + "\n*******************************************"
                                + "\n1. Antipulgas ₡10000"
                                + "\n2. Vitaminas ₡13000"
                                + "\n3. Desparasitante ₡7000"
                                + "\n4. Unguento ₡5000"
                                + "\n5. Analgésicos ₡3000"));
                        switch (option)
                        {
                            /**
                             * Suma de de factura / detalle de la factura
                             */
                            case 1: SumaFactura=SumaFactura+facturacion.medicamentos[0].getPrecio();
                                    facturacion.medicamentos[0].setNombre("Antipulgas ₡10000");
                                    descripcionF= descripcionF+"\n"+facturacion.medicamentos[0].getNombre();break;
                            case 2: SumaFactura=SumaFactura+facturacion.medicamentos[1].getPrecio();
                                    facturacion.medicamentos[1].setNombre("Vitaminas ₡13000");
                                    descripcionF= descripcionF+"\n"+facturacion.medicamentos[1].getNombre(); break;
                            case 3: SumaFactura=SumaFactura+facturacion.medicamentos[2].getPrecio();
                                    facturacion.medicamentos[2].setNombre("Desparasitante ₡7000");
                                    descripcionF= descripcionF+"\n"+facturacion.medicamentos[2].getNombre();break;
                            case 4: SumaFactura=SumaFactura+facturacion.medicamentos[3].getPrecio();
                                    facturacion.medicamentos[3].setNombre("Unguento ₡5000");
                                    descripcionF= descripcionF+"\n"+facturacion.medicamentos[3].getNombre(); break;
                            case 5: SumaFactura=SumaFactura+facturacion.medicamentos[4].getPrecio();
                                    facturacion.medicamentos[4].setNombre("Analgésicos ₡3000");
                                    descripcionF= descripcionF+"\n"+facturacion.medicamentos[4].getNombre(); break;
                        }
                        opt=JOptionPane.showConfirmDialog(null,"Desea agregar otro proceso?",
                                "Farmacia",JOptionPane.YES_NO_OPTION);
                    } while(opt!=0); break;
                case 7:
                    /**
                     * Método para la facturación
                     */
                    facturacion.Facturar(SumaFactura,cliente.cita.getSucursal(),cliente.cita.getFecha(),cliente.cita.getHora(),
                    cliente.cita.getDoctor(),cliente.getNombre(), cliente.getApellido(),cliente.getCedula(),cliente.mascota.getNombre(),
                    cliente.mascota.getTipoAnimal(),cliente.mascota.getEdad(),cliente.mascota.getRaza(),descripcionF);

            }

        }  while(opcion != 8);
    }

}
