/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.controller;

import co.edu.javeriana.as.boot.spring.personapp.rest.request.EstudioPostRequest;
import co.edu.javeriana.as.boot.spring.personapp.rest.request.ProfesionPostRequest;
import co.edu.javeriana.as.boot.spring.personapp.rest.request.TelefonoPostRequest;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.EstudioResponse;
import java.util.List;


import co.edu.javeriana.as.boot.spring.personapp.rest.response.ProfesionResponse;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.TelefonoResponse;

/**
 *
 * @author aasanchez
 */

public interface EstudioController {
	

	public List<EstudioResponse> buscar();
        public EstudioResponse buscarPorId(Integer id, Integer id2);
        public String crear(EstudioPostRequest estudioRequest);
	public String actualizar(EstudioPostRequest estudioRequest);
        public boolean eliminar(Integer id, Integer id2);
        public Integer contar();
    
}
