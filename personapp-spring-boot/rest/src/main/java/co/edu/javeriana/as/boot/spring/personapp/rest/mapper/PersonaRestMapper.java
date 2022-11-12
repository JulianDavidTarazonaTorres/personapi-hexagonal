/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.mapper;

import java.util.List;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.rest.request.PersonaPostRequest;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaPostResponse;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaResponse;
import java.util.ArrayList;

/**
 *
 * @author aasanchez
 */
public class PersonaRestMapper {

	public List<PersonaResponse> fromListPersonaToListPersonaResponse(List<Person> personas) {
		 List<PersonaResponse> persons = new ArrayList<PersonaResponse>();
        for (Person persona : personas) {
            persons.add(fromPersonaToPersonaResponse(persona));
        }
        return persons;
	}

	public Person fromPersonaPostResquestToPersona(PersonaPostRequest personaPostRequest) {
		// TODO Auto-generated method stub
		return null;
	}
        
        public PersonaResponse fromPersonaToPersonaResponse(Person persona) {
		PersonaResponse personResponse = new PersonaResponse();
                personResponse.setId(persona.getId());
                personResponse.setName(persona.getName());
                personResponse.setLastName(persona.getLastName());
                personResponse.setAge(persona.getAge());
                personResponse.setGender(persona.getGender());
                
                
		return personResponse;
	}

	public PersonaPostResponse fromAStringToPersonaPostResponse(String salida) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
