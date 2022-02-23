package Data;

import javax.swing.*;
/**
 * Representa toda la parte de facturacion, el cobro por productos o servicios adquiridos.
 * Se muestran los cierto atributos correpondientes a dicha factura.
 * Mediante los metodos se daran se asignan los diferentes precios, metodos de pago, descuentos e impuestos.
 */
public class Facturacion {
    /**
     * Los distintos atributos necesarios para la facturacion.
     */
    String metodoDePago;
    int descuento;
    double total;
    double iva;
    /**
     * Instancia de las clases: ProcesosMedicos, Procesos Esteticos y Farmacia
     */
    ProcesosMedicos[] procesosMedicos;
    ProcesosEsteticos[] procesosEsteticos;
    Farmacia[] medicamentos;

    /**
     * Este método permite facturar
     */
    public  void Facturar(double SumaFactura, String Sucursal,String Fecha, String Hora,String NombreDoctor, String NombreC, String ApellidoC,
     String CedulaC, String nombreMasc, String TipoA, String mEdad,String Raza, String descripcionF )
    {
        setMetodoDePago(JOptionPane.showInputDialog("Método de pago:"));

        setDescuento(Integer.parseInt(JOptionPane.showInputDialog("Descuento")));
        CalcularIVA(SumaFactura);
        CalcularFactura(SumaFactura,getIva(),CalcularDescuento(SumaFactura,getDescuento()));

        ImprimirFactura(SumaFactura,Sucursal,Fecha,Hora,NombreDoctor,NombreC,ApellidoC,CedulaC, nombreMasc,TipoA,mEdad,Raza,
                getMetodoDePago(),getIva(),CalcularDescuento(SumaFactura, getDescuento()),getTotal(), descripcionF);
    }

    /**
     * Constructor de la clase
     * @param metodoDePago
     * @param total
     * @param descuento
     * @param iva
     */
    public Facturacion(String metodoDePago, double total, int descuento, double iva) {
        this.metodoDePago = metodoDePago;
        this.total = total;
        this.descuento = descuento;
        this.iva = iva;
        this.procesosMedicos= new ProcesosMedicos[6];
        this.procesosMedicos[0]= new ProcesosMedicos("Cirugia",100000);
        this.procesosMedicos[1]= new ProcesosMedicos("Vacunacion",12000);
        this.procesosMedicos[2]= new ProcesosMedicos("RayosX",30000);
        this.procesosMedicos[3]= new ProcesosMedicos("Examenes de Sangre",52000);
        this.procesosMedicos[4]= new ProcesosMedicos("Consulta",15000);
        this.procesosMedicos[5]= new ProcesosMedicos("Hospitalización",50000);
        this.procesosEsteticos= new ProcesosEsteticos[4];
        this.procesosEsteticos[0]= new ProcesosEsteticos("",7000);
        this.procesosEsteticos[1]= new ProcesosEsteticos("",10000);
        this.procesosEsteticos[2]= new ProcesosEsteticos("",8500);
        this.procesosEsteticos[3]= new ProcesosEsteticos("",8500);
        this.medicamentos= new Farmacia[5];
        this.medicamentos[0]= new Farmacia("",10000);
        this.medicamentos[1]= new Farmacia("",13000);
        this.medicamentos[2]= new Farmacia("",7000);
        this.medicamentos[3]= new Farmacia("",5000);
        this.medicamentos[4]= new Farmacia("",3000);
    }
    /**
     * Este método permite calcular el Impuesto al valor agregado (IVA 13%)
     */
    public void CalcularIVA(double Subtotal) {
        double resultado= (Subtotal*13/100);
        setIva(resultado);

    }
    /**
     * Este método permite calcular el descuento ingresado por el usuario
     */
    public double CalcularDescuento(double Subtotal, double Descuento){
        double resultado= (Subtotal*Descuento/100);
        return resultado;
    }
    /**
     * Este método calcular el total de la factura
     */
    public void CalcularFactura(double Subtotal, double Iva, double Desc) {
        double resultado= (Subtotal-Desc)+Iva;
        setTotal(resultado);

    }
    /**
     * Este método permite imprimir la factura
     */
    public void ImprimirFactura(double Subtotal, String Sucursal, String Fecha, String Hora, String Doctor, String Nombre, String Apellido, String Cedula,String NombreMascota,
                                String TipoMasc,String Edad,String Raza, String MetododePago, double IVA, double Descuento, double Total, String descripcionF)
    {
        JOptionPane.showConfirmDialog(null, "\n                             Veterinaria San Martin S.A"
                + "\n                           Cedula Juridica:3-111-951793 "
                + "\n                         Telefonos: 2225-9834 / 8896-7541 "
                + "\n                            vetesanmartin@gmail.com "
                + "\n*********************************************************************************"
                + "\nDireccion: "+ Sucursal
                + "\nFecha: \t\t" + Fecha
                + "\nHora: \t\t" + Hora
                + "\nAtendido por: "+Doctor
                + "\n*********************************************************************************"
                + "\nCliente: \t\t" + Nombre+ " " + Apellido
                + "\nCédula: \t\t" + Cedula
                + "\nDatos de la mascota"
                + "\nNombre: \t\t" + NombreMascota
                + "\nEdad: \t\t" + Edad+" años"
                + "\nTipo de animal: \t\t" + TipoMasc
                + "\nRaza: \t\t" + Raza
                + "\n*********************************************************************************"
                + "\nPor concepto de: \t\t" + descripcionF
                + "\nMétodo de pago: \t\t" + MetododePago
                + "\nSubtotal: \t\t"+"₡"+ Subtotal
                + "\nDescuento: \t\t"+"- ₡" + Descuento
                + "\nIva: \t\t"+"₡" + IVA
                + "\nTotal por pagar:"+"₡"+Total
                + "\n*********************************************************************************"
                + "\n                          Gracias por preferirnos\t\t"
                + "\n*********************************************************************************", "Factura",JOptionPane.YES_NO_OPTION);
    }
    /**
     * Recibe el metodo de pago seleccionado.
     * @return Nos retorna dicha elecciòn.
     */
    public String getMetodoDePago() {
        return metodoDePago;
    }
    /**
     * Modifica el metodo de pago según lo que el usuario selecciona.
     */
    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
    /**
     * Recibe el valor del saldo total.
     * @return Nos retorna dicho saldo.
     */
    public double getTotal() {
        return total;
    }
    /**
     * Modifica el valor asignado mediante lo que digita el usuario.
     */
    public void setTotal(double total) {
        this.total = total;
    }
    /**
     * Recibe el valor del descuento.
     * @return Nos retorna el valor.
     */
    public int getDescuento() {
        return descuento;
    }
    /**
     * Modifica el valor del descuento mediante lo que digita el usuario.
     */
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    /**
     * Recibe el valor del IVA.
     * @return Nos retorna el valor.
     */
    public double getIva() {
        return iva;
    }
    /**
     * Modifica el valor del IVA mediante lo que digita el usuario.
     */
    public void setIva(double iva) {
        this.iva = iva;
    }
}
