/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.controller;

import java.util.List;

import co.edu.javeriana.as.boot.spring.personapp.rest.request.PersonaPostRequest;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaPostResponse;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaResponse;

/**
 *
 * @author aasanchez
 */

public interface PersonaController {
	

	public List<PersonaResponse> buscar();
        public PersonaResponse buscarPorId();
        public String crear(PersonaPostRequest personaPostRequest);
	public String actualizar(PersonaPostRequest personaPostRequest);
        public String eliminar(Integer id);
        public Integer contar();
}
