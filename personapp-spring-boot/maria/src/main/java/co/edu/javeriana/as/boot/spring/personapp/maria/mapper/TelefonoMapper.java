/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.mapper;


import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;

import co.edu.javeriana.as.boot.spring.personapp.maria.entity.TelefonoEntity;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 *
 * @author aasanchez
 */
@Component
public class TelefonoMapper {
    
   
    
    public TelefonoEntity toTelefonoEntityFromTelefono(Phone phone) {
        PersonaMapper personaMapper = new PersonaMapper();
        
        TelefonoEntity tel = new TelefonoEntity();
        tel.setNum(phone.getNumber());
        tel.setOper(phone.getProvider());
        tel.setDuenio(personaMapper.toPersonaEntityFromPersona(phone.getOwner()));
        return tel;
    }

    
    public List<Phone> toListTelefonoFromListTelefonoEntity(List<TelefonoEntity> findAll) {
        List<Phone> phones = new ArrayList<Phone>();
        for (TelefonoEntity TelefonoEntity : findAll) {
            phones.add(toTelefonoFromTelefonoEntity(TelefonoEntity));
        }
        return phones;
    }
    
    public List<TelefonoEntity> toListTelefonoEntityFromListTelefono(List<Phone> findAll){
        List<TelefonoEntity> phones = new ArrayList<TelefonoEntity>();
        for (Phone phone: findAll) {
            phones.add(toTelefonoEntityFromTelefono(phone));
        }
        return phones;
    }

    
    public Phone toTelefonoFromTelefonoEntity(TelefonoEntity TelefonoEntity) {
        PersonaMapper personaMapper = new PersonaMapper();
        
        Phone tel = new Phone();
        tel.setNumber(TelefonoEntity.getNum());
        tel.setProvider(TelefonoEntity.getOper());
        tel.setOwner(personaMapper.toPersonFromPersonaEntity(TelefonoEntity.getDuenio()));
        return tel;
    }
}
