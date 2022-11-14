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
        PersonaEntity persona = personaMapper.toPersonaEntityFromPersona(person);

        PersonaEntity result = personaRepository.findById(id).get();
        if(result != null){
            result.setCc(persona.getCc());
            result.setNombre(persona.getNombre());
            result.setApellido(persona.getApellido());
            result.setEdad(persona.getEdad());
            result.setGenero(persona.getGenero());
            result.setEstudiosList(persona.getEstudiosList());
            result.setTelefonoList(persona.getTelefonoList());

            return "se creo";
        }
        else{
            return "no se creo";
        }
        
        
    }

    @Override
    public Boolean remove(Integer id) {
        personaRepository.deleteById(id);
        return true;
    }

    @Override
    public Person findById(Integer id) {
        return personaMapper.toPersonFromPersonaEntity(personaRepository.findById(id).get());
    }

    @Override
    public int count() {
       return (int) personaRepository.count();
    }

    @Override
    public List<Person> findAll() {
       return personaMapper.toListPersonFromListPersonaEntity(personaRepository.findAll()) ;
    }

    
}
