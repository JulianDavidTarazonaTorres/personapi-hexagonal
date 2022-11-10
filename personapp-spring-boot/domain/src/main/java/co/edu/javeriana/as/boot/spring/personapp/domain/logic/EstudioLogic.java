/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Estudios;

import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface EstudioLogic {
    
	/*
	 * toca crear el CRUD
	 * 
	 * aqui se ponen las funciones
	 * 
	 * 
	 */
       
    void createEstudio(Estudios estudios);

    void editEstudio(Estudios estudios);

    void removeEstudio(int id);
    
    Estudios findEstudio(int id);

    List<Estudios> findAllEstudios();
}
