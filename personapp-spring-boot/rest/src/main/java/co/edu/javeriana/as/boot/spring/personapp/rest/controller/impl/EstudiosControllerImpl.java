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
import co.edu.javeriana.as.boot.spring.personapp.rest.adapter.EstudioAppAdapter;

import co.edu.javeriana.as.boot.spring.personapp.rest.controller.PersonaController;
import co.edu.javeriana.as.boot.spring.personapp.rest.controller.EstudioController;
import co.edu.javeriana.as.boot.spring.personapp.rest.mapper.PersonaRestMapper;
import co.edu.javeriana.as.boot.spring.personapp.rest.mapper.EstudioRestMapper;
import co.edu.javeriana.as.boot.spring.personapp.rest.request.PersonaPostRequest;
import co.edu.javeriana.as.boot.spring.personapp.rest.request.EstudioPostRequest;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaPostResponse;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaResponse;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.EstudioResponse;
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

public class EstudiosControllerImpl  implements EstudioController{
    
    @Autowired
    public EstudioAppAdapter Estudiosapp;
    
    @Autowired
    public EstudioRestMapper EstudiosRestMapper;
    
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
    public List<EstudioResponse> buscar() {
        
        List<Study> personas = Estudiosapp.findAll(appDb);
	return EstudiosRestMapper.fromListEstudioToListEstudioResponse(personas);
    }
   

    @Override
    @PutMapping("/actualizarEstudios")
    public String actualizar(EstudioPostRequest estudioPostRequest) {
        Study persona = Estudiosapp.findById(estudioPostRequest.getCcPer(),estudioPostRequest.getIdProf(),appDb);
         
        return Estudiosapp.edit(persona.getPerson(),persona.getPofession(), persona, appDb);
    }

    @Override
    @GetMapping("/darEstudio")
    public EstudioResponse buscarPorId(@RequestParam("idCcPer") Integer idCcPer,@RequestParam("idProf") Integer idProf) {
        List<Study> personas = Estudiosapp.findAll(appDb);
        Study estudio = null;
        for (Study p : personas) {
            if(p.getPerson().getId() == idCcPer && p.getPofession().getId() == idProf)
            {
                estudio = p;
            }
        }
        Study p = Estudiosapp.findById(estudio.getPerson(),estudio.getPofession(), appDb);
        return EstudiosRestMapper.fromEstudioToEstudioResponse(p);
    }

    @Override
    @DeleteMapping("/eliminarEstudio")
    public boolean eliminar(@RequestParam("idCcPer") Integer idCcPer,@RequestParam("idProf") Integer idProf) {
        List<Study> personas = Estudiosapp.findAll(appDb);
        Study estudio = null;
        for (Study p : personas) {
            if(p.getPerson().getId() == idCcPer && p.getPofession().getId() == idProf)
            {
                estudio = p;
            }
        }
        return Estudiosapp.remove(estudio.getPerson(),estudio.getPofession(), appDb);
    }

    @Override
    @PostMapping("/crearEstudio")
    public String crear(@RequestBody EstudioPostRequest personaPostRequest) {
        Study p = EstudiosRestMapper.fromEstudioPostRequestToEstudio(personaPostRequest);
        return Estudiosapp.create(p, appDb);
    }

	@Override
	public Integer contar() {
		List<Study> personas = Estudiosapp.findAll(appDb);
		return personas.size();
	}

    
}
