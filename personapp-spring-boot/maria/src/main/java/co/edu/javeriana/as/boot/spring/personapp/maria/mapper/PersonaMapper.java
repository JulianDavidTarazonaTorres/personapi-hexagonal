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
        
        EstudioMapper estudioMapper = new EstudioMapper();
        
        PersonaEntity pe = new PersonaEntity();
        pe.setCc(person.getId());
        pe.setApellido(person.getLastName());
        pe.setEdad(person.getAge());
        pe.setGenero(person.getGender());
        pe.setEstudiosList(estudioMapper.toListEstudioEntityFromListEstudio(person.getStudies()));
        //pe.setTelefonoList(person.getPhones());
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
    
    public List<PersonaEntity> toListPersonaEntityFromListPerson(List<Person> findAll) {
        List<PersonaEntity> persons = new ArrayList<PersonaEntity>();
        for (Person persona : findAll) {
            persons.add(toPersonaEntityFromPersona(persona));
        }
        return persons;
    }

    // TODO
    public Person toPersonFromPersonaEntity(PersonaEntity personaEntity) {
        
        EstudioMapper estudioMapper = new EstudioMapper();
        
        Person pe = new Person();
        pe.setId(personaEntity.getCc());
        pe.setName(personaEntity.getNombre());
        pe.setLastName(personaEntity.getApellido());
        pe.setAge(personaEntity.getEdad());
        pe.setGender(personaEntity.getGenero());
        pe.setStudies(estudioMapper.toListEstudioFromListEstudioEntity(personaEntity.getEstudiosList()));
        
        return pe;
    }
}
