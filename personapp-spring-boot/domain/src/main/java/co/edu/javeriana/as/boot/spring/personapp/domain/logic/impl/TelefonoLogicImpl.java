/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.logic.TelefonoLogic;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Telefono;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.IPersonaPortOutMongo;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.ITelefonoPortOutMaria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aasanchez
 */
@Service
public class TelefonoLogicImpl implements TelefonoLogic{
    /*
     * 
     * Aqui se implementan el CRUD de telefono
     * 
     * 
     */
    @Autowired
    public ITelefonoPortOutMaria persistencePort;
    	
	
    public TelefonoLogicImpl(){}

    @Override
    public void createTelefono(Telefono telefono) {
        persistencePort.create(telefono);
    }

    @Override
    public void editTelefono(Telefono telefono) {
        persistencePort.edit(telefono);
    }

    @Override
    public void removeTelefono(String id) {
        persistencePort.remove(id);
    }

    @Override
    public Telefono findTelefono(String id) {
        return persistencePort.find(id);
    }

    @Override
    public List<Telefono> findAllTelefonos() {
        return persistencePort.findAll();
    }

    
       
}
