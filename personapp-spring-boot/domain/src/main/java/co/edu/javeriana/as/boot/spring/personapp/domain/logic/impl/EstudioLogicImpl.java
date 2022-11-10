/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.logic.EstudioLogic;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Estudios;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.IEstudiosPortOutMaria;

import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.IPersonaPortOutMongo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aasanchez
 */
@Service
public class EstudioLogicImpl implements EstudioLogic{
    /*
     * 
     * Aqui se implementan el CRUD de persona
     * 
     * 
     */
    @Autowired
    public IEstudiosPortOutMaria persistencePort;
    	
	
    public EstudioLogicImpl(){}

    @Override
    public void createEstudio(Estudios estudios) {
        persistencePort.create(estudios);
    }

    @Override
    public void editEstudio(Estudios estudios) {
        persistencePort.edit(estudios);
    }

    @Override
    public void removeEstudio(int id) {
        persistencePort.remove(id);
    }

    @Override
    public Estudios findEstudio(int id) {
       return persistencePort.find(id);
    }

    @Override
    public List<Estudios> findAllEstudios() {
        return persistencePort.findAll();
    }

       
}
