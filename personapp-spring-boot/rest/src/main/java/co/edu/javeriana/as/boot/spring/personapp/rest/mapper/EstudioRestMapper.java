/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.mapper;

import java.util.List;


import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import co.edu.javeriana.as.boot.spring.personapp.rest.request.EstudioPostRequest;

import co.edu.javeriana.as.boot.spring.personapp.rest.response.EstudioResponse;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaPostResponse;

import java.util.ArrayList;

/**
 *
 * @author aasanchez
 */
public class EstudioRestMapper {

	public List<EstudioResponse> fromListEstudioToListEstudioResponse(List<Study> estudios) {
            List<EstudioResponse> estudiosResponse = new ArrayList<EstudioResponse>();
            for (Study estudio : estudios) {
                estudiosResponse.add(fromEstudioToEstudioResponse(estudio));
            }
            return estudiosResponse;
            }

	public Study fromEstudioPostResquestToEstudio(EstudioPostRequest estudioPostRequest) {
		Study study = new Study();
                
                study.setUniverity(estudioPostRequest.getUniverity());
                study.setDate(estudioPostRequest.getDate());
                //buscar persona
                //buscar profesion
		return study;
	}
        
        public EstudioResponse fromEstudioToEstudioResponse(Study estudio) {
		EstudioResponse estudioResponse = new EstudioResponse();
                
                estudioResponse.setUniverity(estudio.getUniverity());
                estudioResponse.setDate(estudio.getDate());
                estudioResponse.setCcPer(estudio.getPerson().getId());
                estudioResponse.setIdProf(estudio.getPofession().getId());
                
		return estudioResponse;
	}

	public PersonaPostResponse fromAStringToEstudioPostResponse(String salida) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
