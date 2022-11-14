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
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author aasanchez
 */


@RestController

@RequestMapping("Person")

public class PersonaControllerImpl_1  implements PersonaController{
    
    @Autowired
    public PersonaAppAdapter personapp;
    
    @Autowired
    public PersonaRestMapper personaRestMapper;
    
    @Value("${app.db}")
    private int appDb;

    @GetMapping("/hola2")
    public String hola2() {
 
        return "formulario";
 
    }
    
    @GetMapping("/hola")
    @ResponseBody
    public String hola() {
 
        return "has hecho una peticion get";
 
    }
    
    @Override
    @GetMapping("/darPersonas")
    public List<PersonaResponse> buscar() {
        
        List<Person> personas = personapp.findAll(appDb);
	return personaRestMapper.fromListPersonaToListPersonaResponse(personas);
    }
   

    @Override
    @PutMapping("/actualizarPersona")
    public String actualizar(PersonaPostRequest personaPostRequest) {
        Person persona = personapp.findById(personaPostRequest.getId(),appDb);
         
        return personapp.edit(persona.getId(), persona, appDb);
    }

    @Override
    @GetMapping("/darPersona")
    public PersonaResponse buscarPorId(@RequestParam("id") Integer id) {
        Person p = personapp.findById(id, appDb);
        return personaRestMapper.fromPersonaToPersonaResponse(p);
    }

    @Override
    @DeleteMapping("/eliminarPersona")
    public boolean eliminar(@RequestParam("id") Integer id) {
        return personapp.remove(id, appDb);
    }

    @Override
    @PostMapping("/crearPersona")
    public String crear(@RequestBody PersonaPostRequest personaPostRequest) {
        Person p = personaRestMapper.fromPersonaPostResquestToPersona(personaPostRequest);
        return personapp.create(p, appDb);
    }

    
}
