/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;

import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.PersonPortOutMaria;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.PersonaEntity;
import co.edu.javeriana.as.boot.spring.personapp.maria.mapper.PersonaMapper;
import co.edu.javeriana.as.boot.spring.personapp.maria.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author aasanchez
 */
public class PersonaPersistenceAdapter implements PersonPortOutMaria{

    @Autowired
    private PersonaRepository personaRepository;
    
    @Autowired
    private PersonaMapper personaMapper;
    
    @Override
    public String create(Person person) {
        
        PersonaEntity persona = personaMapper.toPersonaEntityFromPersona(person);
        
        if(personaRepository.save(persona)== null)
        {
            return "no se creo";
        }
        else
        {
            return "se creo";
        }
        
        
        // en mongo el PK es id
        // crear mongo repository
        // cambiar mapper a POJOS
    }

    @Override
    public String edit(Integer id, Person person) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean remove(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Person findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Person> findAll() {
       return personaMapper.toListPersonFromListPersonaEntity(personaRepository.findAll()) ;
    }

    
}
