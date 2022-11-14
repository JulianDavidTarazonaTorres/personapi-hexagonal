/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.telefonoapp.rest.controller.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.as.boot.spring.telefonoapp.domain.model.Phone;
import co.edu.javeriana.as.boot.spring.telefonoapp.domain.port.in.PhoneUseCase;
import co.edu.javeriana.as.boot.spring.telefonoapp.rest.adapter.TelefonoAppAdapter;

import co.edu.javeriana.as.boot.spring.telefonoapp.rest.controller.TelefonoController;
import co.edu.javeriana.as.boot.spring.telefonoapp.rest.mapper.TelefonoRestMapper;
import co.edu.javeriana.as.boot.spring.telefonoapp.rest.request.TelefonoPostRequest;
import co.edu.javeriana.as.boot.spring.telefonoapp.rest.response.TelefonoPostResponse;
import co.edu.javeriana.as.boot.spring.telefonoapp.rest.response.TelefonoResponse;
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

@RequestMapping("Phone")

public class TelefonoControllerImpl  implements TelefonoController{
    
    @Autowired
    public TelefonoAppAdapter telefonoapp;
    
    @Autowired
    public TelefonoRestMapper telefonoRestMapper;
    
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
    @GetMapping("/darTelefonos")
    public List<TelefonoResponse> buscar() {
        
        List<Phone> personas = telefonoapp.findAll(appDb);
	return telefonoRestMapper.fromListTelefonoToListTelefonoResponse(personas);
    }
   

    @Override
    @PutMapping("/actualizarTelefono")
    public String actualizar(TelefonoPostRequest personaPostRequest) {
        Phone persona = telefonoapp.findById(personaPostRequest.getId(),appDb);
         
        return telefonoapp.edit(persona.getNumber(), persona, appDb);
    }

    @Override
    @GetMapping("/darTelefono")
    public TelefonoResponse buscarPorId(@RequestParam("id") String id) {
        Phone p = telefonoapp.findById(id, appDb);
        return telefonoRestMapper.fromTelefonoToTelefonoResponse(p);
    }

    @Override
    @DeleteMapping("/eliminarTelefono")
    public boolean eliminar(@RequestParam("id") String id) {
        return telefonoapp.remove(id, appDb);
    }

    @Override
    @PostMapping("/crearTelefono")
    public String crear(@RequestBody TelefonoPostRequest personaPostRequest) {
        Phone p = telefonoRestMapper.fromTelefonoPostRequestToTelefono(personaPostRequest);
        return telefonoapp.create(p, appDb);
    }

    
}
