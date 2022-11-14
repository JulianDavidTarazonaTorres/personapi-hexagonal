/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.mapper;

import java.util.List;


import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;

import co.edu.javeriana.as.boot.spring.personapp.rest.request.TelefonoPostRequest;
import co.edu.javeriana.as.boot.spring.personapp.rest.response.PersonaPostResponse;

import co.edu.javeriana.as.boot.spring.personapp.rest.response.TelefonoResponse;
import java.util.ArrayList;

/**
 *
 * @author aasanchez
 */
public class TelefonoRestMapper {

	public List<TelefonoResponse> fromListTelefonoToListTelefonoResponse(List<Phone> telefonos) {
		 List<TelefonoResponse> phones = new ArrayList<TelefonoResponse>();
        for (Phone telefono : telefonos) {
            phones.add(fromTelefonoToTelefonoResponse(telefono));
        }
        return phones;
	}

	public Phone fromTelefonoPostResquestToTelefono(TelefonoPostRequest telefonoPostRequest) {
		Phone telefono = new Phone();
                telefono.setNumber(telefonoPostRequest.getNumber());
                telefono.setProvider(telefonoPostRequest.getProvider());
                
		return telefono;
	}
        
        public TelefonoResponse fromTelefonoToTelefonoResponse(Phone telefono) {
		
                TelefonoResponse telefonoResponse = new TelefonoResponse();
                
                telefonoResponse.setNumber(telefono.getNumber());
                telefonoResponse.setProvider(telefono.getProvider());
                telefonoResponse.setDueno(telefono.getOwner().getId());
                
		return telefonoResponse;
	}

	public PersonaPostResponse fromAStringToPersonaPostResponse(String salida) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
