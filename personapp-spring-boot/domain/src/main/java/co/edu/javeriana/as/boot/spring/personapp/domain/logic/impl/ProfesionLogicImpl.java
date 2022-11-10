/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.logic.ProfesionLogic;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profesion;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.IPersonaPortOutMongo;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.IProfesionPortOutMaria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aasanchez
 */
@Service
public class ProfesionLogicImpl implements ProfesionLogic{
    /*
     * 
     * Aqui se implementan el CRUD de Profesión
     * 
     * 
     */
    @Autowired
    public IProfesionPortOutMaria persistencePort;
    	
	
    public ProfesionLogicImpl(){}

    @Override
    public void createProfesion(Profesion profesion) {
        persistencePort.create(profesion);
    }

    @Override
    public void editProfesion(Profesion profesion) {
        persistencePort.edit(profesion);
    }

    @Override
    public void removeProfesion(int id) {
        persistencePort.remove(id);
    }

    @Override
    public Profesion findProfesion(int id) {
        return persistencePort.find(id);
    }

    @Override
    public List<Profesion> findAllProfesiones() {
       return persistencePort.findAll();
    }

   
       
}
