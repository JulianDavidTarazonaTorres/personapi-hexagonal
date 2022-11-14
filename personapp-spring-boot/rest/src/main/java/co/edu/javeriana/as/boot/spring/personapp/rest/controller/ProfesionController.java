/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.controller;

import co.edu.javeriana.as.boot.spring.personapp.rest.request.ProfesionPostRequest;
import java.util.List;


import co.edu.javeriana.as.boot.spring.personapp.rest.response.ProfesionResponse;

/**
 *
 * @author aasanchez
 */

public interface ProfesionController {
	

	public List<ProfesionResponse> buscar();
        public ProfesionResponse buscarPorId(Integer id);
        public String crear(ProfesionPostRequest profesionRequest);
	public String actualizar(ProfesionPostRequest profesionRequest);
        public String eliminar(Integer id);
        public Integer contar();
    
}
