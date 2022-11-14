/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.PhonePortOutMaria;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.TelefonoEntity;
import co.edu.javeriana.as.boot.spring.personapp.maria.mapper.TelefonoMapper;
import co.edu.javeriana.as.boot.spring.personapp.maria.repository.TelefonoRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author aasanchez
 */
public class TelefonoPersistenceAdapter implements PhonePortOutMaria{

    @Autowired
    private TelefonoRepository telefonoRepository;
    
    @Autowired
    private TelefonoMapper telefonoMapper;

    @Override
    public String create(Phone phone) {
        TelefonoEntity telefono = telefonoMapper.toTelefonoEntityFromTelefono(phone);
        
        if(telefonoRepository.save(telefono)== null)
        {
            return "no se creo";
        }
        else
        {
            return "se creo";
        }
    }

    @Override
    public String edit(String number, Phone phone) {
        TelefonoEntity telefono = telefonoMapper.toTelefonoEntityFromTelefono(phone);

        TelefonoEntity result = telefonoRepository.findById(number).get();
        if(result != null){
            result.setDuenio(telefono.getDuenio());
            result.setNum(telefono.getNum());
            result.setOper(telefono.getOper());
            return "se creo";
        }
        else{
            return "no se creo";
        }
        
    }

    @Override
    public Boolean remove(String number) {
        telefonoRepository.deleteById(number);
        return true;
    }

    @Override
    public Phone findById(String number) {
        return telefonoMapper.toTelefonoFromTelefonoEntity(telefonoRepository.findById(number).get());
    }

    @Override
    public int count() {
        return (int) telefonoRepository.count();
    }

    @Override
    public List<Phone> findAll() {
        return telefonoMapper.toListTelefonoFromListTelefonoEntity(telefonoRepository.findAll());
    }
    
    

    
}
