/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.mapper;

import java.util.List;


import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;

import co.edu.javeriana.as.boot.spring.personapp.rest.request.ProfesionPostRequest;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaPostResponse;

import co.edu.javeriana.as.boot.spring.personapp.rest.response.ProfesionResponse;
import java.util.ArrayList;

/**
 *
 * @author aasanchez
 */
public class ProfesionRestMapper {

	public List<ProfesionResponse> fromListProfesionToListProfesionResponse(List<Profession> profesiones) {
		 List<ProfesionResponse> professions = new ArrayList<ProfesionResponse>();
        for (Profession profesion : profesiones) {
            professions.add(fromProfesionToProfesionResponse(profesion));
        }
        return professions;
	}

	public Profession fromProfesionPostResquestToProfesion(ProfesionPostRequest profesionPostRequest) {
		Profession profesion = new Profession();
                profesion.setId(profesionPostRequest.getId());
                profesion.setName(profesionPostRequest.getName());
                profesion.setDescription(profesionPostRequest.getDescription());
                
		return profesion;
	}
        
        public ProfesionResponse fromProfesionToProfesionResponse(Profession profesion) {
		ProfesionResponse profesionResponse = new ProfesionResponse();
                profesionResponse.setId(profesion.getId());
                profesionResponse.setName(profesion.getName());
                profesionResponse.setDescription(profesion.getDescription());
                
		return profesionResponse;
	}

	public PersonaPostResponse fromAStringToProfesionPostResponse(String salida) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
