/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.adapter;


import java.util.List;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;

import co.edu.javeriana.as.boot.spring.personapp.domain.port.in.PersonUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 *
 * @author aasanchez
 */

// este utiliza a los mappers
// el controlador utiliza a esta clase
@Component
public class PersonaAppAdapter implements PersonUseCase{
    
    @Autowired
    private PersonUseCase personUseCase;

    @Override
    public String create(Person person, Integer flag) {
        return personUseCase.create(person, flag);
    }

    @Override
    public String edit(Integer id, Person person, Integer flag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean remove(Integer id, Integer flag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Person findById(Integer id, Integer flag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int count(Integer flag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Person> findAll(Integer flag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
