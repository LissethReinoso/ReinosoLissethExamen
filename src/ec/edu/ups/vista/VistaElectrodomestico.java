/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaElectrodomestico {
    
    public static void main(String[]  args){
        
        Electrodomestico ed=new Electrodomestico();
        
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Electrodomesticos");
        
        System.out.println("Ingrese el codigo del electrodomestico:");
        int codigo=leer.nextInt();
        ed.setCodigo(codigo);
        
        System.out.println("Ingrese una descripción del electrodomestico;");
        String des=leer.nextLine();
        ed.setDescripcion(des);
        leer.nextLine();
        System.out.println("Ingrese el presio base:");
        double pb=leer.nextInt();
        ed.setPrecioBase(pb);
        
        System.out.println("Ingrese el color:");
        String color=leer.nextLine();
        
        ed.setColor(color); 
        
        leer.nextLine();
        
        System.out.println("Indique el consumo energético:");
        System.out.println("Desde A(Consumo más alto) hasta F(Consumo más bajo)");
        
        String ce=leer.nextLine();
        ed.getConsumoEnergetico();
        
        System.out.println("Ingrese el peso: ");
        int peso=leer.nextInt();
        ed.getPeso();
        
        System.out.println(ed);
        System.out.println(ed.obtenerPrecioFinal());
        
        Television television=new Television();
        television.obtenerPrecioFinal();
        Lavadora lavadora=new Lavadora();
        
        ControladorElectrodomestico conel= new ControladorElectrodomestico();
        
        conel.createLavadora(lavadora);
        
        conel.createTelevision(television);
        
        conel.listarLavadora();
        
        conel.listarTelevision();
        
    }
}
