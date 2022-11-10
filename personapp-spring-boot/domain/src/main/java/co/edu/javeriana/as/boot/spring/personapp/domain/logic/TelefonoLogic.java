/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Telefono;
import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface TelefonoLogic {
    
	/*
	 * toca crear el CRUD
	 * 
	 * aqui se ponen las funciones
	 * 
	 * 
	 */ 
    
    void createTelefono(Telefono telefono);

    void editTelefono(Telefono telefono);

    void removeTelefono(String id);

    Telefono findTelefono(String id);
    
    List<Telefono> findAllTelefonos();
    
}
