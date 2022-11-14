/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.controller;

import co.edu.javeriana.as.boot.spring.personapp.rest.request.ProfesionPostRequest;
import co.edu.javeriana.as.boot.spring.personapp.rest.request.TelefonoPostRequest;
import java.util.List;


import co.edu.javeriana.as.boot.spring.personapp.rest.response.ProfesionResponse;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.TelefonoResponse;

/**
 *
 * @author aasanchez
 */

public interface TelefonoController {
	

	public List<TelefonoResponse> buscar();
        public TelefonoResponse buscarPorId(Integer id);
        public String crear(TelefonoPostRequest telefononRequest);
	public String actualizar(TelefonoPostRequest telefonoRequest);
        public String eliminar(Integer id);
        public Integer contar();
    
}
