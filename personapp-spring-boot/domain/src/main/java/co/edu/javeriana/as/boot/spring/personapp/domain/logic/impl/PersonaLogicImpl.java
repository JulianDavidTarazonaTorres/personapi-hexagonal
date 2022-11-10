/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.logic.PersonaLogic;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Estudios;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Persona;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profesion;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Telefono;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.IPersonaPortOutMaria;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.IPersonaPortOutMongo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aasanchez
 */
@Service
public class PersonaLogicImpl implements PersonaLogic{
    /*
     * 
     * Aqui se implementan el CRUD de persona
     * 
     * 
     */
    @Autowired
    public IPersonaPortOutMongo persistencePort;
    	
	
    public PersonaLogicImpl(){}

    @Override
    public void createPersona(Persona persona) {
        persistencePort.create(persona);
    }

    @Override
    public void editPersona(Persona persona) {
        persistencePort.edit(persona);
    }

    @Override
    public void removePersona(String id) {
        persistencePort.remove(id);
    }

    @Override
    public Persona findPersona(String id) {
        return persistencePort.find(id);
    }

    @Override
    public List<Persona> findAllPersonas() {
        return persistencePort.findAll();
    }
       
}
