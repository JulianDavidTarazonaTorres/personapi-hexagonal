/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.controller.impl;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.in.PersonUseCase;
import co.edu.javeriana.as.boot.spring.personapp.rest.adapter.PersonaAppAdapter;

import co.edu.javeriana.as.boot.spring.personapp.rest.controller.PersonaController;
import co.edu.javeriana.as.boot.spring.personapp.rest.mapper.PersonaRestMapper;
import co.edu.javeriana.as.boot.spring.personapp.rest.request.PersonaPostRequest;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaPostResponse;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author aasanchez
 */
@RestController
public class PersonaControllerImpl  implements PersonaController{
    
    @Autowired
    public PersonaAppAdapter personapp;
    
    @Autowired
    public PersonaRestMapper personaRestMapper;
    
    @Value("${app.db}")
    private int appDb;

    @Override
    @GetMapping
    public List<PersonaResponse> buscar() {
        
        List<Person> personas = personapp.findAll(appDb);
	return personaRestMapper.fromListPersonaToListPersonaResponse(personas);
    }

  /*  @Override
    @PostMapping
    public PersonaPostResponse actualizar(PersonaPostRequest personaPostRequest) {
	Person p = personaRestMapper.fromPersonaPostResquestToPersona(personaPostRequest);
	String salida = personapp.edit(appDb, p, appDb)
		
	return personaRestMapper.fromAStringToPersonaPostResponse(salida);
    }
    */

    @Override
    public PersonaPostResponse actualizar(PersonaPostRequest personaPostRequest) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
