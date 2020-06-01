/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IElectrodomesticoDao {
    
    //CRUD
    
    public void createTelevision( Television television);
    public void createLavadora(Lavadora lavadora);
    
    List <Lavadora> listarLavadora();
    List <Television> listarTelevision();
    
}
