/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.mapper;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.PersonaEntity;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.AEADBadTagException;
import org.springframework.stereotype.Component;

/**
 *
 * @author aasanchez
 */
@Component
public class PersonaMapper {
   
    //TODO
    public PersonaEntity toPersonaEntityFromPersona(Person person) {
        PersonaEntity pe = new PersonaEntity();
        pe.setCc(person.getId());
        pe.setApellido(person.getLastName());
        
        return pe;
    }

    // TODO
    public List<Person> toListPersonFromListPersonaEntity(List<PersonaEntity> findAll) {
        List<Person> persons = new ArrayList<Person>();
        for (PersonaEntity personaEntity : findAll) {
            persons.add(toPersonFromPersonaEntity(personaEntity));
        }
        return persons;
    }

    // TODO
    private Person toPersonFromPersonaEntity(PersonaEntity personaEntity) {
        Person pe = new Person();
        pe.setId(personaEntity.getCc());
        //pe.setApellido(person.getLastName());
        
        return pe;
    }
}
