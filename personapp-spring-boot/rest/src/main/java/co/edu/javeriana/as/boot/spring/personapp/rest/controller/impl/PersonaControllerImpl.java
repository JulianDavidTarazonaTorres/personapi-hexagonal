/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.controller.impl;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Persona;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.in.PersonaApp;
import co.edu.javeriana.as.boot.spring.personapp.rest.controller.PersonaController;
import co.edu.javeriana.as.boot.spring.personapp.rest.mapper.PersonaRestMapper;
import co.edu.javeriana.as.boot.spring.personapp.rest.request.PersonaPostRequest;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaPostResponse;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author aasanchez
 */
@RestController
public class PersonaControllerImpl  implements PersonaController{
    
    @Autowired
    public PersonaApp personapp;
    
    @Autowired
    public PersonaRestMapper personaRestMapper;

    @Override
    @GetMapping
    public List<PersonaResponse> buscar() {
        List<Persona> personas = personapp.findAllPersonas();
	return personaRestMapper.fromListPersonaToListPersonaResponse(personas);
    }

    @Override
    @PostMapping
    public PersonaPostResponse actualizar(PersonaPostRequest personaPostRequest) {
	Persona p = personaRestMapper.fromPersonaPostResquestToPersona(personaPostRequest);
	String salida = personapp.createPersona(p);
		
	return personaRestMapper.fromAStringToPersonaPostResponse(salida);
    }
    

    
}
