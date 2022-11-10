/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.in;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Estudios;
import java.util.List;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Persona;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profesion;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Telefono;


/**
 *
 * @author aasanchez
 */

public interface PersonaApp {
    // persona
    public Persona findPersona(Integer cc);
    
    public List<Persona> findAllPersonas();
    
    public String createPersona(Persona p);
    
//    // profesion
//    public List<Profesion> findAllProfesion();
//    
//    public void createProfesion(Profesion persona);
//
//    public void editProfesion(Profesion persona);
//
//    public void removeProfesion(int id);
//    
//    public Profesion findProfesion(int id);
//    
//    // telefono
//    public List<Telefono> findAllTelefonos();
//    
//    public void createTelefono(Telefono persona);
//
//    public void editTelefono(Telefono persona);
//
//    public void removeTelefono(String id);
//    
//    public Telefono findTelefono(String id);
//    
//    //  estudios
//    public List<Estudios> findAllEstudios();
//    
//    public void createEstudios(Estudios persona);
//
//    public void editEstudios(Estudios persona);
//
//    public void removeEstudios(int id);
//    
//    public Estudios findEstudios(int id);
    
}
