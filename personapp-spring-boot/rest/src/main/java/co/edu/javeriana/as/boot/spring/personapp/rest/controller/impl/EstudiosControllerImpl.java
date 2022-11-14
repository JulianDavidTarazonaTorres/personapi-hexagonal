/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.controller.impl;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
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

@RequestMapping("Study")

public class EstudiosControllerImpl  implements EstudiosController{
    
    @Autowired
    public EstudiosAppAdapter Estudiosapp;
    
    @Autowired
    public EstudiosRestMapper EstudiosRestMapper;
    
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
    @GetMapping("/darEstudios")
    public List<EstudiosResponse> buscar() {
        
        List<Study> personas = Estudiosapp.findAll(appDb);
	return EstudiosRestMapper.fromListEstudiosToListEstudiosResponse(personas);
    }
   

    @Override
    @PutMapping("/actualizarEstudios")
    public String actualizar(EstudiosPostRequest personaPostRequest) {
        Study persona = Estudiosapp.findById(personaPostRequest.getIdProf(),personaPostRequest.getCcPer(),appDb);
         
        return Estudiosapp.edit(persona.getPerson().getId(),persona.getPofession().getId(), persona, appDb);
    }

    @Override
    @GetMapping("/darEstudio")
    public TelefonoResponse buscarPorId(@RequestParam("idCcPer") Integer idCcPer,@RequestParam("idProf") Integer idProf) {
        Study p = Estudiosapp.findById(idProf,idCcPer, appDb);
        return EstudiosRestMapper.fromTelefonoToTelefonoResponse(p);
    }

    @Override
    @DeleteMapping("/eliminarEstudio")
    public boolean eliminar(@RequestParam("idCcPer") Integer idCcPer,@RequestParam("idProf") Integer idProf) {
        return Estudiosapp.remove(idProf,idCcPer, appDb);
    }

    @Override
    @PostMapping("/crearEstudio")
    public String crear(@RequestBody TelefonoPostRequest personaPostRequest) {
        Study p = EstudiosRestMapper.fromTelefonoPostRequestToTelefono(personaPostRequest);
        return Estudiosapp.create(p, appDb);
    }

    
}
