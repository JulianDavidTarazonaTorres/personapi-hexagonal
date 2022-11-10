/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Persona;

import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface PersonaLogic {
    
	/*
	 * toca crear el CRUD
	 * 
	 * aqui se ponen las funciones
	 * 
	 * 
	 */
    void createPersona(Persona persona);

    void editPersona(Persona persona);

    void removePersona(String id);
    
    Persona findPersona(String id);

    List<Persona> findAllPersonas();
    
}
