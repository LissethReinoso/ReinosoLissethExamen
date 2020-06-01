/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.IElectrodomesticoDao;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorElectrodomestico implements IElectrodomesticoDao {

    private Electrodomestico modelo;
    private IElectrodomesticoDao dao;
    private VistaElectrodomestico vista;

    public ControladorElectrodomestico() {
    }
    
    

    public ControladorElectrodomestico(Electrodomestico modelo, IElectrodomesticoDao dao, VistaElectrodomestico vista) {
        this.modelo = modelo;
        this.dao = dao;
        this.vista = vista;
    }

    public Electrodomestico getModelo() {
        return modelo;
    }

    public void setModelo(Electrodomestico modelo) {
        this.modelo = modelo;
    }

    public IElectrodomesticoDao getDao() {
        return dao;
    }

    public void setDao(IElectrodomesticoDao dao) {
        this.dao = dao;
    }

    public VistaElectrodomestico getVista() {
        return vista;
    }

    public void setVista(VistaElectrodomestico vista) {
        this.vista = vista;
    }

    
    @Override
    public void createTelevision(Television television) {
       
       
    }

    @Override
    public void createLavadora(Lavadora lavadora) {
        
    }

    @Override
    public List<Lavadora> listarLavadora() {
       
      return null;
    }

    @Override
    public List<Television> listarTelevision() {
        
         return null;
    }

    
    
}
