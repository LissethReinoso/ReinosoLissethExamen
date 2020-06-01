/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Usuario
 */
public class Television extends Electrodomestico {

    private int resolucion;
    private double puertoHDMI;

    public Television() {
    }

    public Television(int codigo) {
        super(codigo);
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public double getPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(double puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    @Override
    public double obtenerPrecioFinal() {
        double precioBase = 10;
        double porcentaje = 0.00;
        if (resolucion < 40) {
            porcentaje = 30 * precioBase / 100;
        }
        if (puertoHDMI > 0) {
            precioBase = precioBase + 50;
        }
        return super.obtenerPrecioFinal();
    }

    @Override
    public String toString() {
        return "Television{" + "resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI + '}';
    }

   

}
