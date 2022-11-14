/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.profesionapp.rest.controller.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.as.boot.spring.profesionapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.profesionapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.profesionapp.domain.port.in.ProfessionUseCase;
import co.edu.javeriana.as.boot.spring.profesionapp.rest.adapter.ProfessionAppAdapter;

import co.edu.javeriana.as.boot.spring.profesionapp.rest.controller.ProfessionController;
import co.edu.javeriana.as.boot.spring.profesionapp.rest.mapper.ProfessionRestMapper;
import co.edu.javeriana.as.boot.spring.profesionapp.rest.request.ProfessionPostRequest;
import co.edu.javeriana.as.boot.spring.profesionapp.rest.response.ProfessionPostResponse;
import co.edu.javeriana.as.boot.spring.profesionapp.rest.response.ProfessionResponse;
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

@RequestMapping("Profession")

public class ProfesionControllerImpl  implements ProfesionController{
    
    @Autowired
    public ProfesionAppAdapter profesionapp;
    
    @Autowired
    public ProfesionRestMapper profesionRestMapper;
    
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
    @GetMapping("/darProfesiones")
    public List<ProfesionResponse> buscar() {
        
        List<Profession> personas = profesionapp.findAll(appDb);
	return profesionRestMapper.fromListProfesionToListProfesionResponse(personas);
    }
   

    @Override
    @PutMapping("/actualizarProfesion")
    public String actualizar(ProfesionPostRequest personaPostRequest) {
        Profession persona = profesionapp.findById(personaPostRequest.getId(),appDb);
         
        return profesionapp.edit(persona.getId(), persona, appDb);
    }

    @Override
    @GetMapping("/darProfesion")
    public ProfesionResponse buscarPorId(@RequestParam("id") Integer id) {
        Profession p = profesionapp.findById(id, appDb);
        return profesionRestMapper.fromProfessionToProfessionResponse(p);
    }

    @Override
    @DeleteMapping("/eliminarProfession")
    public boolean eliminar(@RequestParam("id") Integer id) {
        return profesionapp.remove(id, appDb);
    }

    @Override
    @PostMapping("/crearProfesion")
    public String crear(@RequestBody ProfesionPostRequest personaPostRequest) {
        Profession p = profesionRestMapper.fromProfessionPostRequestToProfession(personaPostRequest);
        return profesionapp.create(p, appDb);
    }

    
}
