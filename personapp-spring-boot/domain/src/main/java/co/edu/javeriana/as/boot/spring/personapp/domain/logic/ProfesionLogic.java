/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profesion;

import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface ProfesionLogic {
    
	/*
	 * toca crear el CRUD
	 * 
	 * aqui se ponen las funciones
	 * 
	 * 
	 */
    
    void createProfesion(Profesion profesion);

    void editProfesion(Profesion profesion);

    void removeProfesion(int id);
    
    Profesion findProfesion(int id);

    List<Profesion> findAllProfesiones();
    
}
